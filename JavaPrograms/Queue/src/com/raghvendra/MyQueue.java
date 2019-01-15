package com.raghvendra;

import java.util.Queue;

public class MyQueue {

    public Queue<Integer> addElement(Queue<Integer>queue, int element) {
        queue.add(element);
        return queue;
    }

    public int deleteElement(Queue<Integer>queue) {
        int removedElement = queue.remove();
        return removedElement;
    }

    public int peekHead(Queue<Integer>queue) {
        int peekElement = queue.peek();
        return peekElement;
    }

    public int pollHead(Queue<Integer>queue) {
        int head = queue.poll();
        return head;
    }

    public int queueSize(Queue<Integer>queue) {
        int size = queue.size();
        return size;
    }

}
