package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int first = 3;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int first = 4;
        int second = 4;
        int result = Max.max(first, second);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax7To1Then7() {
        int first = 4;
        int second = 7;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax9To0Then9() {
        int first = 4;
        int second = 7;
        int third = 0;
        int fourth = 9;
        int result = Max.max(first, second, third, fourth);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}
