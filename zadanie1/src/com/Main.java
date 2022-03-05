package com;

public class Main {
    public static void main(String[] args) {
        Animal Azor = new Animal("Labrador",12.0);
        Azor.feed();
        System.out.println(Azor.getWeight());
        Azor.takeForAWalk();

        while(Azor.getWeight()>0){
            Azor.takeForAWalk();
            System.out.println(Azor.getWeight());
        }
    }
}
