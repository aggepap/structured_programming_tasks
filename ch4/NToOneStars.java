package gr.aueb.cf.tasks.ch4;

/**
 * Λαμβάνει έναν ακέραιο(n) απο τον χρήστη,
 * και τυπώνει σε φθίνουσα σειρά * , ξεκινώντας απο n ανα σειρά
 * και φτάνοντας το ένα ανα σειρά
 */


import java.util.Scanner;

public class NToOneStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stars = 1;
        int finalStarsCount = 1;
        System.out.println("Παράκαλώ εισάγετε τον μέγιστο αριθμό * ");
        finalStarsCount = input.nextInt();

        for (int i = 1; i <= finalStarsCount; i++) {
            for (int k = finalStarsCount; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
