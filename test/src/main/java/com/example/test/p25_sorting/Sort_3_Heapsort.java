package com.example.test.p25_sorting;

//Java program for implementation of Heap Sort

public class Sort_3_Heapsort {
	public void sort(int array1[]) 
	{
		int n = array1.length;

		// Build heap (rearrange array)
		for (int i = (n/2)-1; i >= 0; i--)  // i from (n/2)-1  down to 0
		{
			//System.out.print("\ni="+i);
			heapify(array1, n, i);
		}

		// One by one extract an element from heap
		for (int i = n - 1; i > 0; i--) 
		{
			// Move current root to end
			int temp = array1[0];
			array1[0] = array1[i];
			array1[i] = temp;

			// call max heapify on the reduced heap
			heapify(array1, i, 0);
		}
	}

	// To heapify a subtree rooted with node i which is
	// an index in arr[]. n is size of heap
	public void heapify(int array1[], int n, int i) {
		//System.out.print("\nlog entry: heapify");
		int largest = i; // Initialize largest as root
		int left = 2 * i + 1; // left = 2*i + 1
		int right = 2 * i + 2; // right = 2*i + 2

		//System.out.print("\nlargest=" + largest +": left=" + left+ ": right=" + right + ": n="+n);
		
		// If left child is larger than root
		if (left < n && array1[left] > array1[largest])
		{
			//System.out.print("\nlog entry: if (left < n && array1[left] > array1[largest])");
			//System.out.print("\n: array1[left]="+array1[left] + "array1[largest]="+array1[largest]);
			largest = left;
			//System.out.print("\nlargest="+largest);
		}
			

		// If right child is larger than largest so far
		if (right < n && array1[right] > array1[largest])
		{
			//System.out.print("\nlog entry: if (right < n && array1[right] > array1[largest])");
			//System.out.print("\n: array1[right]="+array1[right]);
			largest = right;
			//System.out.print("\nlargest="+largest);
		}
			

		// If largest is not root
		if (largest != i) 
		{
			//System.out.print("\nlog entry: if (largest != i) ");
			int swap = array1[i];
			array1[i] = array1[largest];
			array1[largest] = swap;

			// Recursively heapify the affected sub-tree
			heapify(array1, n, largest);
		}
	}

	/* A utility function to print array of size n */
	public void printArray(int array1[]) {
		int n = array1.length;

		for (int i = 0; i < n; ++i)
		{
			System.out.print(array1[i] + " ");
		}
		System.out.println();
	}

	// Driver's code
	public static void main(String args[]) {
		int array1[] = { 2, 9, 7, 6, 5, 8, 43, 33, 45, 35 };
		

		// Function call
		Sort_3_Heapsort heapsortOb1 = new Sort_3_Heapsort();
		heapsortOb1.sort(array1);

		System.out.println("\nSorted array is"); 
		heapsortOb1.printArray(array1);
	}
}

