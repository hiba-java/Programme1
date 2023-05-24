package org.example;

public abstract class Tour {
    private Integer id ;
    private String nom;
    public Tour(String nom){
        this.nom = nom ;
    }
    public String getNom(){
        return this.nom;
    }

}
