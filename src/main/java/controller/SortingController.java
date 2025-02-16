package controller;

import model.*;

import java.util.Arrays;
import java.util.Scanner;

public class SortingController {

    private static final Scanner scanner = new Scanner(System.in);

    public static void illustrateSorting() {
        System.out.println("Enter the sorting algorithm you want to illustrate: ");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Merge Sort");
        System.out.println("5. Selection Sort");
        var algorithm = scanner.nextInt();

        System.out.println("Enter the array (space-separated values): ");
        scanner.nextLine();
        var input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = Arrays.stream(inputArray)
                .mapToInt(Integer::parseInt)
                .toArray();

        switch (algorithm) {
            case 1:
                BubbleSort.bubbleSortIllustration(arr);
                break;
            case 2:
                QuickSort.quickSortIllustration(arr);
                break;
            case 3:
                InsertionSort.insertionSortIllustration(arr);
                break;
            case 4:
                MergeSort.mergeSortIllustration(arr);
                break;
            case 5:
                SelectionSort.selectionSortIllustration(arr);
                break;
            default:
                System.out.println("Invalid choice.");
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}