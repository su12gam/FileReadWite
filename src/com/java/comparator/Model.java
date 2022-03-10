package com.java.comparator;

public class Model {
	int contestantID;
	String contestantName;
	String contestantAddress;
	int contestantAge;
	public Model(int contestantID,String contestantName,String contestantAddress,int contestantAge){
		this.contestantID=contestantID;
		this.contestantName=contestantName;
		this.contestantAddress=contestantAddress;
		this.contestantAge=contestantAge;
	}

	@Override
	public String toString() {
		return "[contestantID=" + contestantID + ", contestantName=" + contestantName + ", contestantAddress="
				+ contestantAddress + ", contestantAge=" + contestantAge + "]";
	}
	
}
