package com.java.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Model>{

	@Override
	public int compare(Model o1, Model o2) {
			return o1.contestantName.compareTo(o2.contestantName);
	}
}
