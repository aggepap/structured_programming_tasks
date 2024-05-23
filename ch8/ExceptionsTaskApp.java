package gr.aueb.cf.tasks.ch8;
import java.util.Scanner;

/**
 * Lets the user pick an option and after checking for the validity
 * of the input prints the selected option
 */
public class ExceptionsTaskApp {

    public static void main(String[] args) {
            showMenu();
        while (true) {
            try {
                printChoice(getChoice());
                break;
            } catch (IllegalArgumentException ila) {
                System.out.println("Your choice was wrong, please pick a number from 1-5");
            }
        }
    }

    /**
     * Prints the menu
     */
    private static void showMenu(){
        System.out.println("1.First Option");
        System.out.println("2.Second Option");
        System.out.println("3.Third Option");
        System.out.println("4.Fourth Option");
        System.out.println("5.Exit Program");
    }

    /**
     * Gets the selection from the user and checks
     * if it's in the valid subset of accepted values.
     * @return the choice number between 1-5
     */
    private static int getChoice() {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while(true) {
            System.out.println("Please select a number from 1-5");
            if (input.hasNextInt()) {
                choice = input.nextInt();
            } else {
                System.out.println("Please insert an integer, your last input was not correct");
                input.nextLine();
                continue;
            }
            return choice;
        }
    }

    /**
     * Checks if the input is in the valid subset of accepted values.
     * and prints a message to the user, to verify the selection
     * @param choice the selection that user entered
     * @throws IllegalArgumentException checks if the choice entered is between 1-5. If not it throws
     *                                  manual IllegalArgumentException so main can handle the error
     */
    private static void printChoice(int choice) throws IllegalArgumentException{
        if(choice <1 || choice > 5){
            throw new IllegalArgumentException();
        }else{
            switch(choice) {
                case 1:
                    System.out.println("You selected 1");
                    break;
                case 2:
                    System.out.println("You selected 2");
                    break;
                case 3:
                    System.out.println("You selected 3");
                    break;
                case 4:
                    System.out.println("You selected 4");
                    break;
                case 5: System.out.println("Thank you for using our program");
                System.exit(0);
                default: throw new IllegalArgumentException();
            }
        }
    }
}
