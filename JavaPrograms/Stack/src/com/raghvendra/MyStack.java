package com.raghvendra;

import java.util.Stack;

public class MyStack {

    public Stack<Integer> addElement(Stack<Integer>stack, int element ) {
        stack.push(element);
        return stack;
    }

    public int deleteElement(Stack<Integer>stack) {
        int delelement = stack.pop();
        return delelement;
    }

    public int peekElement(Stack<Integer>stack) {
        int topElement = stack.peek();
        return topElement;
    }

    public int searchElement(Stack<Integer>stack, int element) {
        int position = stack.search(element);
        return position;
    }

    public int stackSize(Stack<Integer>stack) {
        int size = stack.size();
        return size;
    }
}
