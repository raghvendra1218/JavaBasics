package com.raghvendra._static;

public class StaticTest {
    public static int numInstances = 0;
    public final int numInstancesFinal;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
        numInstancesFinal = numInstances;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
