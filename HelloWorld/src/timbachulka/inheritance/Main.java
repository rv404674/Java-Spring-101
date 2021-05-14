package timbachulka.inheritance;

public class Main {
    public static void main(String[] args){
        Animal animal = new Animal();
        Dog dog = new Dog("rubu", 30, "golden", 1);

        animal.eat();
        dog.eat();
        System.out.println(dog.getName());

        System.out.println(dog.toString());
        System.out.println(animal.toString());

        dog.walk();
        dog.run();
    }
}
