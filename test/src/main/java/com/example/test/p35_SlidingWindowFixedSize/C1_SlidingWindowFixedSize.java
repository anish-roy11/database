package com.example.test.p35_SlidingWindowFixedSize;



public class C1_SlidingWindowFixedSize {

    public double[] calculateAverages(int[] numbersArray, int windowSize) {
        int n = numbersArray.length;
        double[] averages = new double[n - windowSize + 1];
        double windowSum = 0;

        // Calculate the initial window sum
        for (int i = 0; i < windowSize; i++) {
            windowSum = windowSum + numbersArray[i];
        }

        // Process the remaining windows
        for (int i = windowSize; i < n; i++) {
            averages[i - windowSize] = windowSum/windowSize; // Store the average for the current window
            windowSum = windowSum +( numbersArray[i] - numbersArray[i - windowSize]); // Slide the window
        }

        // Store the average for the last window
        averages[n - windowSize] = windowSum/windowSize;

        return averages;
    }

    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 22, 32,43,24, 21,245};
        int windowSize = 3;

        C1_SlidingWindowFixedSize c1_SlidingWindowFixedSizeObj1=new C1_SlidingWindowFixedSize();

        double[] result = c1_SlidingWindowFixedSizeObj1.calculateAverages(numbersArray, windowSize);

        System.out.println("Averages of subarrays with size " + windowSize + ":");
        for (double average : result) {
            System.out.println(average + " ");
        }
    }
}
