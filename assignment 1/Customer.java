// Task 2: Register customers
// Happy Paws Pet Care System - Kigali

public class Customer {
    // Fields
    String name;
    String phone;
    String petName;

    // Constructor using 'this' keyword
    public Customer(String name, String phone, String petName) {
        this.name = name;
        this.phone = phone;
        this.petName = petName;
    }

    // Method to welcome the customer
    public void welcome() {
        System.out.println("Welcome, " + this.name + "! How is " + this.petName + " today?");
    }

    public static void main(String[] args) {
        // Registering customers
        Customer customer1 = new Customer("Aline", "0788123456", "Bobby");
        Customer customer2 = new Customer("Eric", "0722654321", "Nala");
        Customer customer3 = new Customer("Divine", "0733111222", "Simba");

        // Print welcome message for each
        customer1.welcome();
        customer2.welcome();
        customer3.welcome();
    }
}
