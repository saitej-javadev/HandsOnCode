package com.saitej.coding.strings;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicatesInString {
    public static void main(String[] args) {
        String str= "JavaProgramming";
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        char[] chars = str.toCharArray();
        for(char c: chars){
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
        }
       /* for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }

        }*/

        map.entrySet().forEach(e->{
            if (e.getValue()>1){
                System.out.println(e.getKey()+" : "+e.getValue());
            }
        });
    }
}
