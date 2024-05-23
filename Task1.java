package gr.aueb.cf.tasks;

import java.util.Scanner;

/**
 * Λαμβάνει έναν ακέραιο απο input του χρήστη, που συμβολίζει θερμοκρασία σε βαθμούς Φαρενάιτ,
 * και τους μετατρέπει σε Κελσίου.
 */

public class Task1 {
    public static void main(String[] args) {
        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int inputDegrees = 0;

        //Εισαγωγή απο τον χρήστη & υπολογισμός
        System.out.println("Please enter the temperature in Fahrenheit");
        inputDegrees = in.nextInt();
        int celcius = 5*(inputDegrees-32)/9;

        // Εμφάνιση αποτελέσματος στην κονσόλα
        System.out.printf("%d Fahrenheit is %d Celsius",inputDegrees, celcius);

    }
}
