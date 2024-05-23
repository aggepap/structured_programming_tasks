package gr.aueb.cf.tasks;

import java.util.Scanner;

/**
 *
 * Λαμβάνει 3 ακέραιους απο input του χρήστη, και τους χρησιμοποιεί για να αναπαραστήσει μια ημερομηνία σε μορφή HH/MM/EE
 */
public class Task2 {

        // Δήλωση και αρχικοποίηση μεταβλητών
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year= 0;

        //Εισαγωγή απο τον χρήστη
        System.out.println("Παρακαλώ προσθέστε ημέρα, μήνα, και έτος με αριθμητικούς χαρακτήρες. π.χ 1 1 2024");

        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        // Εμφάνιση αποτελέσματος στην κονσόλα
        System.out.printf("H ημερομηνία που εισάγατε είναι %02d/%02d/%4d", day, month, year);
    }
}
