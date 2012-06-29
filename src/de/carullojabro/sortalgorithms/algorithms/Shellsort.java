package de.carullojabro.sortalgorithms.algorithms;

import java.util.List;

public class Shellsort implements ISortAlgorithm {

	private List<Integer> list;

	public Shellsort(List<Integer> list) {
		this.list = list;
	}

	@Override
	public List<Integer> sort() {
		int i, j, k, h, x;
		int[] spalten = { 271, 111, 41, 13, 4, 1 };
		for (k = 0; k < 6; k++) {
			h = spalten[k]; // Sortiere die "Spalten" mit Insertionsort
			for (i = h; i < list.size(); i++) {
				x = list.get(i);
				j = i;
				while (j >= h && list.get(j - h) > x) {
					list.set(j, list.get(j - h));
					j = j - h;
				}
				list.set(j, x);
			}
		}
		return list;
	}
}
