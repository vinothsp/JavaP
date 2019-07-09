package org.sp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CurrencySymbols {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String content = "Let's find the symbols or currencies : $ Dollar, € Euro, ¥ Yen";
	       
		String regex = "\\p{Sc}";
		
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher match = pattern.matcher(content);
		
		while(match.find())
		{
			System.out.println(match.start() +" is Starting Index for "+match.group());
		}

	}

}
