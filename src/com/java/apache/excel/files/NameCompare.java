package com.java.apache.excel.files;

import java.util.Comparator;

public class NameCompare implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		return o1.getName().compareTo(o2.getName());	
	}

}
