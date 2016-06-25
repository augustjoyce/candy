package com.candy;

import java.util.Random;

public class Child extends Thread {
	
	private Child[] children = new Child[5];
	
	public Child[] getChildren() {
		return children;
	}

	public void setChildren(Child[] children) {
		this.children = children;
	}

	Random rand = new Random();
	Sweets sweets;
	SweetsFactory sf = new SweetsFactory();
	
	private String name;

	public Child(String name) {
		this.name = name;
	}

	public String getChildName() {
		return name;
	}

	public void askForSweets() {
		this.sweets = sf.createSweets(rand.nextInt(3));
		sweets.possessed(getChildName(), sweets.getClass().getSimpleName());

	}

	public void exchangeSweets(Child child) {
		child.sweets = sweets;
		System.out.println(name + " gas given his " + sweets.getClass().getSimpleName() 
				+ " to " + child.getChildName());
		sweets.possessed(child.getChildName(), sweets.getClass().getSimpleName());
	}

	@Override
	public void run() {
		askForSweets();
		
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			System.out.println("Oops");
//		}
		
		exchangeSweets(children[rand.nextInt(5)]);
	}

}
