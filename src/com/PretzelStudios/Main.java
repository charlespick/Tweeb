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
