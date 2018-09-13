package com.PretzelStudios;

public abstract class Temperatures {

    public static double convertToF(double c) {
        return (c / .5556) + 32;
    }

    public static double convertToC(double f) {
        return (f - 32) * 0.5556;
    }

}
