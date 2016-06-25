package com.candy;

public class Sweets {
	
	private volatile String isPossessedBy;
	
	public void possessed(String name, String sweetType){
		isPossessedBy = name;
		System.out.println(isPossessedBy + " now has " + sweetType);
	}
	
}
