// Program to compute discount
/*
* Name: jeremiah sasi
* Reg No: S08-8414-2024
* Description: Program to compute discount
*/

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for user details
        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the purchase amount: ");
        double amount = input.nextDouble();

        double discount;
        if (amount > 5000) {
            discount = 0.10 * amount;   // 10%
        } else if (amount > 1000 && amount <= 5000) {
            discount = 0.05 * amount;   // 5%
        } else {
            discount = 0;               // No discount
        }

        double finalAmount = amount - discount;

        System.out.println("\nCustomer: " + name);
        System.out.println("Purchase Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);

        input.close();
    }
}
