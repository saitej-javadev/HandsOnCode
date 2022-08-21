package com.saitej.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailId{
	public static void main(String[] args) {
		String target = "saitej_galipelli123.tez@gmail.com";
		Pattern pattern = Pattern.compile("(^[a-zA-Z])([a-zA-Z0-9\\_\\.]+)@([a-zA-Z])+\\.([a-zA-Z])+([^0-9]$)");
		Matcher matcher = pattern.matcher(target);
		if(matcher.find()) {
			System.out.println(matcher.group());
		}else {
			System.out.println("not found");
		}
	
	}
}
