package com.example.test.p17_kadane;

class LargestSumContiguousSubarray {

	static void maxSubArraySum(int array1[], int arraySize) 
	{
		int globalMaximum = Integer.MIN_VALUE;
		int localMaximum = 0;
		int startIndex = 0; 
		int endIndex = 0;
		int s = 0;
		int n = arraySize;
		//System.out.print("\nmax_so_far=" + max_so_far);

		for (int i = 0; i <= n-1; i++)
		{
			//System.out.print("\ni=" + i);
			localMaximum = localMaximum + array1[i];
			//System.out.print("\nmax_ending_here=" + max_ending_here);

			if (globalMaximum < localMaximum)
			{
				//System.out.print("\nentry :if (max_so_far < max_ending_here)");
				globalMaximum = localMaximum;
				startIndex = s;
				endIndex = i;
			}

			if (localMaximum < 0)
			{
				//System.out.print("\nentry :if (max_ending_here < 0)");
				localMaximum = 0;
				s = i + 1;
				//System.out.print("\nmax_ending_here=" + max_ending_here);
				//System.out.print("\ns=" + s);
			}
		} // i loop ends

		System.out.println("\nMaximum contiguous sum is=" + globalMaximum);
		System.out.println("Starting index=" + startIndex);
		System.out.println("Ending index=" + endIndex);
	}

	// Driver code
	public static void main(String[] args) {
		// int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		//int array1[] = { 4, 0, -3, -1, -2, 4, 0, 5, -3 };
		int array1[] = { -4, -9, -3, -8, 4, -2, 10, -5, -3 };
		int arraySize = array1.length;
		maxSubArraySum(array1, arraySize);
	}
}

//output:
// Maximum contiguous sum is=12
//Starting index=4
//Ending index=6



class ListNode {
	int val;
	ListNode next;

	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}
