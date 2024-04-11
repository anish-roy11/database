package com.example.test.p25_sorting;

import java.util.Arrays;




public class Sort_4_Timsort {

    private static final int MIN_MERGE = 32;


    public void insertionSort(int[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public void merge(int[] arr, int left, int mid, int right) {
        int len1 = mid - left + 1;
        int len2 = right - mid;

        int[] leftArray = new int[len1];
        int[] rightArray = new int[len2];

        System.arraycopy(arr, left, leftArray, 0, len1);
        System.arraycopy(arr, mid + 1, rightArray, 0, len2);

        int i = 0, j = 0;
        int k = left;

        while (i < len1 && j < len2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < len1) {
            arr[k++] = leftArray[i++];
        }

        while (j < len2) {
            arr[k++] = rightArray[j++];
        }
    }

    public void timSort(int[] arr) {
        int n = arr.length;


        // Sort individual subarrays of size MIN_MERGE
        for (int i = 0; i < n; i += MIN_MERGE) {
            insertionSort(arr, i, Math.min((i + MIN_MERGE - 1), (n - 1)));
        }

        // Merge subarrays to build larger sorted arrays
        for (int size = MIN_MERGE; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));

                if (mid < right) {
                    merge(arr, left, mid, right);
                }
            }
        }
    }

    public static void main(String[] args) {
        Sort_4_Timsort timsort_obj1 = new Sort_4_Timsort();

        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Original Array: " + Arrays.toString(array));

        // Sorting the array using Timsort
        timsort_obj1.timSort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

}

