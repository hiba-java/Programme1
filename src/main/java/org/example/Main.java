package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Spectateur spectateur = new Spectateur();
        List<Tour> tours1 = new ArrayList();
        tours1.add(new TourAcrobatie("Marcher sur les mains"));
        tours1.add(new TourMusique("Jouer avec les cymbales"));

        List<Tour> tours2 = null;

        Singe  singe1 = new Singe(1,tours1);
        Singe  singe2 = new Singe (2,tours2);

       // le spectateur est un observateur
       singe1.addObserver(spectateur);
       singe2.addObserver(spectateur);

       Dresseur dresseur1 = new Dresseur(singe1);
       Dresseur dresseur2 = new Dresseur(singe2);

       dresseur1.demanderTour();
       dresseur2.demanderTour();


    }




}