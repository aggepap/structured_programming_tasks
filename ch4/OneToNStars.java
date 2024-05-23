package gr.aueb.cf.tasks.ch4;

import java.util.Scanner;

/**
 * Λαμβάνει έναν ακέραιο(n) απο τον χρήστη,
 * και τυπώνει αυξανόμενα * , ξεκινώντας απο ένα ανα σειρά
 * και φτάνοντας τα n ανα σειρά
 */

public class OneToNStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stars = 1;
        int finalStarsCount = 1;
        System.out.println("Παράκαλώ εισάγετε τον μέγιστο αριθμό * ");
        finalStarsCount = input.nextInt();

        for (int i = 1; i <= finalStarsCount; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}