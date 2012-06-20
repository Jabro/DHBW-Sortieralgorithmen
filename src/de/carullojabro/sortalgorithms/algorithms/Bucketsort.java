package de.carullojabro.sortalgorithms.algorithms;

import java.util.List;

/**
 * 
 * @author Lukas
 * 
 */

public class Bucketsort implements ISortAlgorithm {

	private List<Integer> list;
	
	public Bucketsort(List<Integer> list){
		this.list = list;
	}
	
	@Override
	public List<Integer> sort() {



		return list;
	}
}