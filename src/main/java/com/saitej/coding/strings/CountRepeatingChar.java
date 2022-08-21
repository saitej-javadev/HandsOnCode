package com.saitej.coding.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountRepeatingChar {
    public static void main(String[] args) {
       String str= "abbccc";
      /*   char ch = 'a';
        long count = str.chars().filter(c -> c == ch).count();
        System.out.println("total a's : " +count);
*/

        Map<String, Integer> occurrences = new LinkedHashMap<String, Integer>();
        System.out.println("Before"+ occurrences);
        String[] split = str.split("");
        for (String ch : split) {
            Integer count = occurrences.get(ch);
            int value =0;
            if (count==null)
                value=1;
            else
                value =count+1;

            occurrences.put(ch, value);
        }
        System.out.println(occurrences);


    }
}
