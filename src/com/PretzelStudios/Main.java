package com.PretzelStudios;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("/ \\ // \\\\ /// \\\\\\");
        writeTop();
        writeBottom();
        System.out.println();
        writeBottom();
        writeMiddle();
        System.out.println();
        writeTop();
        System.out.println("|  STOP   |");
        writeBottom();
        System.out.println();
        writeTop();
        writeMiddle();
        System.out.println("\\ / \\\\ // \\\\\\ /// ?");
<<<<<<< HEAD
<<<<<<< HEAD


        String str = "This is a sentence";

        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(str.length() - 5));

        int firstNum = 1;
        int secondNum = 2;
        int thirdNum;

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


=======
>>>>>>> aa6305e299e4eff0a9565f5865cda9d7b7643d3d
=======
>>>>>>> aa6305e299e4eff0a9565f5865cda9d7b7643d3d
    }


    public static void writeTop() {
        System.out.println("  _______  ");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    public static void writeBottom() {
        System.out.println("\\         /  ");
        System.out.println(" \\_______/");
    }

    public static void writeMiddle() {
        System.out.println("+---------+");
    }

}
