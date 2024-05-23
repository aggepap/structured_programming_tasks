package gr.aueb.cf.tasks.ch4;

import java.util.Scanner;

/**
 * Τυπώνει στο console n αριθμό αστεριών σε οριζόντια διάταξη.
 * Όπου n o ακέραιος αριθμός που εισαγει ο χρήστης
 */

public class HStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1;
        System.out.println("Please insert an integer");
        n = input.nextInt();

        for (int i = 1; i<= n ; i++){
            System.out.print("* ");
        }
    }
}
