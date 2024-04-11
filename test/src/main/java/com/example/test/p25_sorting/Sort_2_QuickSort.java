package com.example.test.p25_sorting;

/*

Quicksort:
Average Case: O(n log n)
Worst Case: O(n^2) (but rarely occurs in practice with good pivot selection and randomization)
Quicksort is often considered one of the fastest sorting algorithms for general-purpose sorting.
Space Complexity: O(n)
Since we are recursively calling the quicksort function, an internal stack is used to store these function calls.
There will be, at most, n calls in the stack, and hence the space complexity will be O(n).

Merge Sort:
Average Case: O(n log n)
Worst Case: O(n log n)
Merge sort is a stable, comparison-based sorting algorithm that guarantees consistent performance.
Space Complexity: O(n)
Since we are recursively calling the MergeSort function, an internal stack is used to store these function calls.
There will be at most n calls in the stack, and hence, the space complexity will be O(n).

Heapsort:
Average Case: O(n log n)
Worst Case: O(n log n)
Heapsort is an in-place sorting algorithm with a consistent performance profile.


Timsort (a hybrid sorting algorithm derived from merge sort and insertion sort):
Average Case: O(n log n)
Worst Case: O(n log n)
Timsort is designed to perform well on many kinds of real-world data.
 */

public class Sort_2_QuickSort {


    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */

    public void quickSort(int[] array1)
    {
        quickSort(array1, 0, array1.length - 1);;
    }

    public void quickSort(int[] arr, int lowIndex, int highIndex)
    {
        if (lowIndex < highIndex)
        {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, lowIndex, highIndex);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, lowIndex, pi - 1);
            quickSort(arr, pi + 1, highIndex);
        }
    }



    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    public int partition(int[] arr, int low, int high)
    {

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++)
        {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot)
            {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }




    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Function to print an array
    public void printArray(int[] arr)
    {
        int size = arr.length;
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


    // Driver's code
    public static void main(String args[]) {
        int array1[] = { 2, 9, 7, 6, 5, 8, 43, 33, 45, 35 };

        // Measure the runtime of the method
        long startTime = System.nanoTime();



        // Function call
        Sort_2_QuickSort quickSortOb1 = new Sort_2_QuickSort();
        quickSortOb1.quickSort(array1);
        //quickSortOb1.quickSort(array1, 0, array1.length - 1);

        long endTime = System.nanoTime();

        System.out.println("\nstartTime=" + startTime + "\nendTime="+endTime);

        // Calculate and print the runtime in microseconds
        long elapsedTimeInNanoSecond = endTime - startTime;


        System.out.println("Runtime: " + elapsedTimeInNanoSecond + " nano-seconds");

        System.out.println("\nSorted array is");
        quickSortOb1.printArray(array1);
    }

}
