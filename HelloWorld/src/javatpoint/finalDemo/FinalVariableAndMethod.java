package javatpoint.finalDemo;

// NOTE:
// if a variable is declared final, its value can't be changed

public class FinalVariableAndMethod {
    final int speedLimit=90;

    void run(){
        // wil throw error
        // speedLimit = 100;
        System.out.println(speedLimit);
    }
}

// NOTE:
// if a method is made final you can't override it
// if you make a class final you can't extend it.
class A{
    final void show(){
        System.out.println("RAHUL VERMA");
    }
}

class B extends A {
    // @Override
    // will give error
    // final void show(){}
    void show2() {
        System.out.println("DFSFS");
    }
}


