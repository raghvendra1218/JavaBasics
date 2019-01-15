package com.raghvendra;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MyStack mystack = new MyStack();
        Stack<Integer> stack = new Stack<Integer>();
        int value, choice, position;
        boolean quit = false;
        char cont;
        while (!quit) {
            System.out.println("Menu: ");
            System.out.println("1. Add the Element to the Stack.");
            System.out.println("2. Remove the Element from the Stack.");
            System.out.println("3. Check the current Top Element of the Stack.");
            System.out.println("4. Display the elements in the Stack");
            System.out.println("5. Size of the Stack");
            System.out.println("6. Search an element in Stack.");
            System.out.println("Enter the choice from the Menu: ");
            choice = scanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Enter the element to be added to Stack: ");
                    value = scanner.nextInt();
                    Stack<Integer> st = mystack.addElement(stack,value);
                    System.out.println("Element entered and the stack is: " + st);
                    break;

                case 2:
                    if(mystack.stackSize(stack) == 0){
                        System.out.println("Stack is empty, please add some elements and then remove.");
                        continue;
                    }
                    System.out.println("Element "+mystack.deleteElement(stack) + " removed from the Stack.");
                    break;

                case 3:
                    if(mystack.stackSize(stack) == 0){
                        System.out.println("Stack is empty, please add some elements and then check the stack.");
                        continue;
                    }
                    System.out.println(mystack.peekElement(stack) + " is the top element the Stack.");
                    break;
                case 4:
                    if(mystack.stackSize(stack) == 0){
                        System.out.println("Stack is empty, please add some elements and then check the stack.");
                        continue;
                    }
                    System.out.println("Elements in the stack are: " + stack);
                    break;
                case 5:
                    System.out.println("Size of the stack is :" + mystack.stackSize(stack));
                    break;
                case 6:
                    System.out.println("Enter the element you want to search in Stack: ");
                    value = scanner.nextInt();
                    position = mystack.searchElement(stack,value);
                    if(position == -1) {
                        System.out.println("Entered element is not present in the Stack.");
                    } else {
                        System.out.println("Entered element is present at " + position + " position");
                    }
                    break;
                default:
                    System.out.println("Enter a valid choice, Please try again.");
                    continue;
            }
            System.out.println("Do you want to continue(Y/N): ");
            cont = scanner.next().charAt(0);
            if(cont == 'Y' || cont == 'y') {
                quit = false;
            } else if (cont == 'N' || cont == 'n') {
                quit = true;
            } else {
                System.out.println("Enter the valid input");
            }
        }
        scanner.close();
    }
}
