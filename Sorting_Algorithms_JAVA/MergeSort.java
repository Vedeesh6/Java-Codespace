public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;

            // Split the array into two halves
            int[] leftHalf = new int[mid];
            int[] rightHalf = new int[array.length - mid];

            System.arraycopy(array, 0, leftHalf, 0, mid);
            System.arraycopy(array, mid, rightHalf, 0, array.length - mid);

            // Recursively sort the two halves
            mergeSort(leftHalf);
            mergeSort(rightHalf);

            // Merge the two sorted halves
            merge(array, leftHalf, rightHalf);
        }
    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int i = 0, j = 0, k = 0;

        while (i < leftHalf.length && j < rightHalf.length) {
            if (leftHalf[i] <= rightHalf[j]) {
                array[k] = leftHalf[i];
                i++;
            } else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftHalf, if there are any
        while (i < leftHalf.length) {
            array[k] = leftHalf[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightHalf, if there are any
        while (j < rightHalf.length) {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {9, 2, 5, 6, 4, 8, 7, 1, 3};

        System.out.println("Original array:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nSorted array:");
        printArray(numbers);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}