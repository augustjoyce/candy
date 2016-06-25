package com.candy;

public class SweetsFactory {

	public Sweets createSweets(int i) {
		
		Sweets sw = null;

		switch (i) {
		case 0:
			sw = new Chocolate();
			break;
		case 1:
			sw = new Candy();
			break;
		case 2:
			sw = new IceCream();
			break;
		default:

		}
		return sw;
	}

}
