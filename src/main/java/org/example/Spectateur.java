package org.example;

import java.util.Optional;

public class Spectateur implements Observer {
    // Classe Spectateur (Observer)

    private Integer id;

    public String applaudir(Tour tour,Singe singe){
      StringBuilder str = new StringBuilder();
      str.append("spectateur applaudit pendant le tour d'acrobatie '");
      str.append(tour !=null ? tour.getNom() : "");
      str .append("' du singe ");
      str.append(singe!=null ? singe.getId() : "" );
       return str.toString();
    }

    public String siffler(Tour tour,Singe singe){
        StringBuilder str = new StringBuilder();
        str.append("spectateur siffle pendant le tour d'acrobatie '");
        str.append(tour !=null ? tour.getNom() : "");
        str .append("' du singe ");
        str.append(singe!=null ? singe.getId() : "" );
        return str.toString();
    }
    // Méthode update sera exécuter aprés notification de la classe Singe : Selon le type d'action que le singe effectue il y'aura une réaction du spectateur

    @Override
    public String update(Tour tour,Singe singe) {

        if(Optional.ofNullable(tour).filter(TourAcrobatie.class::isInstance).isPresent()){
            return applaudir(tour ,singe);
    }

     return Optional.ofNullable(tour).filter(TourMusique.class::isInstance).isPresent() ? siffler(tour, singe) : "" ;

    }
}
