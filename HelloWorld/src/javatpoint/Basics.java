package javatpoint;

public class Basics {
    public static void main(String[] args){
        System.out.println("Hello World");

        int age = 20;
        if (age>18){
            System.out.println("Rahul Verma is the best");
        }

        int num=13;
        if (num%2 == 0){
            System.out.print("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        // using ternary operator
        int number=40;
        String output = (number%2 == 0)?"Even Number":"Odd Number";
        System.out.println(output);

        int month = 1;
        String monthString = "";
        switch (month){
            case 1: monthString = "1 - January";
            break;
            case 2: monthString = "2 - February";
            break;
            default: System.out.println("NO month");
        }

        for(int i=1; i<10 ;i++){
            System.out.println(i);
        }

        for (int i=1; i<10;i++){
            for (int j=i+1; j<10;j++){
                System.out.println(j);
            }
        }

        // for each in Java
        int arr[] = {12, 45, 78, 90, 100};
        for (int i:arr){
            System.out.println(i);
        }

        int i = 5;
        while(i<=10){
            System.out.println(i);
            i+=1;
        }


    }
}
