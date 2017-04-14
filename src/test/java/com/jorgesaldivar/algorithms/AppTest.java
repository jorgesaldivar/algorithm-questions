package com.jorgesaldivar.algorithms;

import org.junit.Assert;
import org.junit.Test;

/**
 * <h1>Unit test for Algorithms Application</h1>
 */
public class AppTest {

	/**
	 * Verify if the validity of the isPalindrome method
	 */
	@Test
	public void testPalindrome() {

		Palindrome palindrome = new Palindrome();
		Assert.assertFalse("Not a palindrome", palindrome.isPalindrome("car"));
		Assert.assertFalse("Not a palindrome", palindrome.isPalindrome("cara"));
		Assert.assertFalse("Not a palindrome", palindrome.isPalindrome("#1441@#"));
		Assert.assertFalse("Not a palindrome", palindrome.isPalindrome(null));
		Assert.assertFalse("Not a palindrome", palindrome.isPalindrome("m!213_0x"));
		Assert.assertTrue("Not a palindrome", palindrome.isPalindrome("carac"));
		Assert.assertTrue("Not a palindrome", palindrome.isPalindrome("cara@3!-c-"));
		Assert.assertTrue("Not a palindrome", palindrome.isPalindrome("m"));
		Assert.assertTrue("Not a palindrome", palindrome.isPalindrome("mm"));
		Assert.assertTrue("Not a palindrome", palindrome.isPalindrome("m!213_0m"));

	}
}
