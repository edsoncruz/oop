package overrideSample;

public class Main {
    public static void main(String... args){
        CalculatorPlus calculator = new CalculatorPlus();

        System.out.println("int:" + calculator.sum(2,2));

        System.out.println("double:" + calculator.sum(2.0,2.0));

        System.out.println("string: " + calculator.sum("2","2"));

        System.out.println("power:" + calculator.power(4.0, 4.0));
    }

}
