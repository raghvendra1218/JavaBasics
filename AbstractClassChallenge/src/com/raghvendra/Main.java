package com.raghvendra;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
	    String stringData = "Darwin Brisbane Sydney Tikunia Nighasan Behraich PhoolBhaed Brisbane";
	    String [] data = stringData.split(" ");
	    for (String s : data) {
	        //create new item with value set to the string
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        System.out.println(("================="));
	    list.removeItem(new Node("Nighasan"));
        list.removeItem(new Node("Behraich"));
        System.out.println(("================="));
        list.traverse(list.getRoot());
    }
}
