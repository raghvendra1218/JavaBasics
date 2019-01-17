package com.raghvendra;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null){
            //The List was empty, so the list item becomes the head of the list
            this.root = newItem;
            return true;
        }

        ListItem currentItem =  this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0){
                //The newItem is greater than the currentItem, move right , if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
//                    newItem.setNext(null);
                    return true;
                }
            } else if(comparison > 0) {
                // The newItem is smaller than the current item, add newItem prior to this node
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(newItem);
                    newItem.setPrevious(currentItem.previous());
                    newItem.setNext(currentItem);
                    currentItem.setPrevious(newItem);
                } else {
                    // Node is root node, we need to insert new item as root node
                    newItem.setNext(this.root);
                    this.root.setPrevious(newItem);
//                    newItem.setNext(this.root);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue()+" already exists in the List, item not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(this.root == null) {
            System.out.println("List is empty. " + item + " cannot be removed.");
            return false;
        }
        ListItem currentItem = this.root;
        while(currentItem !=null){
            int comparison = currentItem.compareTo(item);
            if(comparison == 0){
                //Item found, which needs to be removed
                if(currentItem == this.root){
                    this.root = currentItem.next();
                } else if(currentItem.next() == null) {
                    currentItem.previous().setNext(null);
                    currentItem.setPrevious(null);
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    currentItem.next().setPrevious(currentItem.previous());
                    currentItem.setPrevious(null);
                    currentItem.setNext(null);
                }
                return true;
            } else {
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    System.out.println(item.getValue() +" not found in the List.");
                    return false;
                }
            }
        }
        return false;
    }


    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("List is empty.");
        } else {
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
