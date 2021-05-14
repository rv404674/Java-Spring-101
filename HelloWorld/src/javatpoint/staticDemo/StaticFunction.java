package javatpoint.staticDemo;

/***
 1. Static method belongs to the class rather than the object. Used to create utility functions
 2. Can be invoked without the need of creating an object.
 */

class Calc{
    public static int add(int x, int y){
        return x+y;
    }
}


public class StaticFunction {
    // Main is a static method.
    // If it were a non-static method, JVM creates an object first then call main()
    // method that will lead the problem of extra memory allocation.
    public static void main(String[] args){
        // NOTE: see add was called without creating an object.
        int tempSum = Calc.add(10,20);

    }
}
