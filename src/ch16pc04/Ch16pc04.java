package ch16pc04;

/**
 * maxElement Method
 * Find the largest value of an array by using recursion
 * @author frank
 */
public class Ch16pc04 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int[] array = new int[]{10, 15, 36, 98, 250, 76, 43, 600, 748, 25, -13};
        
        // Call the maxElement recursive method
        int result = maxElement(array, 0, array.length - 1);
        
        // Display the results to the user.
        System.out.print("The max value of the array is: " + Integer.toString(result) + ".");
    }
    
    
    private static int maxElement(int[] array, int lowValue, int highValue) {
        assert(lowValue <= highValue);
        if (lowValue == highValue)
            return array[lowValue];
        
        int sublength = ((highValue + 1) - lowValue) / 2;
        
        assert(sublength > 0);
        
        int maxA = maxElement(array, lowValue, lowValue + sublength - 1);
        int maxB = maxElement(array, lowValue + sublength, highValue);
        return Math.max(maxA, maxB);
    }
}
