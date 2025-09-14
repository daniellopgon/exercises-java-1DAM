package arrays;

import java.util.Arrays;

/**
 * Program that calculates the median of a numeric series.
 * The median is the middle value in a sorted list of numbers.
 */
public class MedianCalculator {

    public static void main(String[] args) {
        int[] numbers = {12, 23, 4, 6, 21, 11};

        System.out.println("Original array: " + Arrays.toString(numbers));

        double median = calculateMedian(numbers);
        System.out.println("The median is: " + median);

        // Demonstrate with different arrays
        demonstrateWithDifferentArrays();
    }

    /**
     * Calculates the median of an array of integers.
     *
     * @param numbers the array of numbers
     * @return the median value as a double
     * @throws IllegalArgumentException if the array is null or empty
     */
    public static double calculateMedian(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        // Create a copy to avoid modifying the original array
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);

        int length = sortedNumbers.length;

        if (length % 2 == 0) {
            // Even number of elements: average of two middle values
            int middleIndex1 = length / 2 - 1;
            int middleIndex2 = length / 2;
            return (sortedNumbers[middleIndex1] + sortedNumbers[middleIndex2]) / 2.0;
        } else {
            // Odd number of elements: middle value
            return sortedNumbers[length / 2];
        }
    }

    /**
     * Alternative implementation using manual sorting (Selection Sort).
     * This demonstrates the sorting algorithm explicitly.
     *
     * @param numbers the array of numbers
     * @return the median value as a double
     */
    public static double calculateMedianWithManualSort(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int[] sortedNumbers = selectionSort(Arrays.copyOf(numbers, numbers.length));

        int length = sortedNumbers.length;

        if (length % 2 == 0) {
            return (sortedNumbers[length / 2 - 1] + sortedNumbers[length / 2]) / 2.0;
        } else {
            return sortedNumbers[length / 2];
        }
    }

    /**
     * Sorts an array using the Selection Sort algorithm.
     * Time complexity: O(n²)
     *
     * @param array the array to sort
     * @return the sorted array
     */
    public static int[] selectionSort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the remaining unsorted array
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }

        return array;
    }

    /**
     * Swaps two elements in an array.
     *
     * @param array the array containing the elements
     * @param i index of first element
     * @param j index of second element
     */
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * Demonstrates the median calculation with different test cases.
     */
    private static void demonstrateWithDifferentArrays() {
        System.out.println("\n--- Additional Examples ---");

        // Test cases
        int[][] testArrays = {
                {1, 2, 3, 4, 5},           // Odd length
                {10, 20, 30, 40},          // Even length
                {7},                       // Single element
                {5, 2, 8, 1, 9, 3}        // Random order
        };

        for (int[] testArray : testArrays) {
            System.out.println("Array: " + Arrays.toString(testArray) +
                    " -> Median: " + calculateMedian(testArray));
        }
    }
}