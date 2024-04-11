
package com.example.test.p20_PriorityQueue;

public class PriorityQueueUsingBinaryHeap {

    int[] heap = new int[50];
    int size = -1;

    
    
    
    //Function to return the index of the
    // parent node of a given node
    public int getParentIndex(int i) 
    {
        return (i - 1) / 2;
    }

    
    
    
    
    
    //Function to return the index of the
    // left child of the given node
    public int getLeftChildIndex(int i) 
    {
        return ((2 * i) + 1);
    }

    
    
    
    
    
    
    
    
    
    //Function to return the index of the
    // right child of the given node
    public int getRightChildIndex(int i) 
    {
        return ((2 * i) + 2);
    }

    
    
    
    
    
    
    //Function to shift up the
    // node in order to maintain
    // the heap property
    public void shiftUp(int size) 
    {
        while (size > 0 && heap[getParentIndex(size)] < heap[size]) 
        {
            // Swap parent and current node
            swap(getParentIndex(size), size);

            // Update i to parent of i
            size = getParentIndex(size);
        }
    }

    
    
    
    
    
    
    
    
    
    //Function to shift down the node in
    // order to maintain the heap property
    public void shiftDown(int i) 
    {
        int maxIndex = i;

        // Left Child
        int leftChildIndex = getLeftChildIndex(i);

        if (leftChildIndex <= size && heap[leftChildIndex] > heap[maxIndex]) 
        {
            maxIndex = leftChildIndex;
        }

        // Right Child
        int r = getRightChildIndex(i);

        if (r <= size && heap[r] > heap[maxIndex]) 
        {
            maxIndex = r;
        }


        // If i not same as maxIndex
        if (i != maxIndex) 
        {
            swap(i, maxIndex);
            shiftDown(maxIndex);
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    //Function to insert a
    // new element in
    // the Binary Heap
    public void insert(int p) 
    {
        size = size + 1;
        heap[size] = p;

        // Shift Up to maintain
        // heap property
        shiftUp(size);
    }

    
    
    
    
    
    
    
    
    
    
    
    
    //Function to extract
    // the element with
    // maximum priority
    public int extractMax() 
    {
        int result = heap[0];

        // Replace the value
        // at the root with
        // the last leaf

        heap[0] = heap[size];
        size = size - 1;

        // Shift down the replaced
        // element to maintain the
        // heap property
        shiftDown(0);
        return result;
    }

    
    
    
    
    
    
    
    
    
    
    //Function to change the priority
    // of an element
    public void changePriority(int i, int p) 
    {
        int oldp = heap[i];
        heap[i] = p;

        if (p > oldp) 
        {
            shiftUp(i);
        } 
        else 
        {
            shiftDown(i);
        }
    }

    
    
    
    
    
    
    
    
    
    
    //Function to get value of
    // the current maximum element
    public int getMax() 
    {
        return heap[0];
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //Function to remove the element
    // located at given index
    public void remove(int i) 
    {
        heap[i] = getMax() + 1;

        // Shift the node to the root
        // of the heap
        shiftUp(i);

        // Extract the node
        extractMax();
    }

    
    
    
    
    public void swap(int i, int j) 
    {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    
    
    
    
    
    void printPriorityQueue()
    {
    	//System.out.print("log entry: printPriorityQueue");
    	System.out.print("\n");
    	int i=0;
    	while (i <= size) 
        {
            System.out.print(heap[i] + " ");
            i++;
        }

        System.out.print("\n");
        //System.out.print("log exit: printPriorityQueue");
        System.out.print("\n");
    }
    
    
    
    
    
    
    //Driver Code
    public static void main(String[] args) {

        PriorityQueueUsingBinaryHeap priorityQueueUsingHeapObj1 = new PriorityQueueUsingBinaryHeap();
        /*
         *  45 
         * /  \ 
         * 31   14 
         * / \   / \ 
         * 13 20 7 11 
         * / \ 
         * 12 7 
         * Create a priority queue shown in
         * example in a binary max heap form. Queue will be represented in the form of
         * array as: 
         * 45 31 14 13 20 7 11 12 7
         */

        // Insert the element to the
        // priority queue
        priorityQueueUsingHeapObj1.insert(45);
        priorityQueueUsingHeapObj1.insert(20);
        priorityQueueUsingHeapObj1.insert(14);
        priorityQueueUsingHeapObj1.insert(12);
        priorityQueueUsingHeapObj1.insert(31);
        priorityQueueUsingHeapObj1.insert(7);
        priorityQueueUsingHeapObj1.insert(11);
        priorityQueueUsingHeapObj1.insert(13);
        priorityQueueUsingHeapObj1.insert(7);
        
        
        
        // Priority queue before extracting max
        System.out.print("Priority Queue : ");
        priorityQueueUsingHeapObj1.printPriorityQueue();

        System.out.print("\n");
        
        // Node with maximum priority
        System.out.print("Node with maximum priority : " + priorityQueueUsingHeapObj1.extractMax() + "\n");
        
        // Priority queue after extracting max
        System.out.print("Priority queue after " + "extracting maximum : ");
        priorityQueueUsingHeapObj1.printPriorityQueue();
        

        System.out.print("\n");


        // Change the priority of element
        // present at index 2 to 49
        priorityQueueUsingHeapObj1.changePriority(2, 49);
        System.out.print("Priority queue after " + "priority change : ");
        priorityQueueUsingHeapObj1.printPriorityQueue();

        System.out.print("\n");


        // Remove element at index 3
        priorityQueueUsingHeapObj1.remove(3);
        System.out.print("Priority queue after " + "removing the element : ");
        priorityQueueUsingHeapObj1.printPriorityQueue();
        

    }
}
