package de.carullojabro.sortalgorithms.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import de.carullojabro.sortalgorithms.algorithms.Bucketsort;
import de.carullojabro.sortalgorithms.algorithms.Heapsort;
import de.carullojabro.sortalgorithms.algorithms.InsertionSort;
import de.carullojabro.sortalgorithms.algorithms.Quicksort;
import de.carullojabro.sortalgorithms.algorithms.Selectionsort;
import de.carullojabro.sortalgorithms.algorithms.Shellsort;

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

		sortInsertionSort(0, 1000);
		sortInsertionSort(0, 1000);
		sortInsertionSort(0, 1000);
		sortInsertionSort(0, 10000);
		sortInsertionSort(0, 10000);
		sortInsertionSort(0, 10000);
		sortInsertionSort(0, 100000);
		sortInsertionSort(0, 100000);
		sortInsertionSort(0, 100000);
		
		sortInsertionSort(1, 1000);
		sortInsertionSort(1, 1000);
		sortInsertionSort(1, 1000);
		sortInsertionSort(1, 10000);
		sortInsertionSort(1, 10000);
		sortInsertionSort(1, 10000);
		sortInsertionSort(1, 100000);
		sortInsertionSort(1, 100000);
		sortInsertionSort(1, 100000);
		// sortSelectionSort(0, 100000);
		// sortBubbleSort(0, 100000);
		// TODO shellsort noch implementieren
		// sortHeapSort(0, 100000);
		// sortQuickSort(0, 100000);
		// ausgleichendes Mischen noch implementieren
		// TODO List<Integer> list = createRandomList(100000);
		//sortShellSort(2, 10000);
	}

	private static void sortBucketSort(int index, int n) {
		List<Integer> list = createListBucketM10(index, n);
		Bucketsort oSort = new Bucketsort(list);
		double start = System.currentTimeMillis();
		list = oSort.sort();
		double end = System.currentTimeMillis();
		System.out.println("BucketSort mit"+n+"Elementen Listenoption "+index+" "+(end - start) / 1000 + " Sekunden benötigt.");
	}

	private static void sortQuickSort(int index, int n) {
		List<Integer> list = createCustomList(index, n);
		Quicksort oSort = new Quicksort(list);
		double start = System.currentTimeMillis();
		list = oSort.sort();
		double end = System.currentTimeMillis();
		System.out.println("QuickSort mit"+n+"Elementen Listenoption "+index+" "+(end - start) / 1000 + " Sekunden benötigt.");
	}

	private static void sortHeapSort(int index, int n) {
		List<Integer> list = createCustomList(index, n);
		Heapsort oSort = new Heapsort(list);
		double start = System.currentTimeMillis();
		list = oSort.sort();
		double end = System.currentTimeMillis();
		System.out.println("HeapSort mit"+n+"Elementen Listenoption "+index+" "+(end - start) / 1000 + " Sekunden benötigt.");
	}

	private static void sortBubbleSort(int index, int n) {
		List<Integer> list = createCustomList(index, n);
		Bucketsort oSort = new Bucketsort(list);
		double start = System.currentTimeMillis();
		list = oSort.sort();
		double end = System.currentTimeMillis();
		System.out.println("BubbleSort mit"+n+"Elementen Listenoption "+index+" "+(end - start) / 1000 + " Sekunden benötigt.");
	}

	private static void sortSelectionSort(int index, int n) {
		List<Integer> list = createCustomList(index, n);
		Selectionsort oSort = new Selectionsort(list);
		double start = System.currentTimeMillis();
		list = oSort.sort();
		double end = System.currentTimeMillis();
		System.out.println("SelectionSort mit"+n+"Elementen Listenoption "+index+" "+(end - start) / 1000 + " Sekunden benötigt.");
	}

	private static void sortInsertionSort(int index, int n) {
		List<Integer> list = createCustomList(index, n);
		InsertionSort oSort = new InsertionSort(list);
		double start = System.currentTimeMillis();
		list = oSort.sort();
		double end = System.currentTimeMillis();
		System.out.println("InsertionSort mit"+n+"Elementen Listenoption "+index+" "+(end - start) / 1000 + " Sekunden benötigt.");
	}

	private static void sortShellSort(int index, int n) {
		List<Integer> list = createCustomList(index, n);
		Shellsort oSort = new Shellsort(list);
		double start = System.currentTimeMillis();
		System.out.println(list);
		list = oSort.sort();
		double end = System.currentTimeMillis();
		System.out.println(list);
		System.out.println("ShellSort mit"+n+"Elementen Listenoption "+index+" "+(end - start) / 1000 + " Sekunden benötigt.");
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
	 * @param n2
	 */
	public static List<Integer> createListBucketM10(int index, int n) {

		List<Integer> list = new ArrayList<Integer>(n);
		switch (index) {
		case 0: {
			int fill = 0;
			for (int i = 0; i < n; i++) {
				list.add(fill);
				if (fill < 9) {
					fill++;
				} else {
					fill = 0;
				}
			}
			break;
		}
		case 1: {
			int fill = 9;
			for (int i = 0; i < n; i++) {
				list.add(fill);
				if (fill > 0) {
					fill--;
				} else {
					fill = 9;
				}
			}
			break;
		}
		case 2: {
			Random rdm = new Random();
			for (int i = 0; i < n; i++) {
				list.add(rdm.nextInt(10));
			}
			break;
		}

		default: {
			System.out.println("Kein Index übergeben");
			break;
		}
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
