package com.PretzelStudios;

public class StopSigns {
    public static void writeTheSigns() {
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
    }


    private static void writeTop() {
        System.out.println("  _______  ");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }

    private static void writeBottom() {
        System.out.println("\\         /  ");
        System.out.println(" \\_______/");
    }

     private static void writeMiddle() {
        System.out.println("+---------+");
    }
}
