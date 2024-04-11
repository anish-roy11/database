package com.example.test.p40_activitySelection;

/*

Problem:
You are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person, assuming that a person can only work on a single activity at a time.

Examples:

Input: start[]  =  {10, 12, 20}, finish[] =  {20, 25, 30}
Output: 0 2
Explanation: A person can perform at most two activities. The
maximum set of activities that can be executed
is {0, 2} [ These are indexes in start[] and finish[] ]

Input: start[]  =  {1, 3, 0, 5, 8, 5}, finish[] =  {2, 4, 6, 7, 9, 9};
Output: 0 1 3 4
Explanation: A person can perform at most four activities. The
maximum set of activities that can be executed
is {0, 1, 3, 4} [ These are indexes in start[] and finish[]

Approach: To solve the problem follow the below idea:

The greedy choice is to always pick the next activity whose finish time is the least among
the remaining activities and the start time is more than or equal to the finish time of the previously selected activity.
We can sort the activities according to their finishing time so that
we always consider the next activity as the minimum finishing time activity

Follow the given steps to solve the problem:

Sort the activities according to their finishing time
Select the first activity from the sorted array and print it
Do the following for the remaining activities in the sorted array
If the start time of this activity is greater than or equal to the finish time of
the previously selected activity then select this activity and print it
Note: In the implementation, it is assumed that the activities are already sorted
according to their finish time, otherwise the time complexity will rise to O(N*log(N)) and
Auxiliary Space will rise to O(N), as we have to create a 2-D array for
storing the start and finish times together.

Below is the implementation of the above approach.

 */

// Java program for activity selection problem.

// The following implementation assumes that the activities
// are already sorted according to their finish time
import java.io.*;
import java.lang.*;
import java.util.*;

public class ActivitySelection {
    // Prints a maximum set of activities that can be done
    // by a single person, one at a time.
    public void printMaxActivities(int startTime[], int finishTime[], int n)
    {
        int i, j;

        System.out.println("Following activities are selected");

        // The first activity always gets selected
        i = 0;
        System.out.print(i + " ");

        // Consider rest of the activities
        for (j = 1; j < n; j++) {
            // If this activity has start time greater than
            // or equal to the finish time of previously
            // selected activity, then select it
            if (startTime[j] >= finishTime[i]) {
                System.out.print(j + " ");
                i = j;
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int startTime[] = { 1, 3, 0, 5, 8, 5 };
        int finishTime[] = { 2, 4, 6, 7, 9, 9 };
        int n = startTime.length;

        ActivitySelection activitySelection_Obj1=new ActivitySelection();

        // Function call
        activitySelection_Obj1.printMaxActivities(startTime, finishTime, n);
    }
}