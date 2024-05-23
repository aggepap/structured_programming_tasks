package gr.aueb.cf.tasks.ch6b;

import java.util.Scanner;

/**
 *  Takes an array (picked from users input or random) and checks if this array
 *  1)has not more than 3 odd values.
 *  2)Has not more than 3 even values.
 *  3)Has not more than 3 consecutive values.
 *  4)Has not more than 3 values ending in the same number.
 *  5)Has not more than 3 values in same decade.
 *  It prints the results to the console.
 */
public class PredicatesApp {
    static Scanner input = new Scanner(System.in);
    static int[] arr = new int[6];
    public static void main(String[] args) {

        startApp();

        System.out.printf("The array you have entered:\n %s more than 3 odd numbers\n %s more than three even numbers\n %s more than three consecutive numbers,\n %s more than three numbers with the same ending\n and %s more than three numbers on the same decade",
                notMoreThanthreeOdds(arr)? "does NOT have": "does have",notMoreThanThreeEven(arr)? "does NOT have": "does have",notMoreThanThreeConsecutive(arr)? "does NOT have": "does have",notMoreThanThreeEndings(arr)? "does NOT have": "does have",notMoreThanThreeDecade(arr) ? "does NOT have": "does have");

    }
    public static void validate(int error){
        if (error == 1 ){
            System.out.println("Please pick numbers from 1 to 49");
            System.exit(1);

        } if (error == 2){
            System.out.println("Please enter SIX integers");
            System.exit(1);

        }
        if (error == 3) {
            System.out.println("Wrong Choice");
            System.exit(1);
        }
    }

    /**
     * The main body of the application
     */
    public static void startApp(){
        System.out.println("Please press 2 to pick 6 integers or press 0 to pick random");
        int choice = input.nextInt();
        if(choice == 0){
            getRandomArray();
        }else if (choice == 2) {
            getArrayFromInput();
        } else {
            validate(3);

        }
    }

    /**
     * Generates a random number from 1-49
     * @return a random number from 1-49
     */
    public static int getRandomNumber(){
        return (int) (Math.random() * 49) + 1;
}

    /**
     * Gets six random numbers to populate the array, if the user selects to
     */
    public static void getRandomArray(){
    arr[0] = getRandomNumber();
    arr[1] = getRandomNumber();
    arr[2] = getRandomNumber();
    arr[3] = getRandomNumber();
    arr[4] =getRandomNumber();
    arr[5] = getRandomNumber();
    traverse(arr);


}

    /**
     * Asks for user input for 6 intergers from 1-49 and populates the array
     */
    public static void getArrayFromInput(){
    System.out.println("Please pick 6 integers");
    int arrNum = 0;

do {
    int number= input.nextInt();
    if (number > 0 && number < 50) {
        arr[arrNum] = number;
        arrNum++;
    }else {validate(1);}
}while (arrNum < 6);

    traverse(arr);
}

    /**
     * Traverses a selected array
     * @param arr array to be traversed
     */
    public static void traverse(int[] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    /**
     * Checks if an array hasn't got more than 3 odd values
     * @param arr array to be looped
     * @return true if there are not more than 3 odd values. False otherwise
     */
    public static boolean notMoreThanthreeOdds(int[] arr){
        int oddCount = 0;
        boolean moreThanThreeOdds = false;
            for( int num : arr ){
                if (num % 2 != 0){
                oddCount++;
    }
}
        return oddCount > 3 ? false : true ;
    }
    /**
     * Checks if an array hasn't got more than 3 even values
     * @param arr array to be looped
     * @return true if there are not more than 3 even values. False otherwise
     */
    public static boolean notMoreThanThreeEven(int[] arr){
        int evenCount = 0;
        boolean moreThanThreeEvens = false;
        for( int num : arr ){
            if (num % 2 == 0){
                evenCount++;
            }
        }
        return evenCount > 3 ? false : true;
    }

    /**
     * Checks if an array hasn't got more than 3 consecutive numbers
     * @param arr array to be looped
     * @return true if there are not more than 3 consecutive numbers. false otherwise
     */
    public static boolean notMoreThanThreeConsecutive(int[] arr){
        boolean lessThanThreeConsecutiveValues = true;

        for( int i = 0; i < arr.length -3; i++){
            if(arr[i] == arr[i+1] - 1 && arr[i+1] == arr[i+2]-1 && arr[i+2] == arr[i+3]-1 ){
                lessThanThreeConsecutiveValues = false;
            }
        }
        return lessThanThreeConsecutiveValues;
    }

    /**
     * Checks if an array hasn't got more than 3 values ending in the same number
     * @param arr array to be looped
     * @return true if there are not more than 3  values ending in the same number. false otherwise
     */
    public static boolean notMoreThanThreeEndings(int[] arr){
        boolean lessThanThreeEndings = true;
        int[] endings = new int[10];

        for(int i = 0; i <arr.length; i++){
            endings[arr[i] % 10]++;
        }
        for (int j : endings){
            if (j > 3) lessThanThreeEndings = false;
        }
        return lessThanThreeEndings;
    }
    /**
     * Checks if an array hasn't got more than 3 values in the same decade
     * @param arr array to be looped
     * @return true if there are not more than 3 values in the same decade. false otherwise
     */
    public static boolean notMoreThanThreeDecade(int[] arr){
        boolean lessThanThreeDecade = true;
        int[] endings = new int[5];

        for(int i = 0; i<arr.length; i++){
            endings[arr[i] / 10]++;
        }
        for (int j : endings){
            if (j > 3) lessThanThreeDecade = false;
        }
        return lessThanThreeDecade;
    }

}
