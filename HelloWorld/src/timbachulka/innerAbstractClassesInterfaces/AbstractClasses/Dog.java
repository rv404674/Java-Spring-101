package timbachulka.innerAbstractClassesInterfaces.AbstractClasses;

public class Dog extends  Animal{
    public Dog(String name) {
        super(name);
    }

    // NOTE:
    // Abstract vs interface
    // interface is complete abstract, you need to implement all the methods defined in the interface
    // but in case of Abstract class, you can mix regular and abstract classes.
    @Override
    public void eat() {
        System.out.println(getName() + "is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in breathe out, repeat");
    }
}
