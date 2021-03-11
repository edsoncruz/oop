import implementation.EletronicDuck;
import implementation.RealDuck;
import implementation.RubberDuck;
import superclass.Duck;

public class Main {
    public static void main(String[] args) {
        Duck duck = new EletronicDuck();

        duck.quack();
        duck.swim();
        duck.fly();
    }
}
