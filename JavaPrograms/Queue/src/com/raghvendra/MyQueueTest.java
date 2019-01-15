package com.raghvendra;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.Assert.*;

public class MyQueueTest {

    @org.junit.Test
    public void addElement() {
        MyQueue myqueue = new MyQueue();
        Queue<Integer> queue = new LinkedList<Integer>();
        myqueue.addElement(queue,2);
        myqueue.addElement(queue,34);
        Queue<Integer> expectedqueue = new LinkedList<Integer>();
        expectedqueue.add(2);
        expectedqueue.add(34);
        assertEquals(expectedqueue,queue);

    }

    @org.junit.Test
    public void deleteElement() {
        MyQueue myqueue = new MyQueue();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(2);
        queue.add(45);
        myqueue.deleteElement(queue);
        Queue<Integer> expectedQueue = new LinkedList<Integer>();
        expectedQueue.add(45);
        assertEquals(expectedQueue,queue);
    }

    @org.junit.Test
    public void peekHead() {
        MyQueue myqueue = new MyQueue();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(23);
        int head = myqueue.peekHead(queue);
        assertEquals(23, head);
    }

    @org.junit.Test
    public void pollHead() {
        MyQueue myqueue = new MyQueue();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(56);
        queue.add(34);
        int head = myqueue.pollHead(queue);
        assertEquals(56,head);
    }

    @org.junit.Test
    public void queueSize() {
        MyQueue myqueue = new MyQueue();
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(23);
        queue.add(34);
        queue.add(56);
        queue.add(78);
        int size = myqueue.queueSize(queue);
        assertEquals(4,size);
    }
}
