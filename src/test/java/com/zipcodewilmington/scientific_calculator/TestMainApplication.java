package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.MainApplication;
import org.testng.Assert;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;

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



}
