//create a java program that calculate the electricity bill for residence
//The program' should take the number of electricity units consumed and the load capacity (in Kwh) as input and calculate the total electricity bill based on
//Load capasity based on
// for the first 100 unit 21.50 per unit
//for the next 200-300 unit 250 per unit
//for unit beyond 300 3.50 per unit
import java.util.Scanner;
class ElectricityBillCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Punjab Electricity bill management");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of electricity units consumed:");
        int unitsConsumed = sc.nextInt();


        double totalBill = [calculateElectricityBill(unitsConsumed);

        System.out.println("Total electricity bill: " + totalBill);
    }

    public static double calculateElectricityBill(int unitsConsumed) {
        double totalBill = 0;

        if(unitsConsumed <= 100) {
            totalBill = unitsConsumed * 1.50;
        } else if(unitsConsumed > 100 && unitsConsumed <= 300) {
            totalBill = 100 * 1.50 + (unitsConsumed - 100) * 2.50;
        } else {
            totalBill = 100 * 1.50 + 200 * 2.50 + (unitsConsumed - 300) * 3.50;
        }

        return totalBill;
    }
}