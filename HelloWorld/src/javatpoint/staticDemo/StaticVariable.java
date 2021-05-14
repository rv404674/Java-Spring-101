package javatpoint.staticDemo;

// Demo for Static Variable
// javatpoint

//NOTE:
//1. gets memory only once during the time of class loading.
//2. used to refer common property (which is not unique to each object).
// 3. you dont need an object to access static variable.

// for student, college name will be same, hence we don't need to initialize space for it again and again.
class Student{
    private String name;
    private int rollNo;
    static String collegeName = "Jaypee University of Eng and Tech";

    public Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo + " College Name=" + collegeName +
                '}';
    }
}

public class StaticVariable {
    public static void main(String[] args){
        System.out.println(Student.collegeName);

        Student student1 = new Student("Rahul", 151364);
        Student student2 = new Student("Sachin", 151007);

        System.out.println(student1.toString());
        System.out.println(student2.toString());

    }
}
