package de.carullojabro.sortalgorithms.algorithms;

import java.util.List;

/**
 * 
 * @author Jan
 *
 */

public class Heapsort implements ISortAlgorithm {

	private List<Integer> list;
	
	public Heapsort (List<Integer> list){
		this.list = list;
	}
	
	@Override
	public List<Integer> sort() {
		convertToHeap();
		int r = list.size()-1;
		while (r >1) {
			int x = list.get(0);
			list.set(0, list.get(r));
			list.set(r, x);
			r += -1;
			sift(1, r);
		}
		return list;
	}
	
	private void convertToHeap(){
		int l = ((list.size()-1)/2)+1;
		while (l>1) {
			l += -1;
			sift(l, list.size()-1);
		}
	}
	
	private void sift(int l, int r){
		int i, j, x;
		
		i = l;
		j = 2*i;
		x = list.get(l);
		
		while (j <= r) {
			//Suche Minimum unter Kindern
			if ((j < r) && (list.get(j+1)<list.get(j))){
				j += 1;
			}
			//ggf. mit Eltern tauschen
			if (list.get(j)< x) {
				list.set(i, list.get(j));
				list.set(j, x);
				i = j;
				j = 2*i;
			} else {
				j = r+1;
			}
		}
	}

}
