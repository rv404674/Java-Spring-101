package timbachulka.inheritance;

// you can access public method of Animal class
public class Dog extends Animal{
    private String fur;
    private int tail;

    public Dog(String name, int weight, String fur, int tail) {
        super(name, "whoo whoo", weight);
        this.fur = fur;
        this.tail = tail;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    // you can overwrite eat method of Animal class
    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        super.move(10);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "fur='" + fur + '\'' +
                ", tail=" + tail +
                '}';
    }
}
