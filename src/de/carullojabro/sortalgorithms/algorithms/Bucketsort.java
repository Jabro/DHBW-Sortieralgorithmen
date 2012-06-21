package de.carullojabro.sortalgorithms.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Lukas
 * 
 */

public class Bucketsort implements ISortAlgorithm {

	private List<Integer> list;
	@SuppressWarnings("unchecked")
	private List<Integer>[] aFächer = new List[10];

	public Bucketsort(List<Integer> list) {
		this.list = list;
	}

	/**
	 * @param Es
	 *            wird eine Liste mit Zahlen zwischen einschließlich 0-9
	 *            erwartet.
	 */
	public List<Integer> sort() {
		// Fächer erzeugen
		initBuckets();

		// Fächer füllen
		fillBuckets();

		// Liste nacheinander mit den Fächerinhalten sortiert füllen
		fillList();

		return list;
	}

	private void initBuckets() {
		for (int i = 0; i < aFächer.length; i++) {
			aFächer[i] = new ArrayList<Integer>();
		}
	}

	private void fillBuckets() {
		for (int wert : list) {
			aFächer[wert].add(wert);
		}
	}

	private void fillList() {
		list.clear();
		for (int i = 0; i < aFächer.length; i++) {
			list.addAll(aFächer[i]);
		}
	}

}