package com.java.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Model> {
	@Override
	public int compare(Model o1, Model o2) {
		if (o1.contestantAge==o2.contestantAge) {
			return 0;
		}else if (o1.contestantAge>o2.contestantAge){
			return 1;
		}else {
			return -1;
		}
		
	}
}
