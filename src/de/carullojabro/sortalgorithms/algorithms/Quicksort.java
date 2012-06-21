package de.carullojabro.sortalgorithms.algorithms;

import java.util.List;

/**
 * 
 * @author Jan
 *
 */

public class Quicksort implements ISortAlgorithm {
	
	private List<Integer> list;
	
	private int number;


	public Quicksort(List<Integer> list){
		this.list = list;
	}
	
	@Override
	public List<Integer> sort() {
		// Check for empty or null array
		if (list == null || list.size()==0){
			return null;
		}
		number = list.size();
		quicksort(0, number - 1);
		return list;
	}
	
	
	private void quicksort(int low, int high) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = list.get(low + (high-low)/2);

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (list.get(i) < pivot) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (list.get(j) > pivot) {
				j--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = list.get(i);
		list.set(i,list.get(j));
		list.set(j,temp);
	}
}



