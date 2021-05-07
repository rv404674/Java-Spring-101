package javatpoint;

public class Main {

    public static void main(String[] args){
        Car porche = new Car();
        porche.numberplate = 1234;

        System.out.println(porche.getModel());
        porche.setModel("Safari 1200");
        System.out.println(porche.getModel());

        porche.setDoor("Front Door");
        System.out.println(porche.getDoor());
    }
}
