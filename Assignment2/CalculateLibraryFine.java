/*
 Program to calculate library fine
 * Name: jeremiah sasi
 *  * Reg No: S08-8414-2024
 * Description: Program to calculate fine for overdue library books
*/

import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input section
        System.out.print("Enter Book ID: ");
        String bookID = sc.nextLine();

        System.out.print("Enter due date (in days): ");
        int dueDate = sc.nextInt();

        System.out.print("Enter return date (in days): ");
        int returnDate = sc.nextInt();

        // calculate days overdue
        int daysOverdue = returnDate - dueDate;
        if (daysOverdue < 0) {
            daysOverdue = 0; // means book returned early
        }

        // determine fine rate
        int fineRate = 0;
        if (daysOverdue > 0 && daysOverdue <= 7) {
            fineRate = 20;
        } else if (daysOverdue >= 8 && daysOverdue <= 14) {
            fineRate = 50;
        } else if (daysOverdue >= 15) {
            fineRate = 100;
        }

        // calculate fine amount
        int fineAmount = fineRate * daysOverdue;

        // output section
        System.out.println("\nLibrary Fine Report");
        System.out.println("Book ID: " + bookID);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Days Overdue: " + daysOverdue);
        System.out.println("Fine Rate: " + fineRate);
        System.out.println("Fine Amount: " + fineAmount);

        sc.close();
    }
}


