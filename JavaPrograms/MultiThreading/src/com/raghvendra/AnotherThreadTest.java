package com.raghvendra;

import static junit.framework.Assert.*;

public class AnotherThreadTest {

    @org.junit.Test
    public void sum() {
        AnotherThread thread = new AnotherThread();
        int[] arr = {2,3,4};
        int actualSum = thread.sum(arr);
        assertEquals(9,actualSum);
    }
}
