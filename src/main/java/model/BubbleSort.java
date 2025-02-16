package model;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Sorts the given array using Bubble sort.
     * Worst Time Complexity: O(n^2)
     *
     * @param arr the array which needs to be sorted
     *
     * @throws NullPointerException if arr is null
     */
    public static void bubbleSortIllustration(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("The given array is null or empty");
        }
        System.out.println("Initial array: " + Arrays.toString(arr));

        for (var i = 0; i < arr.length - 1; i++) {
            System.out.println("\nPass " + (i + 1) + ":");
            var swapped = false;
            for (var j = 0; j < arr.length - 1 - i; j++) {
                System.out.println("Comparing " + arr[j] + " (index " + j + ") with " + arr[j + 1] + " (index " + (j + 1) + ")");
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                    System.out.println("Array after swap: " + Arrays.toString(arr));
                }
            }
            if (!swapped) {
                System.out.println("No swaps performed, array is already sorted.");
                break;
            }
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