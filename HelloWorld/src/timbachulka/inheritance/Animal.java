package timbachulka.inheritance;

public class Animal {
    private String name;
    private String sound;
    private int weight;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                ", weight=" + weight +
                '}';
    }

    public Animal(){
        //this("unknown", "unknown", 0);
    }

    public Animal(String name, String sound, int weight) {
        this.name = name;
        this.sound = sound;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal ate");
    }

    public void move(int speed){
        System.out.println("Animal is moving at this speed " + speed);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
