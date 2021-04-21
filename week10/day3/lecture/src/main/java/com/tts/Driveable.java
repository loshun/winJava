package com.tts;

public interface Driveable {
    // this is my driveable interface for most if not all vehicles
    // anything that can be driven will
    // implement this interface
    // interfaces are needed when you expect changes in your program

    // these methods do not have a body
    // methods in interfaces do not have implementations
    void changeGear(int a);
    void accelerate(int a);
    void brake(int a);
}
