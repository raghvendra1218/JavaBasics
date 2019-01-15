package com.raghvendra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstrunctions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstrunctions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    modifyItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Enter valid choice");
                    break;
            }
        }
    }
    public static void printInstrunctions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print the choice options.");
        System.out.println("\t 1 - To print the Grocery List items");
        System.out.println("\t 2 - To add the item in the List");
        System.out.println("\t 3 - To remove the item in the List.");
        System.out.println("\t 4 - To modify the item in the List");
        System.out.println("\t 5 - To Search an item in the list");
        System.out.println("\t 6 - To quit from the application.");
    }

    public static void addItem() {
        System.out.print("enter the item to be added in the List: ");
        groceryList.addGroceryitems(scanner.nextLine());
    }

    public static  void removeItem() {
        System.out.println("Enter the item to be removed: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void modifyItem() {
        System.out.println("Enter the item to be modified: ");
        String currItem = scanner.nextLine();
        System.out.println("Enter the new item name: ");
        String newItemName = scanner.nextLine();
        groceryList.modifyGroceryItem(currItem, newItemName);
    }

    public static void searchItem() {
        System.out.println("Enter the item to be searched: ");
        String itemSearched = scanner.nextLine();
        boolean itemPresent = groceryList.findGroceryItem(itemSearched);
        if(itemPresent) {
            System.out.println("Item "+ itemSearched + " is present in the List.");
        } else {
            System.out.println("Item "+ itemSearched + " is not present in the List");
        }
    }

    public static void processArrayList() {
        List<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
}
