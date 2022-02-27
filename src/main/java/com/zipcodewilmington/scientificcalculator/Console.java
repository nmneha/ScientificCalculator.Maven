package com.zipcodewilmington.scientificcalculator;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }

    public static class Basic extends Console {

        public static double add(double d, double d2) {
            return d + d2;
        }
        public static double sub(double d, double d2) {
            return d - d2;
        }
        public static double mul(double d, double d2) {
            return d * d2;
        }
        public static double div(double d, double d2) {
            return d / d2;
        }
        public static double sq(double d) {
            return d * d;
        }
        public static double sqrt(double d) {
            return java.lang.Math.sqrt(d);
        }

        public static double pow(double d, double d2) {
            return java.lang.Math.pow(d, d2);
        }

        public static double inexpo(double d) {
            return 1 / d;
        }
        public static double sswitch(double d) {
            return d * -1;
        }

    }

    public static class Scientific extends Console {

        String s;
       if (s.equals("rad")) {
           int radDeg = 0;
        } else if(s.equals("deg")) {
           int radDeg = 1;
        }


        public static double sin(double d) {
            return java.lang.Math.sin(d);
        }

        public static double cos(double d) {
            return java.lang.Math.cos(d);
        }

        public static double tan(double d) {
            return java.lang.Math.tan(d);
        }

        public static double invsin(double d) {
            return java.lang.Math.asin(d);
        }

        public static double invtan(double d) {
            return java.lang.Math.atan(d);
        }

        public static double invcos(double d) {
            return java.lang.Math.acos(d);
        }

        public static double ln(double d) {
            return java.lang.Math.log(d);
        }

        public static double log10(double d) {
            return java.lang.Math.log10(d);
        }

        public static double invlog10(double d) {
            return java.lang.Math.pow(10, d);
        }

        public static double invln(double d) {
            return java.lang.Math.exp(d);
        }

        public static BigInteger factorial(double d) {
            BigInteger factorial = BigInteger.ONE;
            for (int i = 2; i <= d; i++)
                factorial = factorial.multiply(BigInteger.valueOf(i));
            return factorial;
        }

    }

}
