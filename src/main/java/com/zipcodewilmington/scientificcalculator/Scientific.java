package com.zipcodewilmington.scientificcalculator;

import java.math.BigInteger;

public class Scientific {

    public double sin(double d) {
        if(MainApplication.radDeg == 0) {
            return java.lang.Math.sin(d);
        } else {
            d = Math.toRadians(d);
            return java.lang.Math.sin(d);
        }
    }

    public  double cos(double d) {
        if(MainApplication.radDeg == 0) {
            return java.lang.Math.cos(d);
        } else {
            d = Math.toRadians(d);
            return java.lang.Math.cos(d);
        }
    }

    public  double tan(double d) {
        if(MainApplication.radDeg == 0) {
            return java.lang.Math.tan(d);
        } else {
            d = Math.toRadians(d);

            return java.lang.Math.tan(d);
        }
    }

    public  double invsin(double d) {
        if(MainApplication.radDeg == 0) {
            return java.lang.Math.asin(d);
        } else {
            d = Math.toRadians(d);

            return java.lang.Math.asin(d);
        }
    }

    public  double invtan(double d) {
        if(MainApplication.radDeg == 0) {
            return java.lang.Math.atan(d);
        } else {
            d = Math.toRadians(d);
            return java.lang.Math.atan(d);
        }
    }

    public  double invcos(double d) {
        if(MainApplication.radDeg == 0) {
            return java.lang.Math.acos(d);
        } else {
            d = Math.toRadians(d);
            return java.lang.Math.acos(d);
        }
    }

    public  double ln(double d) {

        return java.lang.Math.log(d);
    }

    public  double log10(double d) {

        return java.lang.Math.log10(d);
    }

    public  double invlog10(double d) {

        return java.lang.Math.pow(10, d);
    }

    public  double invln(double d) {

        return java.lang.Math.exp(d);
    }

    public  BigInteger factorial(double d) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= d; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));
        return factorial;
    }

}

