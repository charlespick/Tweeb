package com.PretzelStudios;

public class Rockets {
    private static void printRivets() {
        System.out.println(" +------+  +------+ ");
    }

    private static void printCone() {
        System.out.println("    /\\        /\\   ");
        System.out.println("   /  \\      /  \\  ");
        System.out.println("  /    \\    /    \\ ");
    }

    private static void printBody() {
        for (int i = 0; i < 2; i++) {
            System.out.println(" |      |  |      |");
        }
    }

    private static void printLogoBody() {
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
