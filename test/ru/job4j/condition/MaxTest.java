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

    @Test
    public void whenMax25To3To6Then25() {
        int one = 25;
        int two = 3;
        int three = 6;
        int result = Max.max(one, two, three);
        int expected = 25;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To5To7Then7() {
        int one = 4;
        int two = 5;
        int three = 7;
        int result = Max.max(one, two, three);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax25To3To6To40Then25() {
        int one = 25;
        int two = 3;
        int three = 6;
        int four = 40;
        int result = Max.max(one, two, three, four);
        int expected = 40;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax25To35To6To6Then25() {
        int one = 25;
        int two = 35;
        int three = 6;
        int four = 6;
        int result = Max.max(one, two, three, four);
        int expected = 35;
        Assert.assertEquals(result, expected);
    }
}