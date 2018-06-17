package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.list.ListName;

class ListNameTest {
	private List<String> list;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("before all test.");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("after all test.");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("before each test cases.");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("after each test cases.");
	}

	@Test
	void testGetBoll() {
		assertTrue(new ListName().getBoll("hello"), "string is not provided.");
		System.out.println("inside booll.");
	}

	@Test
	void testGetPresent() {
		assertEquals("string is proper", new ListName().getPresent("hello"));
	}

	@Test
	void testList() {
		list = Arrays.asList("Saurabh", "arjun", "karan");
		assertTrue(new ListName().getNAME(list), "list is empty");
	}

	@Test
	void testInt() {
		assertEquals(4, ListName.getMax(new int[] { 1, 3, 2, 5, 4 }));
	}
}
