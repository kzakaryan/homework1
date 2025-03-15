package controller;

import java.util.Arrays;
import java.util.Scanner;
import model.*;

public class SortingTestController {

    private static final Scanner scanner = new Scanner(System.in);

    public static void runTests() {
        SortingTestController controller = new SortingTestController();
        controller.testInsertionSort();
        testSelectionSort();
        testBubbleSort();
        testMergeSort();
        testQuickSort();
    }

    // Test Insertion Sort
    public void testInsertionSort() {
        System.out.println("Testing Insertion Sort...");
        int[] arr1 = {};
        int[] arr2 = {5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {5, 4, 3, 2, 1};
        int[] arr5 = {4, 2, 7, 2, 8, 4};

        System.out.println("Test 1: Empty array");
        InsertionSort.insertionSortIllustration(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Test 2: Single element");
        InsertionSort.insertionSortIllustration(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("Test 3: Already sorted array");
        InsertionSort.insertionSortIllustration(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("Test 4: Reverse sorted array");
        InsertionSort.insertionSortIllustration(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println("Test 5: Array with duplicates");
        InsertionSort.insertionSortIllustration(arr5);
        System.out.println(Arrays.toString(arr5));
    }

    // Test Selection Sort
    public static void testSelectionSort() {
        System.out.println("Testing Selection Sort...");
        int[] arr1 = {};
        int[] arr2 = {5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {5, 4, 3, 2, 1};
        int[] arr5 = {4, 2, 7, 2, 8, 4};

        System.out.println("Test 1: Empty array");
        SelectionSort.selectionSortIllustration(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Test 2: Single element");
        SelectionSort.selectionSortIllustration(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("Test 3: Already sorted array");
        SelectionSort.selectionSortIllustration(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("Test 4: Reverse sorted array");
        SelectionSort.selectionSortIllustration(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println("Test 5: Array with duplicates");
        SelectionSort.selectionSortIllustration(arr5);
        System.out.println(Arrays.toString(arr5));
    }

    // Test Bubble Sort
    public static void testBubbleSort() {
        System.out.println("Testing Bubble Sort...");
        int[] arr1 = {};
        int[] arr2 = {5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {5, 4, 3, 2, 1};
        int[] arr5 = {4, 2, 7, 2, 8, 4};

        System.out.println("Test 1: Empty array");
        BubbleSort.bubbleSortIllustration(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Test 2: Single element");
        BubbleSort.bubbleSortIllustration(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("Test 3: Already sorted array");
        BubbleSort.bubbleSortIllustration(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("Test 4: Reverse sorted array");
        BubbleSort.bubbleSortIllustration(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println("Test 5: Array with duplicates");
        BubbleSort.bubbleSortIllustration(arr5);
        System.out.println(Arrays.toString(arr5));
    }

    // Test Merge Sort
    public static void testMergeSort() {
        System.out.println("Testing Merge Sort...");
        int[] arr1 = {};
        int[] arr2 = {5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {5, 4, 3, 2, 1};
        int[] arr5 = {4, 2, 7, 2, 8, 4};

        System.out.println("Test 1: Empty array");
        MergeSort.mergeSortIllustration(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Test 2: Single element");
        MergeSort.mergeSortIllustration(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("Test 3: Already sorted array");
        MergeSort.mergeSortIllustration(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("Test 4: Reverse sorted array");
        MergeSort.mergeSortIllustration(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println("Test 5: Array with duplicates");
        MergeSort.mergeSortIllustration(arr5);
        System.out.println(Arrays.toString(arr5));
    }

    // Test Quick Sort
    public static void testQuickSort() {
        System.out.println("Testing Quick Sort...");
        int[] arr1 = {};
        int[] arr2 = {5};
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = {5, 4, 3, 2, 1};
        int[] arr5 = {4, 2, 7, 2, 8, 4};

        System.out.println("Test 1: Empty array");
        QuickSort.quickSortIllustration(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("Test 2: Single element");
        QuickSort.quickSortIllustration(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("Test 3: Already sorted array");
        QuickSort.quickSortIllustration(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("Test 4: Reverse sorted array");
        QuickSort.quickSortIllustration(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println("Test 5: Array with duplicates");
        QuickSort.quickSortIllustration(arr5);
        System.out.println(Arrays.toString(arr5));
    }
}
