package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.WordOccurance;

public class TestWordOccurance {

	@Test
	public void testWordOccurance() {

		String[] names = { "Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev",
				"Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones" };
		assertEquals(2, WordOccurance.noOfOccurances(names, "Sam"));

	}

	@Test
	public void testWordOccuranceWhenWordIsNotFound() {
		String[] names = { "Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev",
				"Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones" };
		assertEquals(-1, WordOccurance.noOfOccurances(names, "mounika"));
	}
}
