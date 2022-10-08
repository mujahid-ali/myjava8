package com.company;

import com.company.interfaceenhancement.defaultmethod.CarJava8;
import com.company.interfaceenhancement.defaultmethod.VehicleJava8;

public class Main {

    public static void main(String[] args) {
	// write your code here
        VehicleJava8 vehicleJava8 = new CarJava8();
        vehicleJava8.details();
        vehicleJava8.printDefault();
        vehicleJava8.testingDefault();
    }
}
