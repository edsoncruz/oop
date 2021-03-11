package implementation;

import superclass.Duck;

public class EletronicDuck extends Duck {


    @Override
    public void swim() {
        System.out.println("Perform swim!");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly :/");
    }
}
