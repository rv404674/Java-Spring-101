package timbachulka.innerAbstractClassesInterfaces.inteface.InterfaceChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Players tim = new Players("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(5000);
        System.out.println(tim.toString());
        tim.setWeapon("Shield");
        saveObject(tim);
        loadObject(tim);
        System.out.println(tim.toString());
    }

    public static void saveObject(ISaveable iSaveable){
        List<String> values = iSaveable.save();
        for(int i=0; i<values.size(); i++)
            System.out.println("Saving " + values.get(i) + " to the disk");
        //players.save(values);
        // this method saves the value
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> value = readValues();
        objectToLoad.populate(readValues());
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
}
