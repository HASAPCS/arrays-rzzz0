package com.example;

public class ArrayOperations {

    public static void main(String[] args) {
        // Exercise 1: Initialize and Print an Array
        // TODO: Initialize an array of integers and print its contents.
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        for (int number : numbers) {
            System.out.println(number);
        }

    }

    // Exercise 2: Find the Maximum Value in an Array
    public static int findMaximumValue(int[] array) {
        // TODO: Implement the logic to find the maximum value in the array.
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum; // Placeholder return value
    }

    // Exercise 3: Check for a Specific Value
    public static boolean containsValue(int[] array, int value) {
        // TODO: Implement the logic to check if the array contains the specified value.
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
        // Placeholder return value

    }

    // Exercise 4: Calculate the Average of Array Elements
    public static double calculateAverage(int[] array) {
        // TODO: Implement the logic to calculate the average of the array elements.
        int sum = 0;

        for (int num : array) {
            System.out.println(num);
            sum += num;

        }
        return sum / array.length; // Placeholder return value

    }

    // Exercise 5: Reverse an Array
    public static int[] reverseArray(int[] array) {
        // TODO: Implement the logic to reverse the array.

        

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[array.length-1-i];
            array[array.length-1-i] = array[i];
            array[i] = temp;
        }
        return array;

        
        // return numbers; // Placeholder return value
    }

    // Exercise 6: Sort an Array
    public static void sortArray(int[] array) {
        // TODO: Implement a sorting algorithm to sort the array.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
