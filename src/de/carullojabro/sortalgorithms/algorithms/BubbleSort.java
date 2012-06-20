package de.carullojabro.sortalgorithms.algorithms;

import java.util.List;

/**
 * 
 * @author Jan
 *
 */

public class BubbleSort implements ISortAlgorithm{
	
	private List<Integer> list;
	
	public BubbleSort (List<Integer> list){
		this.list = list;
	}

	@Override
	public List<Integer> sort() {
		
		for (int i = 0; i < list.size()-1; i++) {
			for (int j = list.size()-1; j >= 0; j--) {
				if (list.get(j - 1) > list.get(j)) {
					int x = list.get(j);
					list.set(j, j - 1);
					list.set(j - 1, x);
					;
				}
			}
		}
		
		return list;
	}

}
