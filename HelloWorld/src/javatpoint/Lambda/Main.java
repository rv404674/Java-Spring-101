package javatpoint.Lambda;

import java.util.ArrayList;


interface A {
    void show(int i);
}

class XYZ implements A{
    public void show(int i){
        System.out.println("HELLO WORLD" + i);
    }
}


public class Main {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Rahul");
        list.add("verma");

        for (String s: list){
            System.out.println(s);
        }

        list.forEach(i -> System.out.print(i)); // Lamdjda
        list.forEach(System.out::println);

        // NOTE: we have created an inner class
        A obj;
        obj = new A(){
            public void show(int i){
                System.out.println("hello" + i);
            }
        };
        obj.show(6);

       // we can simply do this as well.
       // lamdda expressions - functions that exist in isolation. They can be treated as values.
        A obj2;
        obj2 = (int i) -> System.out.println("hello" + i);
        obj2.show(10);

    }
}
