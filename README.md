# Data structures and algorithms

## Overview

This Java class, `Utils`, provides several utility methods for common algorithms used in sorting and searching. The key functions implemented in this file include:

1. **Bubble Sort** - A simple sorting algorithm that compares adjacent elements and swaps them if they are in the wrong order.
2. **Selection Sort** - A sorting algorithm that repeatedly selects the minimum element from the unsorted part of the array and swaps it with the first unsorted element.
3. **Find Position** - A method that searches for the index of a specific number in an array by iterating through it sequentially.
4. **Binary Search** - A search algorithm that finds the position of a target number in a sorted array using the divide and conquer approach.

The methods also include a counter that tracks how many iterations each algorithm takes and prints this information to the console.

## Functions

### `bubbleSort(int[] arr)`
Sorts the given array using the **Bubble Sort** algorithm. This method iterates through the array, compares each adjacent element, and swaps them if they are out of order. The process continues until the array is sorted.

**Parameters:**
- `arr` (int[]): The array to be sorted.

**Returns:**
- Void. The array is sorted in place.

### `selectionSort(int[] arr)`
Sorts the given array using the **Selection Sort** algorithm. It finds the minimum element from the unsorted part of the array and swaps it with the first unsorted element.

**Parameters:**
- `arr` (int[]): The array to be sorted.

**Returns:**
- Void. The array is sorted in place.

### `findPosition(int[] arr, int number)`
Searches for a given number in the array using **linear search**. It iterates over the array and returns the index of the first occurrence of the number. If the number is not found, it returns -1.

**Parameters:**
- `arr` (int[]): The array to search in.
- `number` (int): The number to search for.

**Returns:**
- `int`: The index of the number if found, or -1 if the number is not in the array.

### `binarySearch(int[] arr, int number)`
Searches for a given number in a sorted array using the **Binary Search** algorithm. The array must be sorted for this algorithm to work correctly. It repeatedly divides the search range in half and checks the middle element until the target is found or the range is empty.

**Parameters:**
- `arr` (int[]): The sorted array to search in.
- `number` (int): The number to search for.

**Returns:**
- `int`: The index of the number if found, or -1 if the number is not found in the array.

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 9, 3};

        // Bubble Sort
        Utils.bubbleSort(arr);

        // Selection Sort
        Utils.selectionSort(arr);

        // Find Position (Linear Search)
        int position = Utils.findPosition(arr, 7);

        // Binary Search (Array must be sorted before using binary search)
        Utils.binarySearch(arr, 3);
    }
}
