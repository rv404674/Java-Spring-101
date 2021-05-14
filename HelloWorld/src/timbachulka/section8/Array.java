package timbachulka.section8;

import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);

    public int findAverage(){
        int[] myIntegers = getIntegers(5);
        int tSum = 0;
        for(int x:myIntegers){
            tSum +=x;
        }

        return tSum/5;
    }

    public int[] getIntegers(int n){
        System.out.println("Enter" + n + "Integers");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextByte();
        }
        return arr;

    }
}
