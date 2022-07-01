package com.saitej.coding.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharsInString {
    public static void main(String[] args) {
        String str= "what we think we become";
       str=str.replaceAll("\\s","");
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] split = str.split("");
        int value=0;
        for (String s:split) {
            Integer count = map.get(s);
            if (count==null)
                value=1;
            else
                value=count+1;
            map.put(s,value);
        }
        System.out.println(map);

    }
}
