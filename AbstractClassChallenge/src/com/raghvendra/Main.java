package com.raghvendra;

public class Main {

    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList(null);
//        list.traverse(list.getRoot());
//	    String stringData = "Darwin Brisbane Sydney Tikunia Nighasan Behraich PhoolBhaed Brisbane";
//	    String [] data = stringData.split(" ");
//	    for (String s : data) {
//	        //create new item with value set to the string
//            list.addItem(new Node(s));
//        }
//        list.traverse(list.getRoot());
//        System.out.println(("================="));
//	    list.removeItem(new Node("Nighasan"));
//        list.removeItem(new Node("Behraich"));
//        System.out.println(("================="));
//        list.traverse(list.getRoot());

        //Binary Tree Code
        MySearchTree tree = new MySearchTree(null);
        tree.traverse(tree.getRoot());
        String stringData = "5 6 7 1 0 2 3 8 4 9";
        String [] data = stringData.split(" ");
        for(String a: data){
            //Add nodes to tree
            tree.addItem(new Node(a));
        }
        tree.traverse(tree.getRoot());
        tree.removeItem(new Node("3"));
        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());
    }
}
