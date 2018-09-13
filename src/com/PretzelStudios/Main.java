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

print2Rockets();




    }

public static void printRivets() {
    System.out.println(" +------+  +------+ ");
}
public static void printCone() {
    System.out.println("    /\\        /\\   ");
    System.out.println("   /  \\      /  \\  ");
    System.out.println("  /    \\    /    \\ ");
    }
public static void printBody() {
    for (int i = 0; i<2 ; i++){
        System.out.println(" |      |  |      |");
    }
}
public static void printLogoBody() {
    System.out.println(" |United|  |United|");
    System.out.println(" |States|  |States|");
}
    public static void print2Rockets(){
printCone();
printRivets();
printBody();
printRivets();
printLogoBody();
printRivets();
printBody();
printRivets();
printCone();

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
