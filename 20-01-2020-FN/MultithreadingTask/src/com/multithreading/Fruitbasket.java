package com.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruitbasket {

	public static List<String> list = new ArrayList<String>();
	public static List<String> fruit_basket = Collections.synchronizedList(list);

	public static void main(String[] args) {
		System.out.println("Market Sale Started");

		for (int i = 0; i < 10; i++) {
			new Thread(new Fruiteater(), "Consumer_" + i).start();
		}
		for (int i = 0; i < 10; i++) {
			new Thread(new Farmer(), "Farmer_" + i).start();
		}

	}
}
