package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax6To3Then6() {
        int left = 6;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax25To3Then25() {
        int left = 25;
        int right = 25;
        int result = Max.max(left, right);
        int expected = 25;
        Assert.assertEquals(result, expected);
    }
}