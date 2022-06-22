/**
 * BinarySearch.java
 * @author Euan Watkins
 * @version 1.0
 */

public class BinarySearch {
    /**
     * Checks if the search item is smaller or larger than a mid-point, subdivides
     * the array based on this. Recursively calls until item is found or no items
     * left to search through. Only works on sorted arrays.
     * @param array The array to search through.
     * @param searchItem The item to be searched for in the array.
     * @return True if the search item is in the array, false if not.
     */
    public boolean binarySearch(int[] array, int searchItem) {

        // If the array is empty item is not found so return false.
        if (array.length == 0) {
            return false;
        }

        /**
         * midPoint: the midpoint of the array.
         * subArray: the array which will be used to split the original array.
         */
        int midPoint = array[array.length / 2];
        int[] subArray = new int[array.length/2];

        // If the item is found at the midpoint return true.
        if (midPoint == searchItem) {
            return true;
        // If the item is smaller than the midpoint split the array into the firt half.
        } else if (searchItem < midPoint) {
            System.arraycopy(array, 0, subArray, 0, subArray.length);
            return binarySearch(subArray, searchItem);
        // If the item is greater than the midpoint split the array into the second half.
        } else if (searchItem > midPoint) {
            // If the item is out of range of the array item is not found so return false.
            if (searchItem > array[array.length-1]) {
                return false;
            }
            System.arraycopy(array, midPoint, subArray, 0, subArray.length);
            return binarySearch(subArray, searchItem);
        }
        // Anything else item has not been found so return false.
        return false;
    }
    
}
