package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRemoveDuplicateChraracters {

	@Test
	public void testRemoveDuplicateCharacters() {

		assertEquals("misp", DuplicateCharacters.remove("missippi"));
	}

	@Test
	public void testRemoveDuplicateCharactersExample1() {

		assertEquals("abc", DuplicateCharacters.remove("abcacb"));
	}

	@Test
	public void testRemoveDuplicateCharactersWithNoDuplicates() {
		assertEquals("abc", DuplicateCharacters.remove("abc"));
	}
}
