package gr.aueb.cf.tasks.ch6a;

public class ArrayMethodsApp {
    public static void main(String[] args) {
        int[] arr ={4,6,12,4,1,5,6,22,4,5,2,9,12,0,-2, 55, 4, 2, 5};
        filterOdd(arr);
        System.out.println();
        doubleArray(arr);
        System.out.println();
        System.out.printf("There %s a positive number in this array", positiveExists(arr) ? "is" : "is not");
        System.out.println();
        System.out.printf("This array %s a negative value", allPositive(arr) ? "doesn't contain" : "contains");

    }

    /**
     * Searches for an int in an array and returns it's position
     * @param arr               Array to be traversed
     * @param numberToFind      Int that need to be found in array
     * @return                  The position of searched int in the array. -1 otherwise
     */
    public static int findInArray(int[] arr, int numberToFind){
        int positionOfNumber = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == numberToFind){
                positionOfNumber = i;
                }
            }
return positionOfNumber;
        }

    /**
     *  Loops an array and checks if there are odd numbers in it
     *  It then creates a new array containing the odd numbers and
     *  prints them in console
     * @param arr array to be traversed
     */
    public static void filterOdd(int[] arr){
        int oddcount = 0;
        int i=0;
        for(int number : arr){
            if (number % 2  == 0){
                oddcount++;
            }
        }
        int[] oddsArray = new int[oddcount];

        for(int number : arr){
        if (number % 2  == 0){
            oddsArray[i] = number;
            i++;
             }
         }
        for (int num : oddsArray) {
        System.out.print(num + " ");
        };

    };

    /**
     *  Loops an array of integers and creates a new array that contains
     *  the same values but doubled.
     * @param arr array to be doubled
     * @return an array doublearray containing the doubled values of first array
     */
    public static int[] doubleArray(int[] arr){
        int[] doubleArray = new int[arr.length];
        int i = 0;
        for(int number : arr){
            doubleArray[i] = arr[i] * 2;
                i++;
            }
        for (int num : doubleArray) {
            System.out.print(num + " ");
        }
        return doubleArray;
        };

    /**
     *  Loops an array and searches if there are positive values
     * @param arr array to be traversed
     * @return true if a positive value is present in array.
     * False otherwise.
     */
    public static boolean positiveExists (int[] arr){
        boolean positiveInArray = false;
        for(int i = 0 ; i < arr.length; i++){
            if (arr[i] > 0) positiveInArray = true;
        }

        return positiveInArray;
    }

    /**
     *  Loops an array and checks for negative values
     * @param arr array to be traversed
     * @return true αll values are positive. False otherwise
     */
    public static boolean allPositive(int[] arr){
        boolean allPositiveArray = true;
        for(int i = 0 ; i < arr.length; i++){
            if (arr[i] < 0) allPositiveArray = false;
        }
        return allPositiveArray;
    }



}
