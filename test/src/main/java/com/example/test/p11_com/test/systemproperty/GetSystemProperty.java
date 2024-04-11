package com.example.test.p11_com.test.systemproperty;

import java.util.Map;
import java.util.Properties;
import java.util.*;

public class GetSystemProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String separator = System.getProperty("file.separator");
        System.out.println("file separator=="+separator);
        
        Map<String, String> environment = System.getenv();
        
//        Set<String> keys = environment.keySet();
//        for (String k : keys) {
//            System.out.println("key=" + k);
//        }
        
        System.out.println("System environment key value pair values====");
        for (Map.Entry<String, String> entry : environment.entrySet()) {
        	String k = entry.getKey();
            String v = entry.getValue();
            System.out.println("key==" + k + ",         value==" + v);
            System.out.println("");
            
        }
        
        
        
        
        System.out.println("@@@@@=====================================================");
        System.out.println("@@@@@=====================================================");
        System.out.println("@@@@@=====================================================");
        
        System.out.println("System.getProperties=============");
        Properties systemProperties = System.getProperties();
        
        
        for (Map.Entry<Object, Object> entry :  systemProperties.entrySet()) {
        	String k = (String)entry.getKey();
            String v = (String)entry.getValue();
            System.out.println("key==" + k + ",         value==" + v);
            System.out.println("");
           
        }
        
        

	}

}


























