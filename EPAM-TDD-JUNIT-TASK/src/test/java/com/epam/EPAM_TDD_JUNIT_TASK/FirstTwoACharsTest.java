package com.epam.EPAM_TDD_JUNIT_TASK;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstTwoACharsTest {
	
	/*
	 * 1. ABCD -> BCD
	 * 2. AACD -> CD
	 * 3. BBAA -> BBAA
	 * 4. AABAA -> BAA
	 * 5. AAAAA -> AAA
	 */
	
	RemoveFirst2AChars removeFirst2AChars;
	 
	@BeforeEach
	void setUp() {
		removeFirst2AChars=new RemoveFirst2AChars(); 
	}
	
	@Test
	void testABCD() {
		assertEquals("BCD",removeFirst2AChars.remove("ABCD"));
	}
	
	@Test
	void testAACD() {
		assertEquals("CD",removeFirst2AChars.remove("AACD"));
	}
	
	@Test
	void testBBAA() {
		assertEquals("BBAA",removeFirst2AChars.remove("BBAA"));
	}
	
	@Test
	void testAABAA() {
		assertEquals("BAA",removeFirst2AChars.remove("AABAA"));
	}
	
	@Test
	void testAAAAA() {
		assertEquals("AAA",removeFirst2AChars.remove("AAAAA"));
	}
}
