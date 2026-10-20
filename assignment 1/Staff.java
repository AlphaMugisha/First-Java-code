// Task 4: Staff shifts
// Happy Paws Pet Care System - Kigali

public class Staff {
    // Instance variable: unique to each staff member
    String name;

    // Static variable: shared by all staff members across the class
    static String centreName = "Happy Paws Kigali";

    // Constructor
    public Staff(String name) {
        this.name = name;
    }

    // Method to show shift details
    public void showShift() {
        // Local variable: only accessible within this method
        int hours = 8;

        System.out.println(name + " works " + hours + " hours at " + centreName);
    }

    public static void main(String[] args) {
        // Creating staff members
        Staff staff1 = new Staff("Jean");
        Staff staff2 = new Staff("Grace");

        System.out.println("--- Initial Shifts ---");
        staff1.showShift();
        staff2.showShift();

        // Changing the static variable once
        Staff.centreName = "Happy Paws Musanze";

        System.out.println("\n--- Shifts After Changing centreName ---");
        staff1.showShift();
        staff2.showShift();

        /*
         * EXPLANATION:
         * 'centreName' is a STATIC variable, meaning it belongs to the class itself
         * rather than to any single object. All instances of the Staff class share 
         * the same single copy of 'centreName' in memory.
         * When we change Staff.centreName to "Happy Paws Musanze", it changes 
         * for both Jean and Grace simultaneously.
         */
    }
}
