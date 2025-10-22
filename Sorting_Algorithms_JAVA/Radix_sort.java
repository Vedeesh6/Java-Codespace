import java.util.Arrays;

public class RadixSort {

    /**
     * The main function that sorts arr[] using Radix Sort.
     */
    public void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        // 1. Find the maximum number to know the number of digits.
        int max = getMax(arr);

        // 2. Do counting sort for every digit.
        // We use 'exp' (exponent) to represent the current digit's place
        // (1, 10, 100, 1000...)
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }

    /**
     * A utility function to get the maximum value in arr[].
     */
    private int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * A stable sort (Counting Sort) to sort array elements
     * based on the digit at the 'exp' place.
     */
    private void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; // The sorted output array
        int[] count = new int[10]; // To store count of digits (0-9)

        // Initialize count array to all zeros
        Arrays.fill(count, 0);

        // 1. Store count of occurrences of each digit
        for (int i = 0; i < n; i++) {
            // Get the digit at the 'exp' place
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // 2. Change count[i] so that it now contains the
        //    actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // 3. Build the output array
        // We go in reverse order to make the sort stable
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            
            // Place the element at its correct sorted position
            output[count[digit] - 1] = arr[i];
            
            // Decrement the count for that digit
            count[digit]--;
        }

        // 4. Copy the sorted output array back to arr[]
        System.arraycopy(output, 0, arr, 0, n);
    }

    /**
     * A main method to test the sort.
     */
    public static void main(String[] args) {
        int[] data = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Original array: " + Arrays.toString(data));

        RadixSort sorter = new RadixSort();
        sorter.sort(data);

        System.out.println("Sorted array:   " + Arrays.toString(data));
    }
}
