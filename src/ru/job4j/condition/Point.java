package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distance(Point point) {
        double calc = Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2);
        return Math.sqrt(calc);
    }



    public static void main(String[] args) {
        Point a1 = new Point(0, 0);
        Point a2 = new Point(2, 0);


        System.out.println("result (0, 0) to (2, 0) " + a1.distance(a2));

    }



}
