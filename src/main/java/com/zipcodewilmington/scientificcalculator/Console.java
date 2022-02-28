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

//    public static Integer getIntegerInput(String prompt) {
//        Scanner scanner = new Scanner(System.in);
//        println(prompt);
//        Integer userInputI = scanner.nextInt();
//        return userInputI;
//    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double userInputD = scanner.nextDouble();
        return userInputD;
    }

    public static Double getDouble2Input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double userInputD2 = scanner.nextDouble();
        return userInputD2;
    }



}
