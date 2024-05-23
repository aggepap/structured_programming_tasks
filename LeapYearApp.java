package gr.aueb.cf.tasks;

import java.util.Scanner;

/**
 * Λαμβάνει μια ένα έτος σε τετραψήφιο ακέραιο απο τον χρήστη
 * και ελέγχει το αν πρόκειται για δίσεκτο έτος
 */

public class LeapYearApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearInput;
        boolean isLeapYear;
        System.out.println("Please input a year: ");
        yearInput = scanner.nextInt();

        // Αρχικά πρέπει το έτος να διαιρείται ακριβώς απο το 4
            if (yearInput % 4 == 0) {
                // Αν διαιρείται με το 4 ελέγχουμε αν να διαιρείται και με το 100 και το 400.
                // Αν διαιρείται με το 4 αλλά όχι με το 100 είναι δίσεκτο. Επίσης αν διαιρείται ακριβώς
                // με το 400 είναι δίσεκτο
                if (yearInput % 100 != 0 || yearInput % 400 == 0) {
                        isLeapYear = true;
                    } else {
                        isLeapYear = false;
                    }
                }
            else {
                isLeapYear = false;
            }
            //Εμφάνιση αποτελέσματος στην κονσόλα
            if(isLeapYear){
                System.out.printf("Το %d είναι δίσεκτο",yearInput);
            }else {
                System.out.printf("Το %d δεν είναι δίσεκτο",yearInput);
            }

    }
}
