package com.example.prcatice.Expedia;

public class ParkingStateImpl implements ParkingState{

    private final Vehicle vehicle;

    public ParkingStateImpl(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    @Override
    public boolean entry(Vehicle vehicle) {
        int count=vehicle.getCount();
        if(count>50){
            return false;
        }
        else {
            vehicle.setCount(count--);
            return true;
        }

    }

    @Override
    public void exit(Vehicle vehicle) {

    }
}
