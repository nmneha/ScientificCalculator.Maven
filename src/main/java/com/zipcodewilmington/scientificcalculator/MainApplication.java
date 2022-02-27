package com.zipcodewilmington.scientificcalculator;

import java.math.BigInteger;

import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static int radDeg = 0;

    public static void main(String[] args) {
        Scientific scientificCalc = new Scientific();
        Basic basicCalculator = new Basic();
        String s = "on";
        while (!s.equals("off")) {
            Console.println("Welcome to my calculator!");
            s = Console.getStringInput("Enter a command: add, subtract, multiply, divide,");
            // Integer i = Console.getIntegerInput("Enter an integer");
            double d = Console.getDoubleInput("Enter a double.");
            double d2 = Console.getDouble2Input("Enter a double.");

            // Console.println("The user input %s as a command", s);
            // Console.println("The user input %s as a integer", i);
            // Console.println("The user input %s as a d", d);
            // Console.println("The user input %s as a d2", d2);

            double displayNum = 0;
            BigInteger displayNumBig = BigInteger.valueOf(0);
            String displayText = null;

            if (s.equals("add")) {
                displayNum = basicCalculator.add(d, d2);
            } else if (s.equals("subtract")) {
                displayNum = basicCalculator.sub(d, d2);
            } else if (s.equals("multiply")) {
                displayNum = basicCalculator.mul(d, d2);
            } else if (s.equals("divide")) {
                displayNum = basicCalculator.div(d, d2);
            } else if (s.equals("square")) {
                displayNum = basicCalculator.sq(d);
            } else if (s.equals("square root")) {
                displayNum = basicCalculator.sqrt(d);
            } else if (s.equals("exponent")) {
                displayNum = basicCalculator.pow(d, d2);
            } else if (s.equals("sin")) {
                displayNum = scientificCalc.sin(d);
            } else if (s.equals("rad")) {
                radDeg = 0;
            } else if (s.equals("deg")) {
                radDeg = 1;
            } else {
                displayNum = 7;
            }

            if (displayNum == Infinity) {
                System.out.println("err");
            } else if (Double.isNaN(displayNum)) {
                System.out.println("err");
            } else {
                System.out.println(displayNum);
            }
        }
    }
}


