package com.saitej.coding.strings;

import java.util.HashMap;
import java.util.Map;

public class MaxRepCharUsingHashmap {
    public static void main(String[] args) {
        String str = "aabbcccdd";
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c:chars) {
            if (hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }

        int maxCount= 0;
        char maxChar ='\u0000';
        for (Map.Entry<Character, Integer> me: hm.entrySet()){
                if (maxCount<me.getValue()){
                   maxCount=me.getValue();
                   maxChar=me.getKey();
                }
        }
        System.out.println("Max repeating character: "+ maxChar);
    }
}
