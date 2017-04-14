package com.jorgesaldivar.algorithms;

import java.util.logging.Logger;

public class Palindrome {

	private static final Logger LOGGER = Logger.getLogger(Palindrome.class.getName());
	
	/**
	 * Simple test to check the isPalindrome method. Further test cases can be found at
	 * the {@link AppTest} class. 
	 */
	public static void run() {
		if (new Palindrome().isPalindrome("ca22r#ac%"))
			LOGGER.info("Is a palindrome");
	}

	/**
	 * The isPalindrome method may receive words with special characters. These
	 * need to be cleaned and check if the words are a palindrome or not.
	 * 
	 * @param word
	 *            of type {@link String}
	 * @return {@link Boolean}
	 */
	public boolean isPalindrome(String word) {

		if (word == null)
			return false;

		String filtered = word.replaceAll("[^a-zA-Z]", "");

		if (filtered.length() == 0)
			return false;

		for (int i = 0; i < filtered.length() / 2; i++) {
			if (filtered.charAt(i) != filtered.charAt(filtered.length() - 1 - i))
				return false;
		}
		return true;

	}

}
