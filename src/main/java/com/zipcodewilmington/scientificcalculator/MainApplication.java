package com.zipcodewilmington.scientificcalculator;

import java.math.BigInteger;

import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static int radDeg = 0;
    public static double displayNum = (0);
    public static BigInteger displayNumBig = BigInteger.valueOf(0);
    public static String displayText = null;
    public static double memory = 0;


    public static void main(String[] args) {
        Scientific scientificCalc = new Scientific();
        Basic basicCalculator = new Basic();
        String s = Console.getStringInput("ON/OFF");
        while (!s.equals("OFF")) {
            Console.println("Welcome to my calculator!");
           s = Console.getStringInput("Enter a command: " +
                    "add, " +
                    "subtract, " +
                    "multiply, " +
                    "divide, " +
                    "rad, " +
                    "deg, " +
                    "san, " +
                    "cos, " +
                    "tan, " +
                    "ln, " +
                    "log, " +
                    "10^x, " +
                    "e^x, " +
                    "M+, " +
                    "MC, " +
                    "MRC, " +
                    "OFF.");
            // Integer i = Console.getIntegerInput("Enter an integer");
            double d = Console.getDoubleInput("Enter a double.");
            double d2 = Console.getDouble2Input("Enter a double.");

            // Console.println("The user input %s as a command", s);
            // Console.println("The user input %s as a integer", i);
            // Console.println("The user input %s as a d", d);
            // Console.println("The user input %s as a d2", d2);

//            double displayNum = (0);
//            BigInteger displayNumBig = BigInteger.valueOf(0);
//            String displayText = null;

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
            } else if (s.equals("cos")) {
                displayNum = scientificCalc.cos(d);
            } else if (s.equals("tan")) {
                displayNum = scientificCalc.tan(d);
            } else if (s.equals("ln")) {
                displayNum = scientificCalc.ln(d);
            } else if (s.equals("log")) {
                displayNum = scientificCalc.log10(d);
            } else if (s.equals("e^x")) {
                displayNum = scientificCalc.invln(d);
            } else if (s.equals("10^x")) {
                displayNum = scientificCalc.invlog10(d);
            }else if (s.equals("!")) {
                displayNumBig = scientificCalc.factorial(d);
            } else if (s.equals("rad")) {
                radDeg = 0;
            } else if (s.equals("deg")) {
                radDeg = 1;
            } else if (s.equals("M+")) {
                memory = displayNum;
            } else if (s.equals("MC")) {
                memory = 0;
            } else if (s.equals("clear")) {
                displayNum = 0;
            } else {
                displayNum = 0;
            }


            if (displayNum == Infinity) {
                System.out.println("err");
            } else if (Double.isNaN(displayNum)) {
                System.out.println("err");
            } else if (s.equals("!")) {
                System.out.println(displayNumBig);
            } else if (s.equals("get display")) {
                System.out.println(displayNum);
            } else if (s.equals("M+")) {
                System.out.println("memory updated");
            } else if (s.equals("MC")) {
                System.out.println("memory cleared");
            } else if (s.equals("MRC")) {
                System.out.println(memory);
            } else {
                System.out.println(displayNum);
            }

            if (s.equals("OFF")) {
                break;
            }

        }

    }
}


