package com.PretzelStudios;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("/ \\ // \\\\ /// \\\\\\");

        System.out.println("\\ / \\\\ // \\\\\\ /// ?");

        StopSigns.writeTheSigns();


        String str = "This is a sentence";
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(str.length() - 5));

        long firstNum = 1;
        long secondNum = 2;
        long thirdNum;
        System.out.println(firstNum);
        System.out.println(secondNum);
        int i = 0;
        while (i < 100) {
            thirdNum = firstNum + secondNum;
            System.out.println(thirdNum);
            firstNum = secondNum;
            secondNum = thirdNum;
            i = i + 1;
        }

        Rockets.print2Rockets();

        convertTemps();
        System.out.println('e'-'A');

    }

    public static void convertTemps() {
        System.out.println("36f is: " + Temperatures.convertToC(36) + "C");
        System.out.println("13c is: " + Temperatures.convertToF(13) + "F");
    }



}
