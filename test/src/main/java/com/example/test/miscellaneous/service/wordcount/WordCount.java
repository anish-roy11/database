package com.example.test.miscellaneous.service.wordcount;

import com.example.test.miscellaneous.controller.MiscellaneousTestController;

import java.util.*;
import java.util.Map;
import java.util.logging.Logger;

public class WordCount {
    private static final Logger logger = Logger.getLogger(WordCount.class.getName());


    public String wordCount()
    {
        logger.info("log entry : wordCount method");
        String result = "success";

        StringBuilder stringBuilder_obj1 = new StringBuilder();

        String str1 = "Hello all, I welcome you to the Intellect World";

        int count=0;
        String[] str2 = str1.split(" ");

        Map<String, Integer> map1 = new HashMap<String, Integer>();
        logger.info("str2.length="+str2.length);
        for(int i=0; i < str2.length; i++)
        {
            String temp = str2[i];
            count=0;
            for(int j=0; j< str2.length; j++)
            {
                logger.info("str2[j]="+str2[j]);
                logger.info("temp="+temp);
                if(str2[j].equalsIgnoreCase(temp))
                {
                    count++;
                }


            }

            map1.put(temp,count);


        }
        stringBuilder_obj1.append("{");
        //logger.info("{");
        for(Map.Entry<String, Integer> entry: map1.entrySet())
        {
            //logger.info(entry.getKey() + "=" + entry.getValue() +",");
            stringBuilder_obj1.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
        }
        //logger.info("}");
        stringBuilder_obj1.append("}");
        logger.info(String.valueOf(stringBuilder_obj1));
        logger.info("log exit : wordCount method");
        return result;

    }







    public String wordCountUsingHashMap()
    {
        logger.info("log entry : wordCountUsingHashMap method");
        String result = "success";

        StringBuilder stringBuilder_obj1 = new StringBuilder();

        String str1 = "Hello all, I welcome you to the Intellect World Hello all, I welcome you to the Intellect World";

        int count=0;
        String[] str2 = str1.split(" ");

        Map<String, Integer> map1 = new HashMap<String, Integer>();
        logger.info("str2.length="+str2.length);

        String key;
        for(int i=0; i < str2.length; i++)
        {
            count=0;
            key = str2[i];

            if(null != map1.get(key))
            {
                count = map1.get(key) + 1;
            }
            else
            {
                count=1;
            }
            map1.put(key,count);


        }
        stringBuilder_obj1.append("{");

        for(Map.Entry<String, Integer> entry: map1.entrySet())
        {
            stringBuilder_obj1.append(entry.getKey()).append("=").append(entry.getValue()).append(",");
        }

        stringBuilder_obj1.append("}");
        logger.info(String.valueOf(stringBuilder_obj1));
        logger.info("log exit : wordCountUsingHashMap method");
        return result;

    }


}