// Task 8: Mini-project: visit receipt
// Happy Paws Pet Care System - Kigali

public class HappyPawsReceipt {
    // Static variable to track total visits across all customers
    static int visitCount = 0;

    // Instance variables
    String petName;
    String customerName;
    boolean isVaccinated;
    boolean isMember;

    // Constructor that increments visitCount
    public HappyPawsReceipt(String petName, String customerName, boolean isVaccinated, boolean isMember) {
        this.petName = petName;
        this.customerName = customerName;
        this.isVaccinated = isVaccinated;
        this.isMember = isMember;
        visitCount++; // Increments the static counter on each visit
    }

    // Method to calculate and print the receipt
    public void printReceipt(double groomingFee, double bathFee) {
        // Local variable adding fees using +=
        double total = 0;
        total += groomingFee;
        total += bathFee;

        // 10% discount if the customer is a member
        double discount = 0;
        if (isMember) {
            discount = total * 0.10;
        }
        double amountToPay = total - discount;

        // Free treat condition: must be both a member AND vaccinated
        boolean freeTreat = isMember && isVaccinated;

        // Print receipt
        System.out.println("----------------------------------------");
        System.out.println("Customer: " + customerName + " | Pet: " + petName);
        System.out.println("Grooming Fee: " + (int) groomingFee + " RWF");
        System.out.println("Bath Fee: " + (int) bathFee + " RWF");
        System.out.println("Total: " + (int) total + " RWF");
        if (isMember) {
            System.out.println("Member Discount (10%): " + (int) discount + " RWF");
            System.out.println("Member pays: " + (int) amountToPay + " RWF");
        } else {
            System.out.println("Amount to pay: " + (int) amountToPay + " RWF");
        }
        System.out.println("Free treat: " + freeTreat);
    }

    public static void main(String[] args) {
        // Receipt 1: Bobby / Aline (8000 + 3500, vaccinated = true, member = true)
        HappyPawsReceipt receipt1 = new HappyPawsReceipt("Bobby", "Aline", true, true);
        receipt1.printReceipt(8000, 3500);

        System.out.println();

        // Receipt 2: Nala / Eric (6000 + 3000, vaccinated = false, member = true)
        HappyPawsReceipt receipt2 = new HappyPawsReceipt("Nala", "Eric", false, true);
        receipt2.printReceipt(6000, 3000);

        System.out.println();
        System.out.println("========================================");
        // Print total visits
        System.out.println("Total visits today: " + HappyPawsReceipt.visitCount);
    }
}
