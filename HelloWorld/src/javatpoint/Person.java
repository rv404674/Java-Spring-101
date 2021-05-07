package javatpoint;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    // by default its public only.
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if( age<0 || age>100){
            this.age = 0;
        }
        this.age = age;
    }

}
