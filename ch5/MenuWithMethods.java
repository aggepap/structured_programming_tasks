package gr.aueb.cf.tasks.ch5;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού 5 επιλογών, το οποίο επιτρέπει στον χρήστη
 * να επιλέξει λειτουργία μέσω εισαγωγής αριθμού 1-5 και
 * στη συνέχεια εκτελεί την επιλεγμένη λειτουργία
 */

public class MenuWithMethods {
    //Αρχικοποίηση μεταβλητών και λήψη επιλογής απο τον χρήστη
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuSelection = 1;
        int starsCount = 1;
    //Αρχική εμφάνιση μενού
        do {
            System.out.println("Please select on of the following");
            System.out.println("1.Show horizontal stars");
            System.out.println("2.Show vertical stars");
            System.out.println("3.Show n lines with n stars");
            System.out.println("4.Show ascending order of n stars");
            System.out.println("5.Show descending order of n stars");
            System.out.println("6.Quit");
            menuSelection = input.nextInt();

            if(menuSelection >= 1 && menuSelection <=5){
            System.out.println("Please input number of stars");
            starsCount = input.nextInt();}

        //Χρήση μεθόδου ανάλογα την επιλογή του χρήστη
            switch (menuSelection){
                case 1: hStars(starsCount);
                    System.out.println();
                    break;
                case 2: vStars(starsCount);
                  break;
                case 3: hxvStars(starsCount);
                break;
                case 4: ascStars(starsCount);
                break;
                case 5: descStars(starsCount);
                break;
                case 6:
                    System.out.println("Επιτυχής έξοδος απο το πρόγραμμα");
                    break;
                default:
                    System.out.println("Please select a number for 1-6");
                    System.out.println("-------------------------------\n" +
                                       "-------------------------------");
                    break;

            }

        }while (menuSelection !=6);
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε το πρόγραμμα μας");


    }

    /**
     * Εμφανιζει α αστεράκια σε οριζόντια διάταξη
     * @param a     αριθμός αστεριών
     */
    public static void hStars(int a){
        for (int i = 1 ; i <= a ; i++){
            System.out.print("* ");

        }
    }

    /**
     * Εμφανίζει α αστεράκια σε κάθετη διάταξη
     * @param a     αριθμός αστεριών
     */
    public static void vStars(int a){
        for (int i = 1 ; i <= a ; i++){
            System.out.println("*");

        }
    }

    /**
     * Εμφανίζει α αριθμό αστεριών σε χ αριθμό σειρών
     * @param a     αριθμός αστεριών
     * @param lines αριθμός σειρών
     */
    public static void hxvStars(int a){
        Scanner input  = new Scanner(System.in);
        System.out.println("Please enter number of lines");
        int lines = input.nextInt();
        for (int i = 1 ; i <= lines ; i++){
            hStars(a);
            System.out.println();
        }

    }

    /**
     * Εμφανίζει α σειρές αστεριών με αυξανόμενο αριθμο απο 1
     * εως α
     * @param a     Μέγιστος αριθμός αστεριών
     */
    public static void ascStars(int a){

        for (int i = 1 ; i <= a ; i++){
            hStars(i);
            System.out.println();
        }

    }
    /**
     * Εμφανίζει α σειρές αστεριών με φθίνων αριθμο απο α
     * εως 1
     * @param a     Μέγιστος αριθμός αστεριών
     */
    public static void descStars(int a){

        for (int i = a ; i >= 1 ; i--){
            hStars(i);
            System.out.println();
        }

    }
}

