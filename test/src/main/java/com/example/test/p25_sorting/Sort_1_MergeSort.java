package com.example.test.p25_sorting;

public class Sort_1_MergeSort {

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    public void merge(int arr[], int leftIndex, int middleIndex, int rightIndex)
    {
        // Find sizes of two subarrays to be merged
        int n1 = middleIndex - leftIndex + 1;
        int n2 = rightIndex - middleIndex;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i){
            L[i] = arr[leftIndex + i];
        }

        for (int j = 0; j < n2; ++j){
            R[j] = arr[middleIndex + 1 + j];
        }


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = leftIndex;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    public void performMergesort(int array1[])
    {
        int n=array1.length;
        mergesort(array1, 0, n - 1);
    }


    // Main function that sorts arr[l..r] using
    // merge()
    public void mergesort(int arr[], int leftIndex, int rightIndex)
    {
        if (leftIndex < rightIndex) {
            // Find the middle point
            int middleIndex = leftIndex + (rightIndex-leftIndex)/2;

            // Sort first and second halves
            mergesort(arr, leftIndex, middleIndex);
            mergesort(arr, middleIndex + 1, rightIndex);

            // Merge the sorted halves
            merge(arr, leftIndex, middleIndex, rightIndex);
        }
    }

    /* A utility function to print array of size n */
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    // Driver code

    public static void main(String args[]) {
        int array1[] = { 2, 9, 7, 6, 5, 8, 43, 33, 45, 35 };


        // Function call
        Sort_1_MergeSort mergeSort_ob1 = new Sort_1_MergeSort();
        //mergeSort_ob1.mergesort(array1, 0, array1.length - 1);
        mergeSort_ob1.performMergesort(array1);

        System.out.println("\nSorted array is");
        mergeSort_ob1.printArray(array1);
    }

}




