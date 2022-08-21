package com.saitej.coding.strings;

public class ChecksSubstringInString {
    public static void main(String[] args) {
        String s = "mondey";
        String seq = "dey";
        boolean res=isSubString(s,seq);
        System.out.println(res==true?"True":"False");
    }

    private static boolean isSubString(String s, String seq) {
        return s.contains(seq);
    }
}
