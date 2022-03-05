package com;
import java.lang.String;

public class Animal {

    final String species;

    public double getWeight() {
        return weight;
    }

    private Double weight;


    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public void feed(){
        this.weight += 1;
    }

    public void takeForAWalk(){
        this.weight -=1;
        if(this.weight <= 0) System.out.println("Zwierzę nie żyje");
    }


}
