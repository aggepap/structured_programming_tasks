package gr.aueb.cf.tasks.ch6a;

/**
 * A small up that traverses an array of ints to find the position
 * of the max value, and the second smallest number in the array
 * with two different methods
 */

public class GetMaxPositionApp {
    public static void main(String[] args) {
        int[] arr ={4,6,12,4,1,5,6,22,4,5,2,9,12,0,-2, 55, 4, 2, 5};
        getMaxPosition(arr, 0, (arr.length-1));
        getSecondSmallerNumber(arr);
    }

    /**
     * Finds the position of the maximum value of an array of numbers
     * and the prints it position and it's value to the console
     * @param arr Array to be traversed
     * @param low starting point in array (from 0 to array.length-1)
     * @param high ending point in array (from low+1 to to array.length-1)
     */
    public static void getMaxPosition(int[] arr, int low, int high){
        int maxPosition = high;
        int maxValue = arr[high];
        if (low == high || low > high || high > arr.length || low<0){
            System.out.printf("You have selected a wrong range of numbers\n");
        }else{
        for (int i  = 0; i< arr.length; i++){
            if(arr[i]> maxValue){
                maxPosition = i;
                maxValue = arr[i];
            }

        }
        System.out.printf("The position of max value is %d and it's value is %d\n", maxPosition + 1 , maxValue);
    }}
    public static void getSecondSmallerNumber(int[] arr){
        int smallerNo = Integer.MAX_VALUE;
        int secondSmallerNo = Integer.MAX_VALUE;
    for(int number : arr ){
        if (number < smallerNo ){
            secondSmallerNo = smallerNo;
            smallerNo = number;
        }else if(number < secondSmallerNo && number != smallerNo){
            secondSmallerNo = number;
        }

    }
        System.out.printf("Smallest number is array is %d. The next smallest is %d",smallerNo, secondSmallerNo);
    }

}
