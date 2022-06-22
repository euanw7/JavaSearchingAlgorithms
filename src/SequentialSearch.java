/**
 * SequentialSearch.java
 * @author Euan Watkins
 * @version 1.0
 */

public class SequentialSearch {
    /**
     * Checks each item in order. Stops when item found or reaches end.
     * @param array The array tp search through.
     * @param searchItem The item to search for in the array.
     * @return True if the item is in the array, false if not.
     */
    public boolean sequentialSearch(int[] array, int searchItem) {
        // For every item in the array, check if it's the same as the one we're searching for.
        for (int i : array) {
            // If the item is found, return true.
            if (i == searchItem) {
                return true;
            }
        }
        // If it wasn't found, return false.
        return false;
    }
    
}
