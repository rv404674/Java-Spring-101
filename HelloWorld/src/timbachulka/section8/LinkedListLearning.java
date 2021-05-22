package timbachulka.section8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListLearning {
    public static void main(String[] args){
        LinkedList<String> placesList = new LinkedList<String>();
        placesList.add("sydney");
        placesList.add("canberra");
        placesList.add("delhi");
        placesList.add("london");

        // add is O(1) for linked list
        printList(placesList);
        System.out.println(placesList.toArray());
        placesList.add(1, "bombay");

        printList(placesList);
        int x = "Rahul".compareTo("Sachin");
        // 1, if string is greateer than passed arguement.

    }

    private static void printList(LinkedList<String> placesList){
        Iterator<String> iterator = placesList.iterator();
        while (iterator.hasNext()){
            // iterator.next() will first give value and then will move to next node..
            System.out.println("value: " + iterator.next());
        }
    }

    private static boolean addInOrder(LinkedList<String> placeList, String newCity){
        ListIterator<String> listIterator = placeList.listIterator();

        while(listIterator.hasNext()){
            int comparison = listIterator.next().compareTo(newCity);
            if(comparison==0){
                System.out.println("String already exists");
                return false;
            }else if(comparison>0) {
                // pointer has already moved.
                listIterator.previous();
                listIterator.add(newCity);
                return true;
            }else{
                // move on the next city
            }
        }
        listIterator.add(newCity);
        return true;
    }
}
