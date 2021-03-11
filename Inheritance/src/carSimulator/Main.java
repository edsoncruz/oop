package carSimulator;

public class Main {
    public static void main(String... args){
        Car car = new Car();

        car.speedUp(80);
        car.speedUp(0.5);

        car = new Ferrari();
        car.speedUp(290);
        car.speedUp(1.0);
    }
}
