package com.example.test.p34CharAtIndexOfString;

public class CharAtIndexOfString {
    String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static void main(String args[])
    {
        CharAtIndexOfString charAtIndexOfStringObj1 = new CharAtIndexOfString();
        for(int i=0; i < charAtIndexOfStringObj1.str1.length(); i++)
        {

            int index = charAtIndexOfStringObj1.str1.charAt(i);
            char characterValue = charAtIndexOfStringObj1.str1.charAt(i);
           System.out.println("ascii value of " +characterValue+"="+index);
        }
    }
}
