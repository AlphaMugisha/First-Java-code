// Task 5: Grooming bill
// Happy Paws Pet Care System - Kigali

public class GroomingBill {
    public static void main(String[] args) {
        // Service prices in RWF
        int grooming = 8000;
        int bath = 3500;
        int nails = 2000;

        // 1. Total bill for the services
        int total = grooming + bath + nails;
        System.out.println("Total bill: " + total + " RWF");

        // 2. Change from 20000 RWF
        int paid = 20000;
        int change = paid - total;
        System.out.println("Change from 20000 RWF: " + change + " RWF");

        // 3. Cost of grooming 3 dogs
        int cost3Dogs = grooming * 3;
        System.out.println("Cost of grooming 3 dogs: " + cost3Dogs + " RWF");

        // 4. Packing 25 treats into bags of 6
        int totalTreats = 25;
        int perBag = 6;
        int fullBags = totalTreats / perBag;
        int leftoverTreats = totalTreats % perBag;
        System.out.println("Full bags of treats: " + fullBags);
        System.out.println("Treats left over: " + leftoverTreats);

        // 5. Visits 9 after ++
        int visits = 9;
        visits++;
        System.out.println("Visits (after ++): " + visits);

        // 6. Shampoo 15 after --
        int shampoo = 15;
        shampoo--;
        System.out.println("Shampoo bottles (after --): " + shampoo);
    }
}
