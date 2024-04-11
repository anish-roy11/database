package com.example.test.permutation.service;


import com.example.test.permutation.controller.PermutationController;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class PermutationServiceImpl {
    private static final Logger logger = Logger.getLogger(PermutationServiceImpl.class.getName());

    public void printPermutn(String str, String ans)
    {

        //logger.info("logEntry:/printPermutn  method");
        // If string is empty
        if (str.length() == 0) {
            logger.info("string=="+ ans + "  ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // Recursive call
            printPermutn(ros, ans + ch);
        }
    }


    public void printDistinctPermutn(String str, String ans)
    {
        //logger.info("logEntry:/printDistinctPermutn  method");

        // If string is empty
        if (str.length() == 0) {

            // print ans
            logger.info("string=="+ ans + " ");
            return;
        }

        // Make a boolean array of size '26' which
        // stores false by default and make true
        // at the position which alphabet is being
        // used
        boolean alpha[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                    str.substring(i + 1);

            // If the character has not been used
            // then recursive call will take place.
            // Otherwise, there will be no recursive
            // call
            if (alpha[ch - 'a'] == false)
                printDistinctPermutn(ros, ans + ch);
            alpha[ch - 'a'] = true;
        }
    }
}
