package implementation;

import superclass.Duck;

public class RubberDuck extends Duck {


    @Override
    public void swim() {
        System.err.println("I can't swim :/");
    }

    @Override
    public void fly() {
        System.err.println("I can't fly :/");
    }
}
