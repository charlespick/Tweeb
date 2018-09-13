package com.PretzelStudios;

public class Rockets {
    public static void printRivets() {
        System.out.println(" +------+  +------+ ");
    }

    public static void printCone() {
        System.out.println("    /\\        /\\   ");
        System.out.println("   /  \\      /  \\  ");
        System.out.println("  /    \\    /    \\ ");
    }

    public static void printBody() {
        for (int i = 0; i < 2; i++) {
            System.out.println(" |      |  |      |");
        }
    }

    public static void printLogoBody() {
        System.out.println(" |United|  |United|");
        System.out.println(" |States|  |States|");
    }

    public static void print2Rockets() {
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

}
