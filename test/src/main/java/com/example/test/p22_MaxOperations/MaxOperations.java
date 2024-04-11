package com.example.test.p22_MaxOperations;

import java.util.HashMap;
import java.util.Map;

public class MaxOperations {
	//int[] numArray1 = {1, 2, 3, 4, 5, 4,8,3,23,43,12,23};
	//int[] numArray1 = {3,1,3,4,3};
	
	//3,1,3,4,3
	
    //int k = 6;
    int[] numArray1 = {1,2,3,4};
    int k = 5;

    public  int maxOperations() {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int number : numArray1) 
        {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> eachEntry : frequencyMap.entrySet()) 
        {
            System.out.println("key=" + eachEntry.getKey() + ":value="+ eachEntry.getValue());
        }
            

        int maxOperations = 0;

        for (int number : numArray1) 
        {
        	System.out.println("number="+number);
            if (frequencyMap.containsKey(number) 
            		&& frequencyMap.containsKey(k - number) 
            		&& frequencyMap.get(number) > 0 
            		&& frequencyMap.get(k - number) > 0
            	) 
            {
            	System.out.println("log entry:if (frequencyMap.containsKey(number) ");
                
                frequencyMap.put(number, frequencyMap.get(number) - 1);
                frequencyMap.put(k - number, frequencyMap.get(k - number) - 1);
                if(frequencyMap.get(number) >= 0 && frequencyMap.get(k - number) >= 0)
                {
                	maxOperations++;
                }
            }
            System.out.println("");
            
            for (Map.Entry<Integer, Integer> eachEntry : frequencyMap.entrySet()) 
            {
                System.out.println("key=" + eachEntry.getKey() + ":value="+ eachEntry.getValue());
            }
        }

        return maxOperations;
    }

   
}
