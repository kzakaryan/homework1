package model;

import java.util.Arrays;

public class QuickSort {

    /**
     * Sorts the given array using quick sort.
     * Worst Time Complexity: O(n^2)
     *
     * @param arr the array which needs to be sorted
     *
     * @throws NullPointerException if arr is null
     */
    public static void quickSortIllustration(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("The given array is null or empty");
        }
        System.out.println("Initial array: " + Arrays.toString(arr));
        quickSortHelper(arr, 0, arr.length - 1);
        System.out.println("\nFinal sorted array: " + Arrays.toString(arr));
    }

    /**
     * Helper method to recursively sort the array using quick sort.
     *
     * @param arr the array to be sorted
     * @param left the left index of the partition
     * @param right the right index of the partition
     */
    private static void quickSortHelper(int[] arr, int left, int right) {
        if (left < right) {
            var pivotIndex = partition(arr, left, right);
            System.out.println("Array after partitioning with pivot " + arr[pivotIndex] + ": " + Arrays.toString(arr));

            quickSortHelper(arr, left, pivotIndex - 1);
            quickSortHelper(arr, pivotIndex + 1, right);
        }
    }

    /**
     * Partitions the array such that elements smaller than the pivot are on the left,
     * and elements greater than the pivot are on the right.
     *
     * @param arr the array to be partitioned
     * @param left the left boundary of the partition
     * @param right the right boundary of the partition
     * @return the index of the pivot after partitioning
     */
    private static int partition(int[] arr, int left, int right) {
        var pivot = arr[right];
        System.out.println("\nPartitioning with pivot " + pivot + " (index " + right + ")");
        var i = left - 1;
        for (var j = left; j < right; j++) {
            System.out.println("Comparing " + arr[j] + " (index " + j + ") with pivot " + pivot);
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
                System.out.println("Array after swap: " + Arrays.toString(arr));
            }
        }
        swap(arr, i + 1, right);
        System.out.println("Placing pivot in position, array now: " + Arrays.toString(arr));
        return i + 1;
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