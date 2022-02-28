package com.zipcodewilmington.scientificcalculator;

public class Basic {

    public double add(double d, double d2) {

        return d + d2;
    }
    public double sub(double d, double d2) {

        return d - d2;
    }
    public double mul(double d, double d2) {
        return d * d2;
    }
    public double div(double d, double d2) {
        return d / d2;
    }
    public double sq(double d) {
        return d * d;
    }
    public double sqrt(double d) {
        return java.lang.Math.sqrt(d);
    }

    public double pow(double d, double d2) {
        return java.lang.Math.pow(d, d2);
    }

    public double inexpo(double d) {
        return 1 / d;
    }
    public double sswitch(double d) {
        return d * -1;
    }
}
