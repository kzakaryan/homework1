package launcher;

import controller.SortingController;
import controller.SortingTestController;
import java.util.Scanner;

public class Launcher {

    private static final Scanner scanner = new Scanner(System.in);

    public static void run() {
        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Test Sorting Algorithms");
            System.out.println("2. Illustrate Sorting Algorithms");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    SortingTestController.runTests();
                    break;
                case 2:
                    SortingController.illustrateSorting();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}