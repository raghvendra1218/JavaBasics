package com.raghvendra;

import java.util.Stack;

import static org.junit.Assert.*;

public class MyStackTest {

    @org.junit.Test
    public void addElement() {
        MyStack myStack = new MyStack();
        Stack<Integer> stack = new Stack<Integer>();
        myStack.addElement(stack,23);
        myStack.addElement(stack,56);
        Stack<Integer> expectedstack = new Stack<Integer>();
        expectedstack.add(23);
        expectedstack.add(56);
        assertEquals(stack,expectedstack);
    }

    @org.junit.Test
    public void deleteElement() {
        MyStack myStack = new MyStack();
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(67);
        stack.add(89);
        int deletedElement = myStack.deleteElement(stack);
        assertEquals(89,deletedElement);
    }

    @org.junit.Test
    public void peekElement() {
        MyStack myStack = new MyStack();
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(87);
        stack.add(90);
        int peekElement = myStack.peekElement(stack);
        int expectedElement = stack.peek();
        assertEquals(expectedElement,peekElement);
    }

    @org.junit.Test
    public void searchElement_Present() {
        MyStack myStack = new MyStack();
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(45);
        stack.add(56);
        stack.add(90);
        int position = myStack.searchElement(stack,56);
        int expectedPosition = stack.search(56);
        assertEquals(expectedPosition,position);
    }

    @org.junit.Test
    public void searchElement_notPresent() {
        MyStack myStack = new MyStack();
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(20);
        stack.add(45);
        stack.add(78);
        int position = myStack.searchElement(stack,80);
        int expectedPosition = stack.search(80);
        assertEquals(expectedPosition,position);
    }

    @org.junit.Test
    public void stackSize() {
        MyStack myStack = new MyStack();
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(40);
        stack.add(25);
        stack.add(18);
        int size = myStack.stackSize(stack);
        int expectedSize = stack.size();
        assertEquals(expectedSize,size);
    }
}