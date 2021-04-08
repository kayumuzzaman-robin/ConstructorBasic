package learn.java;

public class Animal {
    private String animalClass;
    private boolean canSpeak;

    public Animal() {
        // by using this() we are calling current class Animal(String animalClass, boolean canSpeak) constructor
        // this is an constructor chaining example
        this("default", false);
        System.out.println("No Arg. Constructor called");
    }
    // this is a copy constructor
    public Animal(Animal animal) {
        System.out.println("Copy Constructor called");
        animalClass = animal.animalClass;
        canSpeak = animal.canSpeak;
    }

    public Animal(String animalClass) {
        System.out.println("Single Arg. Constructor called");
        this.animalClass = animalClass;
    }

    public Animal(String animalClass, boolean canSpeak) {
        System.out.println("Double Arg. Constructor called");
        this.animalClass = animalClass;
        this.canSpeak = canSpeak;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalClass='" + animalClass + '\'' +
                ", canSpeak=" + canSpeak +
                '}';
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public boolean isCanSpeak() {
        return canSpeak;
    }

    public void setCanSpeak(boolean canSpeak) {
        this.canSpeak = canSpeak;
    }


}
