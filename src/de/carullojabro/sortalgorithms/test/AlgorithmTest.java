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

	/**
	 * Die jeweiligen vollautomatischen Bearbeitungsmethoden der
	 * Unterschiedlichen Sortieralgorythmen haben zwei Parameter: Als 1. muss
	 * ein Index mitgegeben werden, damit die Methode weiß welche Art von Liste
	 * verwendet werden soll. <br>
	 * 0 für eine sortierte Liste <br>
	 * 1 für eine inverse Liste <br>
	 * 2 für eine zufällige Liste <br>
	 * <br>
	 * Als 2. Parameter muss die Anzahl n der Listenelemente übergeben werden <br>
	 * z.B. 100000
	 */
	public static void main(String[] args) {

		sortInsertionSort(0, 100000);
		// List<Integer> list = createRandomList(100000);
		//
		// System.out.println(list.toString());
		//
		// InsertionSort bucket = new InsertionSort(list);
		//
		// double start = System.currentTimeMillis();
		// list = bucket.sort();
		// double end = System.currentTimeMillis();
		//
		// System.out.println((end - start) / 1000 + " Sekunden benötigt.");
		// System.out.println(list.toString());
	}

	private static void sortInsertionSort(int index, int n) {
		List<Integer> list = createCustomList(index, n);
		InsertionSort oSort = new InsertionSort(list);
		double start = System.currentTimeMillis();
		list = oSort.sort();
		double end = System.currentTimeMillis();
		System.out.println((end - start) / 1000 + " Sekunden benötigt.");
	}

	private static List<Integer> createCustomList(int index, int n) {
		List<Integer> list = null;
		switch (index) {
		case 0: {
			list = createSortedList(n);
			break;
		}
		case 1: {
			list = createInverseList(n);
			break;
		}
		case 2: {
			list = createRandomList(n);
			break;
		}

		default: {
			System.out.println("Kein Index übergeben");
			break;
		}
		}
		return list;
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
