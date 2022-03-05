package com;

public class Car {

    final String model, producer;
    byte doorAmount = 5;
    int horsePower = 60;



    int speed;
    boolean isTurnedOn = false;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public Car(String model, String producer, byte doorAmount) {
        this.model = model;
        this.producer = producer;
        this.doorAmount = doorAmount;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public byte getDoorAmount() {
        return doorAmount;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int accelerateTime(int sec){
        System.out.println("the car accelerates..");
         this.speed =+ sec * this.horsePower;
        return this.speed;
    }

    public int breakTime(int sec){
        System.out.println("the car slows down...");
         this.speed =- sec * 25;
         if(this.speed<=0){
             this.stop();
         }
        return this.speed;
    }

    public void stop(){
        this.speed = 0;
        System.out.println("The car is turned off");
    }

    public void start(){
        if(this.speed == 0 & this.isTurnedOn==false){
            System.out.println("Turned on the car");
        }
        else{
            System.out.println("The car is already working");
        }


    }


}
