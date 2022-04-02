package test;


public class Test
{
    public static void main(String[] args) {

        //Cat cat = new Cat();
        printThing(
                () -> System.out.println("Mow")
        );


    }

    public static void printThing(Printable thing) {
        thing.print();
    }

}
