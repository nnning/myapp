package test;

import java.util.Random;

public class Employee extends Person{
    private static int nextId;

    private int id ;
    private int salary;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(1000);
    }

    {
        id = nextId;
        nextId++;
    }

    public Employee() {
        this("Employee00");
    }

    public Employee(String aName) {
        this.setName(aName);
        this.setId();

    }


    @Override
    public void getDescription() {

        System.out.println(this.getName() + ", is a employee");
    }

    public void setId() {
        this.id = id;
    }
}


