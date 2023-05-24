package org.example;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Singe extends Observable{
    // Classe Singe (Observable)

    private Integer id;
    private List<Tour> tours ;

    public Singe(int id,List<Tour>listTour){
        this.id =id;
        this.tours = listTour;

    }
    public List<Tour> getListTour(){
        return this.tours;
    }
    public Integer getId(){
        return this.id;
    }
    // Le spectateur sera notifié pour chaque tour effectué par le singe ,
    public void executeTour(){

        Optional.ofNullable(tours)
                .orElseGet(Collections::emptyList)
                .stream()
                .filter(Objects::nonNull).forEach(tour -> notifyObservers(tour, this));

    }
}
