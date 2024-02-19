package com.example.prcatice.Expedia;



public class Main {

    // parking system
    // three type vehicles 2-4
    //capacity 50 - 50
    // parking not availabe
    //
    //

    /*
    * Parking Space
    *
    *
    *
    * vehicle --
    * vehicle no
    * entry time
    *
    *
    * */

    public static void main(String[] args) {
        Vehicle vehicle = new TwoWheelers();
        vehicle.setVehicleNo("UO23");
        ParkingState parkingState = new ParkingStateImpl(vehicle);
        parkingState.entry(vehicle);
        //parkingState.exit();
    }


}
