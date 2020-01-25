package com.multithreading;

public class Fruiteater implements Runnable {
	@Override
	public void run() {
		while (true) {
			synchronized (Fruitbasket.fruit_basket) {
				if (!Fruitbasket.fruit_basket.isEmpty()) {
					System.out.println(Thread.currentThread().getName() + " " + Fruitbasket.fruit_basket.remove(0));
					Fruitbasket.fruit_basket.notifyAll();
				} else {
					try {
						Fruitbasket.fruit_basket.wait();
					} catch (InterruptedException e) {
						System.out.println(e);
					}
				}

			}

		}
	}
}
