package com.example.test.miscellaneous.service.datastructures;


import java.util.*;
import java.util.logging.Logger;

public class DataStructure {
    private static final Logger logger = Logger.getLogger(DataStructure.class.getName());


    public String testvariousDataStructures() {
        logger.info("log entry:testvariousDataStructures method");




        logger.info("=======================================================");
        logger.info("testing hashmap::");
        //testing hashmap
        HashMap<Integer, String> hashMap_1 = new HashMap<Integer, String>();
        hashMap_1.put(6, "Tushar");
        hashMap_1.put(12, "Ashu");
        hashMap_1.put(5, "Zoya");
        hashMap_1.put(78, "Yash");
        hashMap_1.put(10, "Praveen");
        hashMap_1.put(67, "Boby");
        hashMap_1.put(1, "Ritesh");

        logger.info("printing hashmap entries:");
        Set set = hashMap_1.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            logger.info("mapEntry.getKey()==" + mapEntry.getKey() +
                    "::mapEntry.getValue()==" + mapEntry.getValue());
        }


        logger.info("=======================================================");
        logger.info("testing hashmap 2::");
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();//Creating HashMap
        hashMap.put(5, "Mango");  //Put elements in Map
        hashMap.put(3, "Apple");
        hashMap.put(8, "Banana");
        hashMap.put(1, "Grapes");
        logger.info("hashMap.entrySet()==");

        for (Map.Entry mapEntry : hashMap.entrySet()) {
            logger.info("mapEntry.getKey()==" + mapEntry.getKey()
                    + ":: mapEntry.getValue()==" + mapEntry.getValue());
        }













            logger.info("=======================================================");
            logger.info("hashMap.keySet==");
            for (int key : hashMap.keySet()) {
                logger.info("   " + key);
            }















            logger.info("=======================================================");
            logger.info("hashMap.values==");
            for (String value : hashMap.values()) {
                logger.info("   " + value);
            }





            logger.info("=======================================================");
            logger.info("linked hashMap demo::");
            LinkedHashMap<Integer, String> linkedHashMap_1 = new LinkedHashMap<Integer, String>();
            linkedHashMap_1.put(100, "Amit");
            linkedHashMap_1.put(102, "Rahul");
            linkedHashMap_1.put(105, "Vijay");
            linkedHashMap_1.put(104, "Rahul");


            logger.info("linked hashMap entries::");
            for (Map.Entry mapEntry1 : linkedHashMap_1.entrySet()) {
                logger.info("mapEntry1.getKey()==" +mapEntry1.getKey()
                        + ":: mapEntry1.getValue()==" + mapEntry1.getValue());
            }







        logger.info("=======================================================");
        logger.info("treeMap demo::");
        TreeMap<Integer, String> treeMap_1 = new TreeMap<Integer, String>();
        treeMap_1.put(100, "Amit");
        treeMap_1.put(102, "Rahul");
        treeMap_1.put(105, "Vijay");
        treeMap_1.put(104, "Rahul");
        treeMap_1.put(109, "Rahul7");
        treeMap_1.put(108, "Rahul8");


        logger.info("treeMap entries::");
        for (Map.Entry mapEntry1 : treeMap_1.entrySet()) {
            logger.info("mapEntry1.getKey()==" +mapEntry1.getKey()
                    + ":: mapEntry1.getValue()==" + mapEntry1.getValue());
        }

            logger.info("log exit:testvariousDataStructures method");



        return "success";

    }
}
