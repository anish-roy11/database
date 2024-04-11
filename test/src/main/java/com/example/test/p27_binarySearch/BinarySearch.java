package com.example.test.p27_binarySearch;

public class BinarySearch {

	// Returns the index of key in the sorted array arr,
	// or -1 if key is not present in arr.
	public void binarySearch(int[] arr, int key) 
	{
		int lowIndex = 0;
		int highIndex = arr.length - 1;
		int searchResult = -1;

		while (lowIndex <= highIndex) 
		{
			int middleIndex = lowIndex + (highIndex - lowIndex) / 2;

			if (arr[middleIndex] == key) 
			{
				searchResult =  middleIndex; // Key found
				break;
			} 
			else if (arr[middleIndex] < key) 
			{
				lowIndex = middleIndex + 1; // Search in the right half
			} 
			else 
			{
				highIndex = middleIndex - 1; // Search in the left half
			}
		}
		
		if (searchResult != -1) 
		{
			System.out.println("Key:" + key + ": found at index:" + searchResult);
		} 
		else 
		{
			System.out.println("Key:" + key + ":not found in the array.");
		}

		
	}

	public static void main(String[] args) 
	{
		int[] sortedArray1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int keyToSearch1 = 7;

		BinarySearch binarySearch_Obj1 = new BinarySearch();
		binarySearch_Obj1.binarySearch(sortedArray1, keyToSearch1);
		
		
		int[] sortedArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int keyToSearch2 = 16;

		BinarySearch binarySearch_Obj2 = new BinarySearch();
		binarySearch_Obj2.binarySearch(sortedArray2, keyToSearch2);

		
	}
}
