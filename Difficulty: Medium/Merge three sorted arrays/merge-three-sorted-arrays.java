import java.util.ArrayList;

class Solution {
    // Function to merge three sorted arrays into a single sorted array
    public static ArrayList<Integer> mergeThree(int[] a, int[] b, int[] c) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        // Traverse all three arrays using pointers
        while (i < a.length || j < b.length || k < c.length) {
            int valA = (i < a.length) ? a[i] : Integer.MAX_VALUE;
            int valB = (j < b.length) ? b[j] : Integer.MAX_VALUE;
            int valC = (k < c.length) ? c[k] : Integer.MAX_VALUE;

            // Find the minimum among the current elements of three arrays
            int minVal = Math.min(valA, Math.min(valB, valC));
            result.add(minVal);

            // Increment the pointer corresponding to the array with the minimum value
            if (minVal == valA) {
                i++;
            } else if (minVal == valB) {
                j++;
            } else {
                k++;
            }
        }

        return result;
    }
}