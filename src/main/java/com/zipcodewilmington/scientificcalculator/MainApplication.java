package com.zipcodewilmington.scientificcalculator;

import sun.applet.Main;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");
        Double d2 = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
        Console.println("The user input %s as a d", d2);
    }
    public static class Basic extends MainApplication {

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

    public static class Scientific extends MainApplication {

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

    }

}

