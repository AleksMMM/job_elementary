package ru.job4j.loop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }
    @Test
    public void whenSumEvenNumbersFromTwoTo12ThenThirty() {
        int start = 2;
        int finish = 12;
        int result = Counter.sumByEven(start, finish);
        int expected = 42;
        Assert.assertEquals(expected, result);
    }
}