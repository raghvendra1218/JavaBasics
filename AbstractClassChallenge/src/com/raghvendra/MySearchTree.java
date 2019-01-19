package com.raghvendra;

public class MySearchTree implements NodeList {
    private ListItem root = null;

    public MySearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        //Tree is empty, so the first element becomes the root of the tree.
        if(this.root == null){
            this.root = newItem;
            return true;
        }

        //otherwise start comparing from the head of the tree
        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0){
                //newItem is greater, move right if possible
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if(comparison > 0) {
                //newItem is lesser, move left if possible
                if(currentItem.previous() != null){
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue()+" is already present.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(root == null) {
            System.out.println("Tree is empty");
            return false;
        }
        System.out.println("Deleting item: "+ item.getValue());
        ListItem currentItem =  this.root;
        ListItem parentItem = currentItem;
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison < 0){
                //item is greater than current item, move right if possible
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if(comparison > 0){
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // match found remove this item
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent){
        //remove item from the tree
        if(item.next() == null){
            // There is no right tree for item
            if(parent.next() == item){
                parent.setNext(item.previous());
            } else if(parent.previous() == item){
                parent.setPrevious(item.previous());
            } else {
                // currentItem and Parent are same and the node is root node
                this.root = item.previous();
            }
        } else if(item.previous() == null){
            // There is no left tree for item
            if(parent.next() == item){
                parent.setNext(item.next());
            } else if(parent.previous() == item){
                parent.setPrevious(item.next());
            } else {
                // currentItem and Parent are same and the node is root node
                this.root = item.next();
            }
        } else {
            //neither left nor right are null
            //From the right sub-tree , find the smallest value (i.e the leftmost)
            ListItem current = item.next();
            ListItem parentLeftMost = item;
            while(current.previous() != null){
                parentLeftMost = current;
                current = current.previous();
            }
            //check if the positions of parentLeftmost and current changed or not
            if(parentLeftMost == item) {
                //there is no left sub-tree in the right sub-tree of the node to be deleted.
                //we will copy the value of the current node to the item node &
                //set the item's next to current next which will in turn free the current node.
                item.setValue(current.getValue());
                item.setNext(current.next());
            } else {
                // there is left sub-tree in the right sub-tree of the node to be deleted.
                // and in this instance of time parentLeftMost will be immediate predecessor of current node
                // and current node will at the leftmost node of the right sub-tree
                // we will copy the value of the current node to the item node (which ideally needs to deleted, but we will delete the current node).
                // and set the previous of parentLeftMost to the next of the current node (which may or may not be null depends on the tree, but we are
                // sure that previous of current is null if that has not been the case while loop above would have not broken/exited).
                item.setValue(current.getValue());
                parentLeftMost.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        //recursive method
        if(root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }

    }
}
