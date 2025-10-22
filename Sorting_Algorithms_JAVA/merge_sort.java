import java.util.Arrays;

public class MergeSort {

    /**
     * The main public method to sort an array.
     * It calls the recursive sort function.
     */
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return; // Already sorted
        }
        sortRecursive(arr, 0, arr.length - 1);
    }

    /**
     * The recursive "divide" part of the algorithm.
     * @param arr   The array to be sorted.
     * @param left  The starting index.
     * @param right The ending index.
     */
    private void sortRecursive(int[] arr, int left, int right) {
        // Base case: if the array has 1 or 0 elements, it's sorted.
        if (left < right) {
            // 1. Find the middle point to divide the array
            int middle = (left + right) / 2;

            // 2. Conquer: Recursively sort the left half
            sortRecursive(arr, left, middle);
            
            // 3. Conquer: Recursively sort the right half
            sortRecursive(arr, middle + 1, right);

            // 4. Combine: Merge the two sorted halves
            merge(arr, left, middle, right);
        }
    }

    /**
     * The "combine" part of the algorithm.
     * Merges two sorted subarrays arr[left...middle] and arr[middle+1...right].
     */
    private void merge(int[] arr, int left, int middle, int right) {
        // Find sizes of the two temporary subarrays
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data into the temporary arrays
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[middle + 1 + j];
        }

        // --- Merge the temporary arrays back into arr[left...right] ---

        int i = 0; // Initial index of first subarray (L)
        int j = 0; // Initial index of second subarray (R)
        int k = left; // Initial index of merged subarray (arr)

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy any remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     * A main method to test the sort.
     */
    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6, 7, 22, -3};

        System.out.println("Original array: " + Arrays.toString(data));

        MergeSort sorter = new MergeSort();
        sorter.sort(data);

        System.out.println("Sorted array:   " + Arrays.toString(data));
    }
}
