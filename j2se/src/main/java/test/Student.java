package test;

public class Student extends Person{

    public Student(String aName) {
        this.setName(aName);
    }

    @Override
    public void getDescription() {
        System.out.println(this.getName() + " is a student");
    }
}
