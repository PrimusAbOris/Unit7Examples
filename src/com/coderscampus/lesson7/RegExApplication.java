package com.coderscampus.lesson7;

public class RegExApplication {
	
	// regextester.com
	// Google/GPT solutions to specific RegEx questions
	

	public static void main(String[] args) {
		// "valid" email address: fake.email@gmail.com
		// invalid email address: trevorcraftycodr.com
		// invalid email address: trevor@craftycodr.thisisntarealdomain
		// valid email address: trevor@craftycodr.com
		// valid email address: trevor-page.2@gmail.com
		// valid email address: Trevor@CraftyCodr.com
		
		// valid
		inputMatchesRegExPattern("fake.email@gmail.com");
		// invalid (missing an @ symbol)
		inputMatchesRegExPattern("trevorcraftycodr.com");
		// invalid (domain extension is too long)
		inputMatchesRegExPattern("trevor@craftycodr.thisisntarealdomain");
		// valid
		inputMatchesRegExPattern("trevor@craftycodr.com");
		// valid
		inputMatchesRegExPattern("trevor-page.2@gmail.com");
		// valid
		inputMatchesRegExPattern("Trevor@CraftyCodr.com");
		// valid
		inputMatchesRegExPattern("0123@0123.abc");
		// invalid (domain extension has numbers)
		inputMatchesRegExPattern("dondozo-fan-99@paldea.123");
	}

	public static void inputMatchesRegExPattern(String input) {
		// Refactor -> Extract Method
		boolean matchFound = input.matches("^[a-zA-Z0-9][a-zA-Z0-9-]{0,}\\.?[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z]{1,5}$");
        //                                  ^ "from the start"    ^ minus sign, not a range indicator                ^ "must end like this"
		//  "." != .   "\." == .   like \n     . is a RegEx wild card    \ == "escape character"
		if (!matchFound) System.out.println(input + " don't look like NO email address to me, baby!");
		else System.out.println(input + ", yeah? I'll drop you a line!");
	}

}

