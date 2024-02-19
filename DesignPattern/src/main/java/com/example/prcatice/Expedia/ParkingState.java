package com.example.prcatice.Expedia;

import java.util.Date;

public interface ParkingState {

    boolean entry(Vehicle vehicle);

    void exit(Vehicle vehicle);
}
