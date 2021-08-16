package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void when01to21then14() {
        Point point = new Point();
        double expected = 1.41;
        double out = point.distance(0, 1, 2, 1);
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);

    }

    @Test
    void when00to20then2() {
        Point point = new Point();
        double expected = 2;
        double out = point.distance(0, 0, 2, 0);
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);

    }

    @Test
    void when00to30then3() {
        Point point = new Point();
        double expected = 3;
        double out = point.distance(0, 0, 3, 0);
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);

    }
}