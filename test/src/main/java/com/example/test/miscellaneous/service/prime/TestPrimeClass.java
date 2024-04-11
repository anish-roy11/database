package com.example.test.miscellaneous.service.prime;

import com.example.test.miscellaneous.controller.MiscellaneousTestController;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TestPrimeClass {
    private static final Logger logger = Logger.getLogger(TestPrimeClass.class.getName());

    public String  getPrime()
    {
        logger.info("log entry getPrime method");
        String result ="success";

        int count =0;
        int currentValue=2;
        boolean isPrime=true;
        List<Integer> primeNumbers = new ArrayList<Integer>();

        while(count < 20){
            isPrime = true;
            for(int i = 2; i <= (currentValue - 1); i++ )
            {
                logger.info("i=="+ i + ":currentValue=="+currentValue +":count=="+count);
                if((currentValue % i == 0) &&  (i < currentValue))
                {
                    isPrime =false;
                    break;
                }
            }

            if(isPrime ==true)
            {
                primeNumbers.add(currentValue);
                count++;
            }
            currentValue++;


        }  //end of while
        logger.info("primeNumbers==");
        for(int i=0; i < primeNumbers.size(); i++)
        {
            logger.info(" "+primeNumbers.get(i));
        }
        logger.info("log exit getPrime method==");
        return result;
    }









    public String  getMissingNumber()
    {
        logger.info("log entry getMissingNumber method");
        String result ="success";
        int missingValue=0;
        int currentValue=0;
        int currentPlus_1_Value=0;
        int currentPlus_2_Value=0;

        List<Integer> numberList = new ArrayList<Integer>();
        boolean isMissing = false;
        for(int i=1; i<= 8; i++)
        {
            numberList.add(i);
        }
        for(int i=10; i<= 20; i++)
        {
            numberList.add(i);
        }

        logger.info("numberList elements==");
        for(int k=0; k< numberList.size(); k++)
        {

            logger.info(" "+ numberList.get(k));
        }

        for(int j=0; j< numberList.size()-2; j++)
        {
            if( !(     (numberList.get(j+1) == numberList.get(j) + 1 )
                    && (numberList.get(j+2) == numberList.get(j+1) + 1 )  )
            )
            {
                isMissing = true;
                currentValue = numberList.get(j);
                currentPlus_1_Value=numberList.get(j+1);
                currentPlus_2_Value=numberList.get(j+2);
                break;

            }



        }

        if(isMissing == true)
        {
            if(currentPlus_1_Value > currentValue +1)
            {
                missingValue = currentValue + 1;
            }

            if(currentPlus_2_Value > currentPlus_1_Value +1)
            {
                missingValue = currentPlus_1_Value +1;
            }
        }



        logger.info("missingValue==" + missingValue);

        logger.info("log exit getMissingNumber method==");
        return result;
    }

}
