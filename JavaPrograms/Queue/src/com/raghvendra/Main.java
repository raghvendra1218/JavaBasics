package com.raghvendra;

//import java.util.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();
        MyQueue queue =  new MyQueue();
        int value, choice;
        char cont;
        boolean quit = false;

        while(!quit) {
            System.out.println("Menu: ");
            System.out.println("1. Add the Element to the queue.");
            System.out.println("2. Remove the Element from the queue.");
            System.out.println("3. Check the current Head Element of the queue.");
            System.out.println("4. Display the elements in the queue");
            System.out.println("5. Size of the queue");
            System.out.println("6. Poll from queue.");
            System.out.println("Enter the choice from the Menu: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element you want to add: ");
                    value = scanner.nextInt();
                    Queue<Integer> qu = queue.addElement(q,value);
                    System.out.println("Queue: " + qu);
                    break;
                case 2:
                    System.out.println("Element " + queue.deleteElement(q) + " was removed");
                    break;
                case 3:
                    System.out.println("Current value of the Head is "+ queue.peekHead(q));
                    break;
                case 4:
                    System.out.println("Elements of the queue are :"+ q);
                    break;
                case 5:
                    System.out.println("Size of the queue is: "+ queue.queueSize(q));
                    break;
                case 6:
                    System.out.println("Head is removed and the value was " + queue.pollHead(q));
                    break;
                default:
                    System.out.println("Incorrect choice entered. Please try again");
                    continue;
            }

            System.out.println("Do you want to continue (Y/N): ");
            cont = scanner.next().charAt(0);
            if (cont == 'Y' || cont == 'y') {
                quit = false;
            } else if(cont == 'N' || cont == 'n'){
                quit = true;
            } else {
                System.out.println("Enter the correct Input.");
            }
        }
        scanner.close();
    }
}
