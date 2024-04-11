package com.example.test.p25_sorting;

public class TestSortings {

    public static void main(String args[])
    {
        //int[] array1={5,7,3,23,11,45,78,34,33};
        int[] array1=new int[100000000];
        int p=10;
        int q=20;
        for(int i=0; i < 100000000; i++)
        {
            if(i % 2 == 0)
            {
                array1[i] = p+1;
                p=p+1;
            }
            else
            {
                array1[i] = q+1;
                q= q+1;
            }
        }

        System.out.println("\nQuick Sort analysis:");
        long startTime = System.nanoTime();
        Sort_2_QuickSort quickSortObj1= new Sort_2_QuickSort();
        //quickSortObj1.quickSort(array1);
        //quickSortObj1.printArray(array1);

        long endTime = System.nanoTime();
        System.out.println("\nstartTime=" + startTime + "\nendTime  ="+endTime);

        // Calculate and print the runtime in microseconds
        long elapsedTimeInNanoSecond = endTime - startTime;
        System.out.println("Runtime: " + elapsedTimeInNanoSecond + " nano-seconds");











        //heapsort
        System.out.println("\nheapsort Sort analysis:");
        startTime = System.nanoTime();
        Sort_3_Heapsort sort_3_HeapsortObj1= new Sort_3_Heapsort();
        sort_3_HeapsortObj1.sort(array1);
        //sort_3_HeapsortObj1.printArray(array1);

        endTime = System.nanoTime();
        System.out.println("\nstartTime=" + startTime + "\nendTime  ="+endTime);

        // Calculate and print the runtime in microseconds
        elapsedTimeInNanoSecond = endTime - startTime;
        System.out.println("Runtime: " + elapsedTimeInNanoSecond + " nano-seconds");













        //mergesort
        System.out.println("\nmergesort Sort analysis:");
        startTime = System.nanoTime();
        Sort_1_MergeSort sort_1_MergeSortObj1= new Sort_1_MergeSort();
        sort_1_MergeSortObj1.performMergesort(array1);
        //sort_1_MergeSortObj1.printArray(array1);

        endTime = System.nanoTime();
        System.out.println("\nstartTime=" + startTime + "\nendTime  ="+endTime);

        // Calculate and print the runtime in microseconds
        elapsedTimeInNanoSecond = endTime - startTime;
        System.out.println("Runtime: " + elapsedTimeInNanoSecond + " nano-seconds");
    }





}
