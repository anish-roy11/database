package com.example.test.p19_kthLargestElement;

public class C2_KthSmallestElementQuickSelect {



    public int findKthSmallest(int[] numberArray, int k) {
        if (k < 1 || k > numberArray.length) {
            throw new IllegalArgumentException("Invalid value of k");
        }
        int arrayLength=numberArray.length;

        // return quickSelect(array, 0th_elementPosition, lastElementPosition, kth_Element_Position_In_Sorted_Array);
        return quickSelect(numberArray, 0, arrayLength - 1, k-1);
    }




    private int quickSelect(int[] numberArray, int lowIndex, int highIndex, int k_minus_1) {
        if (lowIndex <= highIndex)
        {
            int pivotElementIndex = partition(numberArray, lowIndex, highIndex);

            if (pivotElementIndex == k_minus_1 )
            {
                return numberArray[k_minus_1];
            }
            else if (pivotElementIndex < k_minus_1)
            {
                return quickSelect(numberArray, pivotElementIndex + 1, highIndex, k_minus_1);
            }
            else
            {
                return quickSelect(numberArray, lowIndex, pivotElementIndex - 1, k_minus_1);
            }
        }

        return -1; // Not found
    }










    public int partition(int[] array, int lowIndex, int highIndex)
    {
        // pivot
        int pivot = array[highIndex];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (lowIndex - 1);

        for(int j = lowIndex; j <= (highIndex - 1); j++)
        {

            // If current element is smaller
            // than the pivot
            if (array[j] < pivot)
            {

                // Increment index of
                // smaller element
                i++;
                swap(array, i, j);
            }
        } // for loop ends
        swap(array, i + 1, highIndex);
        return (i + 1);
    }



    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }





    public static void main(String[] args) {
        C2_KthSmallestElementQuickSelect c2_KthSmallestElementQuickSelect_Obj1 =new C2_KthSmallestElementQuickSelect();

        int[] numberArray = { 3, 1, 4, 98, 2, 6, 5, 9, 7, 8, 19, 46, 32, 23, 87 };
        //int[] numberArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 23, 432, 46, 87, 98 };
        int k;
        int kthSmallest;

        k=10;
        kthSmallest = c2_KthSmallestElementQuickSelect_Obj1.findKthSmallest(numberArray, k);
        System.out.println("\nThe " + k + "th smallest element is: " + kthSmallest);


        k=9;
        kthSmallest = c2_KthSmallestElementQuickSelect_Obj1.findKthSmallest(numberArray, k);
        System.out.println("\nThe " + k + "th smallest element is: " + kthSmallest);


        k=5;
        kthSmallest = c2_KthSmallestElementQuickSelect_Obj1.findKthSmallest(numberArray, k);
        System.out.println("\nThe " + k + "th smallest element is: " + kthSmallest);

        k=11;
        kthSmallest = c2_KthSmallestElementQuickSelect_Obj1.findKthSmallest(numberArray, k);
        System.out.println("\nThe " + k + "th smallest element is: " + kthSmallest);
    }
}
