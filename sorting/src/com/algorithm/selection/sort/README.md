# Selection sort
The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.

1) The subarray which is already sorted.
2) Remaining subarray which is unsorted.


SelectionSort() function always runs O(n^2) time even if the array is sorted. The good thing about selection sort is it never makes more than O(n) swaps and can be useful when memory write is a costly operation.

# Sample result
Enter Integer values for sorting. enter "q" to finish. <br />
9 <br />
1 <br />
3 <br />
2 <br />
8 <br />
6 <br />
34 <br />
145 <br />
44 <br />
23 <br />
q <br />

Before sorting => [9, 1, 3, 2, 8, 6, 34, 145, 44, 23] <br />
After sorting => [1, 2, 3, 6, 8, 9, 23, 34, 44, 145]


