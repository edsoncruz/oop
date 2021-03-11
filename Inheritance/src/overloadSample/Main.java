package overloadSample;

public class Main {
    public static void main(String... args){
        Calculator calculator = new Calculator();

        System.out.println("int:" + calculator.sum(2,2));

        System.out.println("double:" + calculator.sum(2.0,2.0));

        System.out.println("String:" + calculator.sum("2","2"));
    }

}
