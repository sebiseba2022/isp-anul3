package Laboratorul2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Activitate {
    String nume;
    Profesor profesor;

    List<Elev> elev;
    Set<Elev> setElev;

    void adaugaElev(Elev e){
        elev.add(e);
        setElev.add(e);
    }

    void eliminaElev(Elev e) {
        elev.remove(e);
        setElev.remove(e);
    }
    int getTotalElevi(){
        int i=0;
        for(Elev e : elev)
            i++;
        return i;
    }

    Activitate(String nume, Profesor profesor){
        this.nume = nume;
        this.profesor = profesor;
        this.elev = new ArrayList<>();
        this.setElev = new HashSet<>();
    }

    Activitate() {
        this.nume = "Activitate in proiectare";
        this.profesor = new Profesor("Fara Profesor");
        this.elev = new ArrayList<>();
        this.setElev = new HashSet<>();
    }


}
