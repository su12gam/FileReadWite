package com.java.demo;

public class Trio implements MenuItem{
	
	private Sandwich sand;
	private Salad sal;
	private Drink dri;
	
	public Trio(Sandwich s,Salad a,Drink d) {
		sand=s;
		sal=a;
		dri=d;
	}

	public String getName() {
		return sand.getName()+"/"+sal.getName()+"/"+dri.getName()+" Trio Meal";
	}

	public double getPrice() {
		double p1=sand.getPrice();
		double p2=sal.getPrice();
		double p3=dri.getPrice();
		
		if(p2>=p1 && p3>=p1) {
			return p2+p3;
		}else if(p1>=p2 && p3>=p2){
			return p1+p3;
		}
		return p1+p2;
	}

}
