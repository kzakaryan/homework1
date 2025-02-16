package model;

import java.util.Arrays;

public class InsertionSort {

    /**
     * Sorts given array using insertion sorting.
     * Worst Time Complexity: O(n^2)
     *
     * @param arr the array which needs to be sorted
     *
     * @throws NullPointerException if arr is null
     */
    public static void insertionSortIllustration(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("The given array is null or empty");
        }
        System.out.println("Initial array: " + Arrays.toString(arr));
        for (var i = 0; i < arr.length; i++) {
            System.out.println("\nSorting element at index " + i + " (" + arr[i] + ")");
            for (var j = i; j > 0 && arr[j-1] > arr[j]; j--) {
                System.out.println("Comparing " + arr[j - 1] + " (index " + (j - 1) + ") with " + arr[j] + " (index " + j + ")");
                swap(arr, j, j-1);
                System.out.println("Array after swap: " + Arrays.toString(arr));
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("\nFinal sorted array: " + Arrays.toString(arr));
    }

    /**
     * Used to swap 2 elements
     *
     * @param arr array in which elements need to be swapped
     * @param i index of first element to be swapped
     * @param j index of second element to be swapped
     */
    private static void swap(int[] arr, int i, int j) {
        System.out.println("Swapping " + arr[i] + " (index " + i + ") with " + arr[j] + " (index " + j + ")");
        var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}