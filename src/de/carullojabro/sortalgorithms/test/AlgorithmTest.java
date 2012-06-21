package de.carullojabro.sortalgorithms.test;

import java.util.ArrayList;
import java.util.List;

import de.carullojabro.sortalgorithms.algorithms.BubbleSort;
import de.carullojabro.sortalgorithms.algorithms.Heapsort;
import de.carullojabro.sortalgorithms.algorithms.ISortAlgorithm;
import de.carullojabro.sortalgorithms.algorithms.InsertionSort;
import de.carullojabro.sortalgorithms.algorithms.Quicksort;
import de.carullojabro.sortalgorithms.algorithms.Selectionsort;

public class AlgorithmTest {
	public static void main(String[] args) {

		List<Integer> list = createInverseList(100000);
		//System.out.println(list.toString());
		
		long start = System.currentTimeMillis();
		
		Quicksort bubble = new Quicksort(list);
		list = bubble.sort();
		
		long end = System.currentTimeMillis();
		System.out.println((end-start)+" Millisekunden");
		//System.out.println(list.toString());
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
