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
    }

    private static void mergeSortHelper(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            var middle = (left + right) / 2;
            mergeSortHelper(arr, temp, left, middle);
            mergeSortHelper(arr, temp, middle + 1, right);
            merge(arr, temp, left, middle, right);
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int middle, int right) {
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
    }
}
