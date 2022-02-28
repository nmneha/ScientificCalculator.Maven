package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Basic;
import com.zipcodewilmington.scientificcalculator.Console;
import com.zipcodewilmington.scientificcalculator.MainApplication;
import com.zipcodewilmington.scientificcalculator.Scientific;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    Basic basicTest = new Basic();
    Scientific scientificTest = new Scientific();

    @Test
    public void addTest(){

        double d = 4.1,
                d2 = 10;
        double expected = 14.1;
        double actual = basicTest.add(d, d2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subTest(){
        double d = 4,
                d2 = 10;
        double expected = -6;
        double actual = basicTest.sub(d, d2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mulTest(){
        double d = 4,
                d2 = 10;
        double expected = 40;
        double actual = basicTest.mul(d, d2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divTest(){
        double d = 1,
                d2 = 4;
        double expected = .25;
        double actual = basicTest.div(d, d2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sqTest(){
        double d = 3;
        double expected = 9;
        double actual = basicTest.sq(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sqrtTest(){
        double d = 36;
        double expected = 6;
        double actual = basicTest.sqrt(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void powTest(){
        double d = 6,
                d2 = 4;
        double expected = 1296;
        double actual = basicTest.pow(d, d2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inexpoTest(){
        double d = 3;
        double expected = 0.3333333333333333 ;
        double actual = basicTest.inexpo(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sswitchTest(){
        double d = -3;
        double expected = 3 ;
        double actual = basicTest.sswitch(d);
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void radSinTest(){
        double d = 3;
        MainApplication.radDeg = 0;
        double expected = 0.1411200080598672 ;
        double actual = scientificTest.sin(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void degSinTest(){
        double d = 3;
        MainApplication.radDeg = 1;
        double expected = 0.05233595624294383 ;
        double actual = scientificTest.sin(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void radCosTest(){
        double d = 3;
        MainApplication.radDeg = 0;
        double expected = -0.9899924966004454 ;
        double actual = scientificTest.cos(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void degCosTest(){
        double d = 3;
        MainApplication.radDeg = 1;
        double expected = 0.9986295347545738 ;
        double actual = scientificTest.cos(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void radTanTest(){
        double d = 3;
        MainApplication.radDeg = 0;
        double expected = -0.1425465430742778 ;
        double actual = scientificTest.tan(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void degTanTest(){
        double d = 3;
        MainApplication.radDeg = 1;
        double expected = 0.052407779283041196 ;
        double actual = scientificTest.tan(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void radInvsinTest(){
        double d = 0.5;
        MainApplication.radDeg = 0;
        double expected = 0.5235987755982989 ;
        double actual = scientificTest.invsin(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void degInvsinTest(){
        double d = 0.5;
        MainApplication.radDeg = 1;
        double expected = 00.008726757025787037 ;
        double actual = scientificTest.invsin(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void radInvtanTest(){
        double d = 0.5;
        MainApplication.radDeg = 0;
        double expected = 0.4636476090008061 ;
        double actual = scientificTest.invtan(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void degInvtanTest(){
        double d = 0.5;
        MainApplication.radDeg = 1;
        double expected = 0.008726424746054184 ;
        double actual = scientificTest.invtan(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void radInvcosTest(){
        double d = 0.5;
        MainApplication.radDeg = 0;
        double expected = 1.0471975511965979 ;
        double actual = scientificTest.invcos(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void degInvcosTest(){
        double d = 0.5;
        MainApplication.radDeg = 1;
        double expected = 1.5620695697691096 ;
        double actual = scientificTest.invcos(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lnTest(){
        double d = 5;
        double expected = 1.6094379124341003 ;
        double actual = scientificTest.ln(d);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void log10Test(){
        double d = 5;
        double expected = 0.6989700043360189 ;
        double actual = scientificTest.log10(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invlog10Test(){
        double d = 3;
        double expected = 1000 ;
        double actual = scientificTest.invlog10(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invlnTest(){
        double d = 3;
        double expected = 20.085536923187668 ;
        double actual = scientificTest.invln(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialTest(){
        double d = 5;
        BigInteger expected = BigInteger.valueOf(120);
        BigInteger actual = scientificTest.factorial(d);
        Assert.assertEquals(expected, actual);
    }


}
