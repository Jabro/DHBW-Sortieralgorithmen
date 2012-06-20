package de.carullojabro.sortalgorithms.algorithms;

import java.util.List;

public interface ISortAlgorithm {

	/**
	 * Sorts the given List
	 * 
	 * @param list
	 *            unsorted List
	 * @return sorted List
	 */
	public List<Integer> sort(List<Integer> list);
}
