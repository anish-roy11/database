package com.example.test.miscellaneous.service.regularExpression;

import com.example.test.miscellaneous.service.TestMiscellaneous;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {

    private static final Logger logger = Logger.getLogger(TestRegularExpression.class.getName());

    public String testRegularRxpressionMethod(){
        logger.info("logEntry:testRegularRxpressionMethod method");

        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaaaab");
        boolean isMatchesTrue = matcher.matches();
        String result=null;

        logger.info("isMatchesTrue=" + isMatchesTrue);
        if(isMatchesTrue == true)
        {
            result = "true";
        }
        else
        {
            result = "false";
        }

        boolean result2 = Pattern.matches("a*b", "aaaaab");
        logger.info("result2="+result2);

        //X{n}
        boolean result3 = Pattern.matches("a{4,9}", "aaaaab");
        logger.info("result3=" + result3);

        boolean result4 = Pattern.matches("a{3}", "aaaaab");
        logger.info("result4=" + result4);

        boolean result5 = Pattern.matches("a{4,9}", "aaaaa");
        logger.info("result5=" + result5);

        boolean result6 = Pattern.matches("a{5}", "aaaaa");
        logger.info("result6=" + result6);

        logger.info("logExit:testRegularRxpressionMethod method");


        Pattern pattern_2 = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher_2 = pattern_2.matcher("Visit W3Schools!");
        boolean matchFound = matcher_2.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }


        return result;
    }
}
