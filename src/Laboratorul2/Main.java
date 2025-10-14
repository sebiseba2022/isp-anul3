package Laboratorul2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scoala scoala = new Scoala();
        scoala.clase = new HashMap<>();

        Clasa clasa1 = new Clasa();
        clasa1.numarClasa = NumarClasa.I;
        clasa1.litera = 'A';
        clasa1.capacitate = 30;
        clasa1.elev = new ArrayList<>();

        Clasa clasa2 = new Clasa();
        clasa2.numarClasa = NumarClasa.II;
        clasa2.litera = 'B';
        clasa2.capacitate = 25;
        clasa2.elev = new ArrayList<>();

        scoala.adaugaClasa(clasa1);
        scoala.adaugaClasa(clasa2);

        Elev elev1 = new Elev("Ion", Gen.Masculin);
        Elev elev2 = new Elev("Maria", Gen.Feminin);
        Elev elev3 = new Elev("Alex", Gen.Masculin);
        Elev elev4 = new Elev("Andrei", Gen.Masculin);
        Elev elev5 = new Elev("Andia", Gen.Feminin);


        scoala.adaugaElevInClasa(elev1, clasa1);
        scoala.adaugaElevInClasa(elev2, clasa1);
        scoala.adaugaElevInClasa(elev3, clasa2);
        scoala.adaugaElevInClasa(elev4, clasa2);
        scoala.adaugaElevInClasa(elev5, clasa2);

        // Afisare informatii despre scoala
        System.out.println("Numarul total de clase: " + scoala.getNumarClase());
        System.out.println("Numarul total de elevi: " + scoala.getTotalElevi());

        // Afisare clase si elevii lor
        System.out.println("\nDetalii clase:");
        for (Clasa clasa : scoala.clase.values()) {
            System.out.println("Clasa " + clasa.numarClasa + clasa.litera + ":");
            for (Elev e : clasa.elev) {
                System.out.println("- " + e.nume);
            }
            System.out.println();
        }

        // Creare activitati

        Profesor prof1 = new Profesor("Ioan Marian");
        Profesor prof2 = new Profesor("Andrei Dumitra");
        Activitate act1 = new Activitate("Sport", prof1);
        Activitate act2 = new Activitate("Muzica", prof2);
 Activitate act3 = new Activitate("Matematica", prof2);

        // Adaugare elevi in activitati
        act1.adaugaElev(elev1);
        act1.adaugaElev(elev2);
        act2.adaugaElev(elev2);
        act1.adaugaElev(elev4);
        act2.adaugaElev(elev5);
        act2.adaugaElev(elev1);
        act2.adaugaElev(elev3);

        // Afisare detalii activitati
        System.out.println("\nDetalii activitati:");
        for (Activitate activitate : new Activitate[]{act1, act2}) {
            System.out.println("Activitatea " + activitate.nume + " are " +
                    activitate.getTotalElevi() + " elevi:");
            for (Elev e : activitate.elev) {
                System.out.println("- " + e.nume);
            }
            System.out.println();
        }



        // Adaugare activitati in scoala
        scoala.adaugaActivitate(act1);
        scoala.adaugaActivitate(act3);
        scoala.adaugaActivitate(act2);

        // Afisare top activitati
        scoala.afiseazaTopActivitati();

        // Afisare numar elevi care participa la activitati
        System.out.println("Numarul de elevi care participa la cel putin o activitate: "
                + scoala.getEleviCuActivitati(scoala));

        // Test stergere student
        scoala.eliminaElevDupaNume(elev1, clasa1);

        // Test stergere clasa
        scoala.eliminaClasa(clasa2);

        // Afisare informatii despre scoala
        System.out.println("Numarul total de clase: " + scoala.getNumarClase());
        System.out.println("Numarul total de elevi: " + scoala.getTotalElevi());

    }
}


