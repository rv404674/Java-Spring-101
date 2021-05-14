package timbachulka.section8;

public class Main {

    public static void main(String[] args){
        // NOTE: Array
        // created an empty array of 10 elements
        int[] myIntArray = new int[10];
        myIntArray[0] = 10;
        myIntArray[1] = 20;

        for (int i=0; i<myIntArray.length; i++){
            myIntArray[i] = i*10;
        }

        // another way to initialize
        int[] myIntArray2 = {10, 20, 30, 40};
        System.out.println(myIntArray2[2]);

        Array array = new Array();
        System.out.println("Average is" + array.findAverage());
    }

    // THis method will take input from user and will type

}
