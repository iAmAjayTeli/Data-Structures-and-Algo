package Solutions;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={4, 1, 3, 9, 7};
        int n= arr.length;
        quickSort(arr,0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        if (low < high) {
            int loc = partition(arr, low, high);
            quickSort(arr, low, loc - 1); // Sort the left side of the pivot
            quickSort(arr, loc + 1, high); // Sort the right side of the pivot
        }
    }

    static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low]; // Pivot is the first element
        int i = low;  // Left index
        int j = high; // Right index

        while (i < j) {
            // Move i to the right while arr[i] <= pivot
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            // Move j to the left while arr[j] > pivot
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            // If i and j haven't crossed, swap arr[i] and arr[j]
            if (i < j) {
                swap(arr, i, j);
            }
        }

        // Swap pivot (arr[low]) with arr[j], which is the correct position for the pivot
        swap(arr, low, j);

        return j; // Return the index of the pivot
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
