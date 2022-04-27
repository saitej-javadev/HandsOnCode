package com.saitej.coding.java8.predicate;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class StartWith {

    public static void main(String[] args) {
  //      String[] names = {"Pooja", "Samantha", "Ariana", "Rashmika", "Ananya", "Ileyana", "Anushaka"};
        String[] str = {"Pooja", "", "Ariana", "Rashmika", null, "Ileyana", "Anushaka"};
  //      Predicate<String> startWithA = s -> s.startsWith("A");
        Predicate<String> isNotNullOrEmpty = s -> s!=null&&s.length()!=0;
        /*for (String s:names) {
            if (startWithA.test(s)) {
                System.out.println(s);
            }
        }*/

     /*   for (String s:str) {
            if (isNotNullOrEmpty.test(s)){
                System.out.println(s);
            }

        }
*/
        List<String> collect = Arrays.stream(str).filter(s -> s != null && s.length() != 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
