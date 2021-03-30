package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumNumbersFromZeroToTenThen55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromThreeToEightThen33() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromOneToEightyThen3240() {
        int start = 1;
        int finish = 80;
        int result = Counter.sum(start, finish);
        int expected = 3240;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromSevenToFortyThen799() {
        int start = 7;
        int finish = 40;
        int result = Counter.sum(start, finish);
        int expected = 799;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromOneToOneThen0() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}