package com.raghvendra;

public abstract class ListItem {
    private int next;
    private int previous;

    public abstract void nextItem();
    public abstract void previousItem();
    public abstract int compareTo();
}
