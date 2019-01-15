package com.raghvendra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player raghav = new Player("Raghav", 10, 15, "Gun");
        System.out.println(raghav.toString());
        saveObject(raghav);
        raghav.setHitPoints(8);
        System.out.println(raghav);
        System.out.println("getting the list item: " + raghav.getName());
        raghav.setWeapon("Sword");
        saveObject(raghav);
        loadObject(raghav);
        System.out.println(raghav);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println( "Choose\n"+
                "1 to Enter a String\n"+
                "0 to quit.");
        while(!quit){
            System.out.print("Choose an action: ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.println("Enter a String: ");
                    String stringInput = scanner.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving "+ objectToSave.write().get(i)+ " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        List<String> values = readValues();
        objectToLoad.read(values);
    }
}
