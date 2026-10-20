// Task 7: Adoption check
// Happy Paws Pet Care System - Kigali

public class AdoptionCheck {
    public static void main(String[] args) {
        // Simba's status
        boolean vaccinated = true;
        boolean healthy = true;
        boolean microchipped = false;
        boolean hasHome = true;

        // Logical conditions
        boolean canBeAdopted = vaccinated && healthy && hasHome;
        boolean needsVet = !vaccinated || !microchipped;
        boolean canTravel = vaccinated && microchipped;

        // Display results
        System.out.println("--- Simba's Status Check ---");
        System.out.println("Can be adopted: " + canBeAdopted);
        System.out.println("Needs vet: " + needsVet);
        System.out.println("Can travel: " + canTravel);
    }
}
