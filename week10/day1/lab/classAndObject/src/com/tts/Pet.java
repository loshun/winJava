package com.tts;


public class Pet {

    private String name;
    private int age;
    private String location;
    private String type;

    //default constructor
    public Pet() {
        name = "";
        age = 0;
        location = "";
        type = "";
    }

    // mutate constructor
    public Pet(String n, int a, String l, String t) {
        name = n;
        age = a;
        location = l;
        type = t;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "King";
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = 2;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = "Home";
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
