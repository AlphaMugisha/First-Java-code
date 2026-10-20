// Task 1: Describe the pets
// Happy Paws Pet Care System - Kigali

public class Pet {
    // Fields
    String name;
    String type;
    int age;

    // Constructor
    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    // Method to print greeting
    public void greet() {
        System.out.println(name + " the " + type + " is happy to see you!");
    }

    public static void main(String[] args) {
        // Create Bobby (Dog, 4) and Nala (Cat, 2)
        Pet pet1 = new Pet("Bobby", "Dog", 4);
        Pet pet2 = new Pet("Nala", "Cat", 2);

        // Call greet() on both
        pet1.greet();
        pet2.greet();
    }
}
