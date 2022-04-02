package test;

public abstract class Person {

    private String name;
    private int age;

    public abstract void getDescription();

    public void setName(String aName) {
        this.name = aName;
    }

    public String getName() {
        return name;
    }

}
