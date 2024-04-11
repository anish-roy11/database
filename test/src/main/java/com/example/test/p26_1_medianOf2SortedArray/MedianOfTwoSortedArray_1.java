package com.example.test.p26_1_medianOf2SortedArray;

/*
 * To find the median of two sorted arrays with an overall run time complexity of O(log(min(m, n))), 
 * you can use a binary search algorithm. 
 * The idea is to partition the two arrays in such a way that 
 * the number of elements on the left side is 
 * equal to the number of elements on the right side, 
 * and the maximum element on the left side is 
 * smaller than the minimum element on the right side.
 */
public class MedianOfTwoSortedArray_1 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) 
	{
		// Ensure nums1 is the smaller array
		if (nums1.length > nums2.length) 
		{
			int[] temp = nums1;
			nums1 = nums2;
			nums2 = temp;
		}

		int n1 = nums1.length;
		int n2 = nums2.length;

		int lowIndex = 0;
		int highIndex = n1;

		while (lowIndex <= highIndex)
		{
			int partitionX = (lowIndex + highIndex) / 2;
			int partitionY =( (n1 + n2 + 1) / 2 ) - partitionX;

			int maxX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
			int minX = (partitionX == n1) ? Integer.MAX_VALUE : nums1[partitionX];

			int maxY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
			int minY = (partitionY == n2) ? Integer.MAX_VALUE : nums2[partitionY];

			if (maxX <= minY && maxY <= minX) 
			{
				// We found the correct partition
				if ((n1 + n2) % 2 == 0) 
				{
					return (double) (Math.max(maxX, maxY) + Math.min(minX, minY)) / 2;
				} 
				else 
				{
					return Math.max(maxX, maxY);
				}
			}
			else if (maxX > minY) 
			{
				// Move partitionX to the left
				highIndex = partitionX - 1;
			} 
			else 
			{
				// Move partitionX to the right
				lowIndex = partitionX + 1;
			}
		}

		// Should never reach here
		throw new IllegalArgumentException("Input arrays are not sorted.");
	}

	public static void main(String[] args) {
		MedianOfTwoSortedArray_1 medianOfTwoSortedArray_1_ob1 = new MedianOfTwoSortedArray_1();
		int[] nums1 = { 1, 3 ,5,7,8,9,12,23,34,45,58,89};
		int[] nums2 = { 2,4,6,8,10,11 };
		double median = medianOfTwoSortedArray_1_ob1.findMedianSortedArrays(nums1, nums2);
		System.out.println("Median: " + median);
	}
}
