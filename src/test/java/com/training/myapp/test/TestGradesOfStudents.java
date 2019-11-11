package com.training.myapp.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.myapp.StudentGrade;

public class TestGradesOfStudents {

	@Test
	public void testWithAllSubjectsGreaterThan60() {
		assertEquals("Passed", StudentGrade.calculateGrade(70, 70, 70));
	}

	@Test
	public void testWithATwoSubjectsGreaterThan60() {
		assertEquals("Promoted", StudentGrade.calculateGrade(70, 50, 70));
	}

	@Test
	public void testWithAllSubjectsLessThan60() {
		assertEquals("Failed", StudentGrade.calculateGrade(50, 50, 50));
	}

}
