package implementation;

import superclass.Duck;

public class RubberDuck extends Duck {


    @Override
    public void swim() {
        System.out.println("I can't swim :/");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly :/");
    }
}
