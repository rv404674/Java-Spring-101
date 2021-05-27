package timbachulka.innerAbstractClassesInterfaces.AbstractClasses;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // NOTE:
    // these methods need to be implemented by the classes that inherit from animal class
    // in inheritance, it wasn't mandatory to implement some funciton in base class.
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
