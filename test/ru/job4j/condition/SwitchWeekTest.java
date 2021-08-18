package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwitchWeekTest {

    @Test
    public void one() {
        int first = 1;
        String result = SwitchWeek.nameOfDay(first);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void two() {
        int first = 2;
        String result = SwitchWeek.nameOfDay(first);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
        Assert.assertEquals(expected, result);
    }
}