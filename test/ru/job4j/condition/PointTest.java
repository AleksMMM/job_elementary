package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void distance() {
        Point point = new Point(0, 1, 2, 1);
        double expected = 1.41;
        double out = point.distance(point);
        double delta = 0.01;
        Assert.assertEquals(expected, out, delta);

    }
}