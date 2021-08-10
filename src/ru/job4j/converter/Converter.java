package ru.job4j.converter;

public class Converter {

    public static double rubleToEuro(int value) {
        return (double) value / 70;
    }

    public static double rubleToDollar(int value) {
        return (double) value / 60;
    }

    public static void main(String[] args) {

        double euro = rubleToEuro(140);
        double dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("140 rubles are " + dollar + " dollar");

    }
}


