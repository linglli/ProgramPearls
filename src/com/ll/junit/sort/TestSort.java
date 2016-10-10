package com.ll.junit.sort;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ll.algorithm.sort.Sort;

import junit.framework.TestCase;

public class TestSort {
	private static List<Integer> elementList = new ArrayList();
	
	@BeforeClass
	public static void initialize() {
		elementList.add(55);
		elementList.add(41);
		elementList.add(59);
		elementList.add(26);
		elementList.add(53);
		elementList.add(58);
		elementList.add(97);
		elementList.add(93);
		elementList.sort(null);
	}
	
	@Test
	public void testInsertSort() {
		int[] elements = {55, 41, 59, 26, 53, 58, 97, 93};
		
		Sort sort = new Sort(elements);
		sort.insertSort();
		for(int i = 1; i < elements.length; i++) {
			assertTrue(elements[i] >= elements[i-1]);
		}
		for(int i = 0; i < elements.length; i++) {
			assertTrue(elements[i] == elementList.get(i));
		}
	}

	@Test
	public void testquickSort1() {
		int[] elements = {55, 41, 59, 26, 53, 58, 97, 93};
		
		Sort sort = new Sort(elements);
		sort.quickSort1(0, elements.length - 1);
		System.out.println(elements[0]);
		for(int i = 1; i < elements.length; i++) {
			System.out.println(elements[i]);
			assertTrue(elements[i] >= elements[i-1]);
		}
		for(int i = 0; i < elements.length; i++) {
			assertTrue(elements[i] == elementList.get(i));
		}
	}
	
	@Test
	public void testquickSort3() {
		int[] elements = {55, 41, 59, 26, 53, 58, 97, 93};
		Sort sort = new Sort(elements);
		sort.quickSort3(0, elements.length - 1);
		System.out.println(elements[0]);
		for(int i = 1; i < elements.length; i++) {
			System.out.println(elements[i]);
			assertTrue(elements[i] >= elements[i-1]);
		}
		for(int i = 0; i < elements.length; i++) {
			assertTrue(elements[i] == elementList.get(i));
		}
	}
	
	@Test
	public void testquickSort4() {
		int[] elements = {55, 41, 59, 26, 53, 58, 97, 93};
		Sort sort = new Sort(elements);
		sort.quickSort4(0, elements.length - 1);
		System.out.println(elements[0]);
		for(int i = 1; i < elements.length; i++) {
			System.out.println(elements[i]);
			assertTrue(elements[i] >= elements[i-1]);
		}
		for(int i = 0; i < elements.length; i++) {
			assertTrue(elements[i] == elementList.get(i));
		}
	}
}
