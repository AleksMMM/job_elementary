package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {


    public double distance(int x1, int x2, int y1, int y2) {
        double calc = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        return Math.sqrt(calc);
    }



    public static void main(String[] args) {
        Point a = new Point();

        System.out.println("result (0, 0) to (2, 0) " + a.distance(0, 0,2, 0));

    }



}
