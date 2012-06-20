package de.carullojabro.sortalgorithms.algorithms;

import java.util.List;

/**
 * 
 * @author Lukas
 * 
 */

public class InsertionSort implements ISortAlgorithm {
	
	private List<Integer> list;
	
	public InsertionSort(List<Integer> list){
		this.list = list;
	}

	public List<Integer> sort() {
		for (int i = 1; i < list.size(); i++) {
			int x = list.get(i);
			int j = i;
			while (j > 0 && list.get(j - 1) > x) {
				list.set(j, list.get(j - 1));
				j = j - 1;
			}
			list.set(j, x);
		}
		return list;
	}
}
