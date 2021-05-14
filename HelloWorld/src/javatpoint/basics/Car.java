package javatpoint;

public class Car {

    int numberplate; // public

    private String door; // by default null
    private int wheels;
    private String model;

    public void setModel(String model) {
        // this.model means model of the class.
        // NOTE: Validation is good, you can do that here.
        String validModel= model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("ferrari")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }

    String getModel() {
        return this.model;
    }

    public void setDoor(String door){
        this.door = door;
    }

    String getDoor(){
        return this.door;
    }

    public void setNumberplate(int wheels){
        this.wheels = wheels;
    }

}
