package com.raghvendra;

import org.junit.Assert;

public class MainTest {

    @org.junit.Test
    public void reverse() {
        int[] Originalarr = {12,13,14,15};
        int[] reversedArr = Main.reverse(Originalarr);
        int[] expectedArr= {15,14,13,12};
        Assert.assertArrayEquals(expectedArr,reversedArr);
    }
}
