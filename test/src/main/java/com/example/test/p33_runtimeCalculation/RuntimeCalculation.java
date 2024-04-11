package com.example.test.p33_runtimeCalculation;



public class RuntimeCalculation {

    // Driver's code
    public static void main(String args[]) {

        // Measure the runtime of the method
        long startTime = System.nanoTime();
        double sqrt;



        for(int i=0; i < 2000000000; i++)
        {
            for(int j=0; j < 20; j++)
            {
                for(int k=0; k < 10; k++)
                {
                    sqrt =  Math.sqrt(k);
                }

            }


        }



        long endTime = System.nanoTime();
        System.out.println("\nstartTime=" + startTime + "\nendTime="+endTime);

        // Calculate and print the runtime in microseconds
        long elapsedTimeInNanoSecond = endTime - startTime;
        System.out.println("Runtime: " + elapsedTimeInNanoSecond + " nano-seconds");
        System.out.println("Runtime: " + elapsedTimeInNanoSecond/1000 + " micro-seconds");
        System.out.println("Runtime: " + elapsedTimeInNanoSecond/1000000 + " milli-seconds");
        System.out.println("Runtime: " + elapsedTimeInNanoSecond/1000000000 + " seconds");


    }
}


//output:
// startTime=1131755636343100
//endTime=1131784908729700
//Runtime: 29272386600 nano-seconds
//Runtime: 29272386 micro-seconds
//Runtime: 29272 milli-seconds
//Runtime: 29 seconds


