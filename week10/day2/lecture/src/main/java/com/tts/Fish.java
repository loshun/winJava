package com.tts;
import java.util.*;

public class Fish extends Animal {

    public Fish (String name, String cry){
        super(name, cry);
    }

    public void doSwim() {
        System.out.println("this fish swam");
    }
}
