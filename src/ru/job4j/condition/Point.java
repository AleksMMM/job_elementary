package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public Point(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }


    public double distance(Point point) {
        double calc = Math.pow((point.x2 - point.x1), 2) + Math.pow((point.y2 - point.y1), 2);
        return Math.sqrt(calc);
    }



    public static void main(String[] args) {
        Point a = new Point(0, 0, 2, 0);

        System.out.println("result (0, 0) to (2, 0) " + a.distance(a));

    }



}
