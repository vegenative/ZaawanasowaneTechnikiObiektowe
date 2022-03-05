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

        Human me = new Human();
        me.pet = Azor;
        me.pet.feed();
        System.out.println(me.pet.getWeight());

        Car hummel = new Car("Coupe","Hyundai", (byte) 3);
        me.car = hummel;
        me.car.start();
        me.car.accelerateTime(10);
        System.out.println(me.car.getSpeed());
        me.car.accelerateTime(24);
        System.out.println(me.car.getSpeed());
        me.car.start();
        me.car.breakTime(20);
    }
}
