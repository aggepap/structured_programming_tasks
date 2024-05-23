package gr.aueb.cf.tasks;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού με 5 επιλογές δίνοντας στον χρήστη τη δυνατότητα
 * να επιλέξει αυτό που θέλει με τον αριθμό της κάθε επιλογής.
 */

public class RepeatedMenuApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuSelected = 0;

        do {
            System.out.println("Παρακαλώ επιλέξτε μια απο τις επιλογές που ακολουθούν:");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            menuSelected = input.nextInt();
            if (menuSelected == 1) {
                System.out.println("Επιλέξατε εισαγωγή");
            }else if (menuSelected == 2) {
                System.out.println("Επιλέξατε διαγραφή");
            }else if (menuSelected == 3) {
                System.out.println("Επιλέξατε ενημέρωση");
            }else if (menuSelected == 4) {
                System.out.println("Επιλέξατε αναζήτηση");
            }else if (menuSelected == 5) {
                System.out.println("Επιλέξατε Έξοδο5");
            }else {
                System.out.println("Η επιλογή σας δεν αντιστοιχεί σε λειτουργία. Πατήστε 5 για έξοδο");
            }
        }while (menuSelected !=5);

        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε την εφαρμογή μας");
        }
    }

