package overrideSample;

import overloadSample.Calculator;

public class CalculatorPlus extends Calculator {


    public double power(double a, double b){
        return Math.pow(a,b);
    }

    @Override
    public String sum(String a, String b) {
        return "Concatenação de " + a +" + "+ b +" = "+ a + b;
    }
}

