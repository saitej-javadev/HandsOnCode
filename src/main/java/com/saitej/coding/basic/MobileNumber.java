package com.saitej.regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
 public static void main(String[] args) {
	Pattern compile = Pattern.compile("\\+(0|91)?[7-9][0-9]{9}");
	Matcher matcher = compile.matcher("+9568456256");
	if(matcher.find()) {
		System.out.println("found at " + matcher.group());
	}else {
		System.out.println("not found");
	}
	

}
}
