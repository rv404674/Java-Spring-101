package javatpoint.generics;

import java.util.ArrayList;
import java.util.List;

// Wild Card in Generics
// <? extends Number>,
// it means any child class of number, float, int, string
abstract class Shape{
    abstract  void draw();
}

class Circle extends Shape{
    void draw(){
        System.out.println("CIRCLE");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("square is drawing");
    }
}

public class GenericTest {
    // now this will accept arguments only as Circle and Square, as they inherit Shape
    public static void generateShapes(List<? extends Shape> lists){
        for (Shape e:lists){
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        List<Square> list1 = new ArrayList<Square>();
        list1.add(new Square());

        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());

        generateShapes(list1);
    }
}
