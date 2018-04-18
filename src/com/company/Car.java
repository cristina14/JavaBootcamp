package com.company;

public final class Car extends Vehicle {
    private String transmission = "manual";

    public Car(){

    }

    public Car(int age, long numberOfMiles, boolean isDiesel,String transmission) {
        super(age,numberOfMiles,isDiesel);
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }


}
