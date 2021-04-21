package com.tts;

import dealership.LightTruck;
import enumeration.Day;
import enumeration.EnumTest;
import enumeration.Vehicle;
import enumeration.VehicleClassification;

// a class is a blueprint to create an object
// an object is an instance of class
public class Main {

    public static void main(String[] args) {

        //creating an instance of vehicle
        Vehicle myVehicle = new Vehicle();
        System.out.println(myVehicle.wheels);
        // if the text is in purple then it's indicating the property is a field

        EnumTest weekday = new EnumTest(Day.MONDAY);
        weekday.weeekendOrWeekday();

        LightTruck myLightTruck = new LightTruck(true);
        System.out.println(myLightTruck.transferCase.getNumGears());

        myLightTruck.setVehicleClassification(VehicleClassification.NEW);


    }

}
