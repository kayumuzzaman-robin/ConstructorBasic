package learn.java;

/**
 * Constructor
 */
public class App {
    public static void main(String[] args) {
        // making normal object with No Arg. Constructor calling
        Animal animal = new Animal();
        System.out.println("animal object's information: " + animal.toString());
        // using copy Constructor to create object
        Animal animal1 = new Animal(animal);
        System.out.println("animal1 object's information: " + animal1.toString());


    }
}
