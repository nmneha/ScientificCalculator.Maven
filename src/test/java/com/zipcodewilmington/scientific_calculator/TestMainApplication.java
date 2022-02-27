package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigInteger;

/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    MainApplication.Basic basic = new MainApplication.Basic();

    @Test
    public void addTest(){

        double d = 4.1,
                d2 = 10;
        double expected = 14.1;
        double actual = basic.add(d, d2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subTest(){
        double d = 4,
                d2 = 10;
        double expected = -6;
        double actual = basic.sub(d, d2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mulTest(){
        double d = 4,
                d2 = 10;
        double expected = 40;
        double actual = basic.mul(d, d2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divTest(){
        double d = 1,
                d2 = 4;
        double expected = .25;
        double actual = basic.div(d, d2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sqTest(){
        double d = 3;
        double expected = 9;
        double actual = basic.sq(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sqrtTest(){
        double d = 36;
        double expected = 6;
        double actual = basic.sqrt(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void powTest(){
        double d = 6,
                d2 = 4;
        double expected = 1296;
        double actual = basic.pow(d, d2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void inexpoTest(){
        double d = 3;
        double expected = 0.3333333333333333 ;
        double actual = basic.inexpo(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sswitchTest(){
        double d = -3;
        double expected = 3 ;
        double actual = basic.sswitch(d);
        Assert.assertEquals(expected, actual);
    }

    MainApplication.Scientific scientific = new MainApplication.Scientific();

    @Test
    public void sinTest(){
        double d = 3;
        double expected = 0.1411200080598672 ;
        double actual = scientific.sin(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void cosTest(){
        double d = 3;
        double expected = -0.9899924966004454 ;
        double actual = scientific.cos(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tanTest(){
        double d = 3;
        double expected = -0.1425465430742778 ;
        double actual = scientific.tan(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invsinTest(){
        double d = 0.5;
        double expected = 0.5235987755982989 ;
        double actual = scientific.invsin(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invtanTest(){
        double d = 0.5;
        double expected = 0.4636476090008061 ;
        double actual = scientific.invtan(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invcosTest(){
        double d = 0.5;
        double expected = 1.0471975511965979 ;
        double actual = scientific.invcos(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lnTest(){
        double d = 5;
        double expected = 1.6094379124341003 ;
        double actual = scientific.ln(d);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void log10Test(){
        double d = 5;
        double expected = 0.6989700043360189 ;
        double actual = scientific.log10(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invlog10Test(){
        double d = 3;
        double expected = 1000 ;
        double actual = scientific.invlog10(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void invlnTest(){
        double d = 3;
        double expected = 20.085536923187668 ;
        double actual = scientific.invln(d);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void factorialTest(){
        double d = 5;
        BigInteger expected = BigInteger.valueOf(120);
        BigInteger actual = scientific.factorial(d);
        Assert.assertEquals(expected, actual);
    }


}
