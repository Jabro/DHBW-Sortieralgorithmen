package de.carullojabro.sortalgorithms.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


import de.carullojabro.sortalgorithms.algorithms.Bucketsort;
import de.carullojabro.sortalgorithms.algorithms.BubbleSort;
import de.carullojabro.sortalgorithms.algorithms.Heapsort;
import de.carullojabro.sortalgorithms.algorithms.ISortAlgorithm;
import de.carullojabro.sortalgorithms.algorithms.InsertionSort;
import de.carullojabro.sortalgorithms.algorithms.Quicksort;
import de.carullojabro.sortalgorithms.algorithms.Selectionsort;

public class AlgorithmTest {
	public static void main(String[] args) {

		List<Integer> list = createRandomList(10000000);
		System.out.println(list.toString());

		Quicksort bucket = new Quicksort(list);
		
		double start = System.currentTimeMillis();
		list = bucket.sort();
		double end = System.currentTimeMillis();

		System.out.println((end-start)/1000+" Sekunden benötigt.");
		System.out.println(list.toString());
	}

	/**
	 * Generiert eine zufällige Liste mit werten zwischen 0-9
	 * 
	 * @param n
	 *            Länge der Liste
	 */
	public static List<Integer> createRandomListM10(Integer n) {
		List<Integer> list = new ArrayList<Integer>(n);
		Random rdm = new Random();
		for (int i = 0; i < n; i++) {
			list.add(rdm.nextInt(10));
		}
		return list;
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
		for (int i = n - 1; i >= 0; i--) {
			list.add(i);
		}
		return list;
	}

	public static List<Integer> createRandomList(Integer n) {
		Random rdm = new Random();
		List<Integer> list = new ArrayList<Integer>(n);
		for (int i = n - 1; i >= 0; i--) {
			list.add(rdm.nextInt(n));
		}
		return list;
	}
}
