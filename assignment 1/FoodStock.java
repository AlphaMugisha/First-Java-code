// Task 6: Food stock
// Happy Paws Pet Care System - Kigali

public class FoodStock {
    public static void main(String[] args) {
        // Initial food stock in kg
        int stock = 40;
        System.out.println("Initial stock: " + stock + " kg");

        // Step 1: Delivery of 25 kg (Prediction: 40 + 25 = 65)
        stock += 25;
        System.out.println("After delivery (+= 25): " + stock + " kg");

        // Step 2: Sold 15 kg (Prediction: 65 - 15 = 50)
        stock -= 15;
        System.out.println("After sales (-= 15): " + stock + " kg");

        // Step 3: Multiplied by 2 (Prediction: 50 * 2 = 100)
        stock *= 2;
        System.out.println("After doubling (*= 2): " + stock + " kg");

        // Step 4: Divided by 4 (Prediction: 100 / 4 = 25)
        stock /= 4;
        System.out.println("After dividing by 4 (/= 4): " + stock + " kg");

        // Step 5: Modulus 6 (Prediction: 25 % 6 = 1)
        stock %= 6;
        System.out.println("After remainder of 6 (%= 6): " + stock + " kg");

        /*
         * PAPER PREDICTIONS SUMMARY:
         * Start : 40
         * += 25 : 65
         * -= 15 : 50
         * *= 2  : 100
         * /= 4  : 25
         * %= 6  : 1
         */
    }
}
