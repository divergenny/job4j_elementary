package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when35to521then16() {
        double expected = 16.12;
        int x1 = 3;
        int y1 = 5;
        int x2 = 5;
        int y2 = 21;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1624to96then19() {
        double expected = 19.31;
        int x1 = 16;
        int y1 = 24;
        int x2 = 9;
        int y2 = 6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when4414to816then36() {
        double expected = 36.05;
        int x1 = 44;
        int y1 = 14;
        int x2 = 8;
        int y2 = 16;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
