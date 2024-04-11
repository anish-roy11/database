package com.example.test.p44_allSubarraysOfAnArray;


public class AllSubArraysOfAnArray
{
    public void findAllSubarrays(int[] array)
    {
        int n = array.length;

        // Outer loop: starting index of subarray
        for (int start = 0; start <= n-1; start++)
        {
            System.out.print("\nstart="+start);
            // Inner loop: ending index of subarray
            for (int end = start; end <= n-1; end++)
            {
                System.out.print("\nend="+end);
                // Print the subarray from index start to end
                System.out.print("\narray[k]=");
                for (int k = start; k <= end; k++)
                {
                    System.out.print(array[k] + "  " );
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5};
        AllSubArraysOfAnArray allSubArraysOfAnArray_obj1 = new AllSubArraysOfAnArray();
        allSubArraysOfAnArray_obj1.findAllSubarrays(array);
    }
}
