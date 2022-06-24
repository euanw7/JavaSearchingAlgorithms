# Java Searching Algorithms
This code implements two searching algorithms using Java; seqential and binary search. Both methods take an integer array and a search item as parameters and return a boolean true if the search item was found in the array, false if it wasn't.

## Sequential Search
The simplest of the two algorithms. Works on sorted or unsorted arrays. Checks each item in the array sequentially until the item is found or the end of the array is reached.

Complexity: O(n)

## Binary Search
Only works on sorted arrays. The array is split at a midpoint and the half where the search item cannot be is discarded. The method is then recursively called on the half that is kept. This is repeated until the item is found or the array can no longer be split. For example, if the search item is greater than the midpoint, the first half of the array is discarded and the method is called again on the second half. 

Complexity: O(log n)
