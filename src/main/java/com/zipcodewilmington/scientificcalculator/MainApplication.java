package com.zipcodewilmington.scientificcalculator;

import sun.applet.Main;

import java.math.BigInteger;

import static com.zipcodewilmington.scientificcalculator.Console.Basic.add;
import static com.zipcodewilmington.scientificcalculator.Console.Basic.sub;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a command: add, subtract, multiply, divide,");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");
        Double d2 = Console.getDouble2Input("Enter a double.");

        Console.println("The user input %s as a command", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
        Console.println("The user input %s as a d2", d2);

        double displayNum = 0;
        BigInteger displayNumBig = BigInteger.valueOf(0);
        String displayText = null;

        if(s.equals("add")){
            displayNum = add(d,d2);
        } else if (s.equals("subtract")){
            displayNum = sub(d,d2);
        } else {
            displayNum = 7;
        }
        System.out.println(displayNum);
    }


}


