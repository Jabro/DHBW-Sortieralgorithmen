package de.carullojabro.sortalgorithms.algorithms;

import java.util.List;

public class Selectionsort implements ISortAlgorithm {

	@Override
	public List<Integer> sort(List<Integer> list) {
		for (int i = 0; i < list.size() - 2; i++) {
			int k = i;
			for (int j = i + 1; j < list.size() - 1; j++) {
				if (list.get(j) < list.get(k)) {
					k = j;
				}
				int x = list.get(k);
				list.set(k, list.get(i));
				list.set(i, x);
			}
		}
		return list;
	}

}
