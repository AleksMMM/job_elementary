package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double dolg = amount + (amount * percent / 100);

        while (dolg > 0.0) {
               dolg -= salary;
                year++;
            }

        return year;
    }
}
