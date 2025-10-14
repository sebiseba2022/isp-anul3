package Laboratorul2;

import java.util.*;

public class Scoala {
    Map<String, Clasa> clase;
    Map<String,Activitate> activitati;

    public Scoala() {
        clase = new HashMap<>();
        activitati = new HashMap<>();
    }

    void adaugaClasa(Clasa c){
        clase.put(c.numarClasa.toString(), c);
    }
    void eliminaClasa(Clasa c){
        clase.remove(c.numarClasa.toString());
    }
    void adaugaElevInClasa(Elev e, Clasa c){
        c.adaugaElev(e);
    }
    void eliminaElevDupaNume(Elev e, Clasa c)
        {
        c.eliminaElev(e);
        }
        int getNumarClase(){
            return clase.size();
        }
        int getTotalElevi(){
            int i=0;
            for(Clasa c : clase.values())
                i+=c.getTotalElevi();
            return i;
        }

    void adaugaActivitate(Activitate a) {
        activitati.put(a.nume, a);
    }

    void eliminaActivitate(Activitate a) {
        activitati.remove(a.nume);
    }
    void afiseazaActivitati(){
        for(Activitate a : activitati.values())
            System.out.println(a.nume);
    }
    void afiseazaEleviiClasa(Clasa c){
        for(Elev e : c.elev)
            System.out.println(e.nume);
    }

    void afiseazaTopActivitati() {
        List<Activitate> listaActivitati = new ArrayList<>(activitati.values());
        listaActivitati.sort((a1, a2) -> Integer.compare(a2.getTotalElevi(), a1.getTotalElevi()));

        System.out.println("Top activitati dupa numarul de elevi:");
        for (Activitate a : listaActivitati) {
            System.out.println(a.nume + ": " + a.getTotalElevi() + " elevi");
        }
    }
    public int getEleviCuActivitati(Scoala scoala) {
        Set<Elev> eleviUnici = new HashSet<>();
        for (Activitate activitate : scoala.activitati.values()) {
            eleviUnici.addAll(activitate.setElev);
        }
        return eleviUnici.size();
    }

}
