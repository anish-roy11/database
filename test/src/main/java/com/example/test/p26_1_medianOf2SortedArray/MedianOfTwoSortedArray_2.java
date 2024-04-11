package com.example.test.p26_1_medianOf2SortedArray;

class MedianOfTwoSortedArray_2 
{
	public double findMedianSortedArrays(int[] nums1, int[] nums2) 
	{
		if (nums1.length > nums2.length) 
		{
			return findMedianSortedArrays(nums2, nums1);
		}

		int m = nums1.length; 
		int n = nums2.length;
		int left = 0;
		int right = m;

		while (left <= right) 
		{
			int partitionA = (left + right) / 2;
			int partitionB = (m + n + 1) / 2 - partitionA;

			int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : nums1[partitionA - 1];
			int minRightA = (partitionA == m) ? Integer.MAX_VALUE : nums1[partitionA];
			int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : nums2[partitionB - 1];
			int minRightB = (partitionB == n) ? Integer.MAX_VALUE : nums2[partitionB];

			if (maxLeftA <= minRightB && maxLeftB <= minRightA) 
			{
				if ((m + n) % 2 == 0) 
				{
					return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
				} 
				else 
				{
					return Math.max(maxLeftA, maxLeftB);
				}
			} 
			else if (maxLeftA > minRightB) 
			{
				right = partitionA - 1;
			} 
			else 
			{
				left = partitionA + 1;
			}
		}
		return 0.0;
	}

	public static void main(String[] args) 
	{
		MedianOfTwoSortedArray_2 medianOfTwoSortedArray_2_ob1 = new MedianOfTwoSortedArray_2();
		int[] nums1 = { 1, 3, 5, 7, 8, 9, 12, 23, 34, 45, 58, 89 };
		int[] nums2 = { 2, 4, 6, 8, 10, 11 };
		double median = medianOfTwoSortedArray_2_ob1.findMedianSortedArrays(nums1, nums2);
		System.out.println("Median: " + median);
	}
}