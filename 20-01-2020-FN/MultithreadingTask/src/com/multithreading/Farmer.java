package com.multithreading;

import java.util.Random;

public class Farmer implements Runnable {
	public static String[] fruittypes = { "apple", "orange", "grape", "watermelon" };

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		while (true) {
			synchronized (Fruitbasket.fruit_basket) {

				Random r = new Random();
				int randomNumber = r.nextInt(fruittypes.length);
				if (Fruitbasket.fruit_basket.size() < 10) {
					Fruitbasket.fruit_basket.add(fruittypes[randomNumber]);
					System.out.println(Thread.currentThread().getName() + " Fruit Basket " + Fruitbasket.fruit_basket);
					Fruitbasket.fruit_basket.notifyAll();
				} else {
					try {
						Fruitbasket.fruit_basket.wait();
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
