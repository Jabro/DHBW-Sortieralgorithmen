package de.carullojabro.sortalgorithms.test;

import java.util.ArrayList;
import java.util.List;

import de.carullojabro.sortalgorithms.algorithms.BubbleSort;

public class AlgorithmTest {
	public static void main(String[] args) {

		List<Integer> list = createInverseList(1000);
		System.out.println(list.toString());
		
		BubbleSort bubble = new BubbleSort(list);
		list = bubble.sort();
		
		System.out.println(list.toString());
	}

	public static List<Integer> createSortedList(Integer n) {
		List<Integer> list = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		return list;
	}

	public static List<Integer> createInverseList(Integer n) {
		List<Integer> list = new ArrayList<Integer>(n);
		for (int i = n-1; i >= 0; i--) {
			list.add(i);
		}
		return list;
	}

	public static List<Integer> randomSortedList(Integer n) {
		return null;
	}
}
