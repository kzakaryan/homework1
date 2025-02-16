package model;

import java.util.Arrays;

public class MergeSort {

    /**
     * Sorts the given array using merge sort.
     * Worst Time Complexity: O(n * log n)
     *
     * @param arr the array which needs to be sorted
     *
     * @throws NullPointerException if arr is null
     */
    public static void mergeSortIllustration(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("The given array is null or empty");
        }
        System.out.println("Initial array: " + Arrays.toString(arr));
        mergeSortHelper(arr, new int[arr.length], 0, arr.length - 1);
        System.out.println("\nFinal sorted array: " + Arrays.toString(arr));
    }

    /**
     * Helper method to recursively divide the array and merge the halves.
     *
     * @param arr the array to be sorted
     * @param temp temporary array used for merging
     * @param left the left index of the array portion
     * @param right the right index of the array portion
     */
    private static void mergeSortHelper(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            var middle = (left + right) / 2;
            System.out.println("Dividing array: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1))
                    + " into two halves: "
                    + Arrays.toString(Arrays.copyOfRange(arr, left, middle + 1))
                    + " and "
                    + Arrays.toString(Arrays.copyOfRange(arr, middle + 1, right + 1)));

            mergeSortHelper(arr, temp, left, middle);
            mergeSortHelper(arr, temp, middle + 1, right);
            merge(arr, temp, left, middle, right);
        }
    }

    /**
     * Merges two sorted halves into a single sorted array.
     *
     * @param arr the array to merge
     * @param temp temporary array used for merging
     * @param left the left index of the array portion
     * @param middle the middle index where the array is divided
     * @param right the right index of the array portion
     */
    private static void merge(int[] arr, int[] temp, int left, int middle, int right) {
        System.out.println("Merging " + Arrays.toString(Arrays.copyOfRange(arr, left, middle + 1))
                + " and " + Arrays.toString(Arrays.copyOfRange(arr, middle + 1, right + 1)));
        System.arraycopy(arr, left, temp, left, right - left + 1);
        var i = left;
        var j = middle + 1;
        var k = left;
        while (i <= middle && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k] = temp[i];
                i++;
            } else {
                arr[k] = temp[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            arr[k] = temp[i];
            i++;
            k++;
        }
        while (j <= right) {
            arr[k] = temp[j];
            j++;
            k++;
        }
        System.out.println("Array after merge: " + Arrays.toString(arr));
    }
}
