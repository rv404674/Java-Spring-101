package javatpoint.generics;

import java.util.ArrayList;
import java.util.List;

// T denotes Type, E - Element
// Will only support numbers
class Container<T>{
    T value;

    public Container(T value) {
        this.value = value;
    }

    public void getType(){
        System.out.println(value.getClass().getName());
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }
}

public class Main {
    public static void main(String[] args){

        // NOTE: Java's main goal is to give you type safety
        // now we are defeating our purpose as we can give anything here..
        List name = new ArrayList();
        name.add("Rahul");
        name.add(1);
        // to get the value, we need to type cast first.
        String s = (String) name.get(0);

        // generics
        // we declared that name2 will be of type Integer.
        List<Integer> name2 = new ArrayList<Integer>();

        Container<String> container = new Container<String>("Rahul Verma");
        container.getType();

        Container<Integer> container1 = new Container<Integer>(20);
        container1.getType();

    }
}
