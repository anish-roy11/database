package com.example.test.p19_kthLargestElement;

import java.util.Random;

public class C3_KthLargestElementUsingQuickSelect {
	

	
	public  int findKthLargest(int[] numberArray, int k) 
	{
		if (numberArray == null || numberArray.length == 0 || k < 1 || k > numberArray.length) 
		{
			throw new IllegalArgumentException("Invalid input");
		}
		

		int noOfElements = numberArray.length;

		return quickSelect(numberArray, 0, (noOfElements-1), (noOfElements - k));
	}

	private  int quickSelect(int[] numberArray, int lowIndex, int rightIndex, int k)
	{
		if (lowIndex == rightIndex)
		{
			return numberArray[lowIndex];
		}

		int pivotIndex = partition(numberArray, lowIndex, rightIndex);

		if (k == pivotIndex) 
		{
			return numberArray[pivotIndex];
		} 
		else if (k < pivotIndex) 
		{
			return quickSelect(numberArray, lowIndex, pivotIndex - 1, k);
		} 
		else 
		{
			return quickSelect(numberArray, pivotIndex + 1, rightIndex, k);
		}
	}

	private  int partition(int[] numberArray, int leftIndex, int rightIndex)
	{
		int randomIndex = new Random().nextInt(rightIndex - leftIndex + 1) + leftIndex;
		swap(numberArray, randomIndex, rightIndex);

		int pivot = numberArray[rightIndex];
		int i = leftIndex - 1;

		for (int j = leftIndex; j < rightIndex; j++)
		{
			if (numberArray[j] <= pivot) 
			{
				i++;
				swap(numberArray, i, j);
			}
		}

		swap(numberArray, i + 1, rightIndex);
		return i + 1;
	}

	private  void swap(int[] numberArray, int i, int j) 
	{
		int temp = numberArray[i];
		numberArray[i] = numberArray[j];
		numberArray[j] = temp;
	}


	public static void main(String[] args) {

		int[] numberArray = { 3, 1, 4, 98, 2, 6, 5, 9, 7, 8, 19, 46, 32, 23, 87 };
		//int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 23, 432, 46, 87, 98 };
		int k = 4;

		C3_KthLargestElementUsingQuickSelect c3_KthLargestElementUsingQuickSelect_obj1 =new C3_KthLargestElementUsingQuickSelect();

		int kthLargest = c3_KthLargestElementUsingQuickSelect_obj1.findKthLargest(numberArray, k);
		System.out.println("The " + k + "th largest element is: " + kthLargest);
	}

}
