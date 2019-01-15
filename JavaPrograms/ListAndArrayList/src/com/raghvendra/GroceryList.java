package com.raghvendra;

import java.util.ArrayList;

public class GroceryList {
//    private int[] numbers;
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryitems(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in the List");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position  = searchForItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position,newItem);
        }
        else {
            System.out.println("Item not present in the List, try something from the given List");
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        String oldItem = groceryList.get(position);
        groceryList.set(position,newItem);
        System.out.println("Item " + oldItem + " has been modified." );
    }

    public void removeGroceryItem(String item) {
        int position  = searchForItem(item);
        if(position >=0) {
            removeGroceryItem(position);
        }
        else {
            System.out.println("Item " + item + " is not present in the List");
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Item " + theItem + " has been removed from the List.");
    }

    public boolean findGroceryItem(String item) {
        int position = groceryList.indexOf(item);
        if(position >= 0){
            return true;
        } else {
            return false;
        }
    }

    private int searchForItem(String item) {
//        if(groceryList.contains(item)) {
//            System.out.println(item + " is present in the List.");
//        }
        int position = groceryList.indexOf(item);
        return position;
    }
}
