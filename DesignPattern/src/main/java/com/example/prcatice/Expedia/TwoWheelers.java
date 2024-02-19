package com.example.prcatice.Expedia;

public class TwoWheelers extends Vehicle implements ParkingState{

    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {

        this.type = "Two Wheeler";
    }

    @Override
    public boolean entry(Vehicle vehicle) {
        return false;
    }

    @Override
    public void exit(Vehicle vehicle) {

    }
}
