package com.example.test.p25_sorting;



public class Heapify_CreateBinaryHeapFromArray {

    public void heapify(int[] arr, int n, int i) {
        int largest = i;
        int leftChildIndex = 2 * i + 1;
        int rightChildIndex = 2 * i + 2;

        // Check if left child exists and is greater than the root
        if (leftChildIndex < n && arr[leftChildIndex] > arr[largest])
        {
            largest = leftChildIndex;
        }

        // Check if right child exists and is greater than the largest so far
        if (rightChildIndex < n && arr[rightChildIndex] > arr[largest])
        {
            largest = rightChildIndex;
        }

        // Change root if needed
        if (largest != i) 
        {
        	//swap arr[i] and arr[largest]
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    public void createHeapFromArray(int[] arr) 
    {
        int n = arr.length;

        // Start from the last non-leaf node and heapify each node in reverse order
        // Parent node (non-leaf nodes) are from 0 to (n/2)-1 th node
        // if parent is at index i, left child is at 2i+1, right child is at 2i+2

        for (int i = (n/2) - 1; i >= 0; i--)   // i=(n/2)-1  down to 0 
        {
            heapify(arr, n, i);
        }
    }

    public static void main(String[] args) 
    {
        int[] inputArray = {4, 10, 3, 5, 1,89,56,78,54,9,34};
        Heapify_CreateBinaryHeapFromArray createBinaryHeapFromArray_Obj1 =new Heapify_CreateBinaryHeapFromArray();

        createBinaryHeapFromArray_Obj1.createHeapFromArray(inputArray);

        System.out.print("Binary Heap: ");
        for (int value : inputArray) 
        {
            System.out.print(value + " ");
        }
    }
}
