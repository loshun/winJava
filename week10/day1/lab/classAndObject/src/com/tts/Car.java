package com.tts;

public class Car {
    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car (String make, String model)
    {
        this.make = "Toyota";
        this.model = "Camry";
    }

    public Car (String make, String model, int year)
    {
        this.make = "Toyota";
        this.model = "Highlander";
        this.year = 2021;
    }

    public static boolean areModelsEqual(Car c1, Car c2)
    {
        boolean myBool = c1.getModel() == c2.getModel();
        System.out.println(myBool);
        return c1.getModel() == c2.getModel();
    }

    public void vehicle (String make)
    {
        System.out.println("I have a " + make + " parked out back!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
