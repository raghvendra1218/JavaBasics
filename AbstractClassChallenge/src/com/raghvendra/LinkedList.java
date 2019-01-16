package com.raghvendra;

public class LinkedList extends ListItem {
    private Node head;

//    public LinkedList(Node head) {
//        this.head = head;
//    }

    @Override
    public void nextItem() {

    }

    @Override
    public void previousItem() {

    }

    @Override
    public int compareTo() {
        return 0;
    }

    class Node {
        ListItem data;
        Node next;

        public Node(ListItem data) {
            this.data = data;
        }
    }

    public boolean addItem(ListItem newItem, LinkedList linkedList){
        
    }
}
