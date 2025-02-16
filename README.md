# Sorting Algorithms Visualizer and Tester

This project implements five popular sorting algorithms in Java, along with the functionality to both **illustrate** their sorting steps and **test** them on various edge cases. It also includes a user interface to either see how the algorithms work step-by-step or run automated tests on the algorithms to verify their correctness.

## Sorting Algorithms Implemented

- **Insertion Sort**
- **Selection Sort**
- **Bubble Sort**
- **Merge Sort**
- **Quick Sort**

## Features

1. **Illustrate Sorting Algorithms**:
    - The program can visualize each step taken by the selected sorting algorithm.
    - You can input an array, and the program will demonstrate how the algorithm sorts it step-by-step.

2. **Test Sorting Algorithms**:
    - The program runs automated tests on the sorting algorithms.
    - It includes corner cases such as empty arrays, single-element arrays, reverse-sorted arrays, already sorted arrays, and arrays with duplicates.

3. **Interactive Menu**:
    - The program provides an interactive menu where you can choose whether to **illustrate** the algorithm or **run tests**.

## Project Structure

- **Sorting Algorithms**: Each sorting algorithm (e.g., Insertion Sort, Bubble Sort) has a class that implements its logic, including a method to visualize its execution.
- **SortingTestController**: Contains pre-defined test cases for all sorting algorithms.
- **SortingController**: Manages user input to select the sorting algorithm and array for illustration.
- **Launcher**: The entry point to run the application. It allows the user to choose between testing and illustrating the algorithms.

## How to Use

### 1. Compile the code

Compile all the Java files in the `src` directory:

```bash
javac *.java
```

### 2. Run the Program

To launch the program, run the `Main` class:

```bash
java Main
```

You will be presented with a menu:

- **Option 1**: Test Sorting Algorithms
    - This option runs test cases on various sorting algorithms.
    - It includes tests for edge cases like empty arrays, single-element arrays, reverse-sorted arrays, and arrays with duplicates.

- **Option 2**: Illustrate Sorting Algorithms
    - This option allows you to choose an algorithm and input an array to see how the sorting algorithm works step by step.
    - The algorithm will print each comparison and swap, showing how the array changes after each step.

- **Option 3**: Exit the program

### 4. Example Workflow

#### 1. To **test** the sorting algorithms, choose the option to run tests. For example:

```
1. Test Sorting Algorithms
2. Illustrate Sorting Algorithms
3. Exit
```

After selecting **1**, the program will run various test cases for the algorithms and print out the results.

#### 2. To **illustrate** the sorting process for a specific algorithm, choose the option to illustrate. For example:

```
1. Bubble Sort
2. Quick Sort
3. Insertion Sort
4. Merge Sort
5. Selection Sort
```

After selecting an algorithm, you'll be prompted to enter the array you wish to sort. The program will then show the step-by-step process of how the algorithm sorts the array.

### 5. Example Inputs and Outputs

#### Example: Test Empty Array

Input:
```
[]
```

Output:
```
Test 1: Empty array
Sorted array: []
```

#### Example: Test Reverse-Sorted Array

Input:
```
[5, 4, 3, 2, 1]
```

Output:
```
Test 4: Reverse sorted array
Sorted array: [1, 2, 3, 4, 5]
```

#### Example: Illustrate Insertion Sort

Input:
```
Please enter the array to be sorted: [5, 3, 1, 4, 2]
```

Output:
```
Step 1: Sorting element at index 1 (3)
Comparing 5 (index 0) with 3 (index 1)
Array after swap: [3, 5, 1, 4, 2]
...
Final sorted array: [1, 2, 3, 4, 5]
```

## Key Concepts Covered

- **Sorting Algorithms**: Understanding how sorting algorithms like Bubble Sort, Quick Sort, Insertion Sort, etc., work.
- **Array Manipulation**: Learn how different algorithms handle and manipulate arrays.
- **Edge Case Testing**: How sorting algorithms perform on various edge cases like empty arrays, reverse-sorted arrays, and arrays with duplicates.
- **Algorithm Visualization**: Provides an intuitive understanding of how the algorithms work by showing each step in the process.