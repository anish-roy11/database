package com.example.test.pairFrequencyCounter;

import java.util.HashMap;

public class PairFrequencyCounter {

    public static void main(String[] args) {
//        String[] words = {
//                "t h i s _",
//                "t h e r e _",
//                "t h a t _",
//                "h a t _",
//                "w h a t _",
//                "w h e n _",
//                "b a t _",
//                "m e r e _",
//                "h e r _",
//                "h e r e _",
//                "a r e _",
//                "h a r e _"
//        };
        String[] words={
                "t h i s _",
                "t he re_",
                "t h a t _",
                "h a t _",
                "w h a t _",
                "w he n _",
                "b a t _",
                "m e re_",
                "he r _",
                "he re_",
                "a re_",
                "h a re_"



        };

        HashMap<String, Integer> pairFrequencies = new HashMap<>();

        for (String word : words) {
            String[] characters = word.split("\\s+");
            for (int i = 0; i < characters.length - 1; i++) {
                String pair = characters[i] + characters[i + 1];
                pairFrequencies.put(pair, pairFrequencies.getOrDefault(pair, 0) + 1);
            }
        }

        // Display pair frequencies
        for (String pair : pairFrequencies.keySet()) {
            System.out.println(pair + ": " + pairFrequencies.get(pair));
        }
    }
}
