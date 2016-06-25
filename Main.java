package com.candy;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		Child jack = new Child("Jack");
		Child mary = new Child("Mary");
		Child susie = new Child("Susie");
		Child john = new Child("John");
		Child george = new Child("George");
		
		Child[] children = { jack, mary, susie, john, george };
		
		jack.setChildren(children);
		mary.setChildren(children);
		susie.setChildren(children);
		john.setChildren(children);
		george.setChildren(children);
		
		jack.start();
		Thread.sleep(5000);
		mary.start();
		Thread.sleep(5000);
		susie.start();
		Thread.sleep(5000);
		john.start();
		Thread.sleep(5000);
		george.start();

	}
}
