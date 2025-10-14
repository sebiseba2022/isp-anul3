package Laboratorul2;

import java.util.List;

public class Clasa {
    int capacitate;
    NumarClasa numarClasa;
    char litera;
    List<Elev> elev;

    void adaugaElev(Elev e){
        elev.add(e);
    }
    void eliminaElev(Elev e){
        elev.remove(e);
    }
    int getTotalElevi(){
        int i=0;
        for(Elev e : elev)
            i++;

        return i;
    }


}
