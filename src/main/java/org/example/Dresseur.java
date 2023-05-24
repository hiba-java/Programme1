package org.example;

public class Dresseur {
     private Integer id ;
     private Singe singe ;

     // Le dresseur contient un singe
    public Dresseur(Singe singe ){
         this.singe = singe ;
    }
     // Le dresseur demande à son singe d'exécuter ses tours
    public void demanderTour(){
        this.singe.executeTour();
    }
}
