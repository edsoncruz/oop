package finalSample;

import overloadSample.Calculator;

public class CalculatorPlus extends Calculator {

    private static final String CONCATENATED_TEXT = "Concatenação de ";

    public double power(double a, double b){
        return Math.pow(a,b);
    }

    @Override
    public String sum(String a, String b) {
        return CONCATENATED_TEXT + a +" + "+ b +" = "+ a + b;
    }
}
