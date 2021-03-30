package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwapBorderArray1to10Then10to1() {
        int[] testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = SwitchArray.swapBorder(testArray);
        int[] expected = new int[] {10, 2, 3, 4, 5, 6, 7, 8, 9, 1 };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1With5() {
        int[] testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = SwitchArray.swap(testArray, 1, 5);
        int[] expected = new int[] {5, 2, 3, 4, 1, 6, 7, 8, 9, 10 };
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2With8() {
        int[] testArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = SwitchArray.swap(testArray, 2, 8);
        int[] expected = new int[] {1, 8, 3, 4, 5, 6, 7, 2, 9, 10 };
        Assert.assertArrayEquals(expected, result);
    }
}