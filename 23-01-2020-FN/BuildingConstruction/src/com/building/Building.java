package com.building;


public class Building {
	private int Dininghall;
	private int doors;
	private int windows;
	private boolean gardening;
	private boolean hasCarparking;
	private boolean hasPethome;

	public Building(int Dininghall, int doors, int windows, boolean gardening, boolean hasCarparking, boolean hasPethome) {
		super();
		this.Dininghall = Dininghall;
		this.doors = doors;
		this.windows = windows;
		this.gardening = gardening;
		this.hasCarparking = hasCarparking;
		this.hasPethome = hasPethome;
	}

	@Override
	public String toString() {
		return "\n........... Building Plan.......... \n \n Dininghall="+ Dininghall + "\n doors=" + doors + "\n windows=" + windows + "\n gardening=" + gardening
				+ "\n hasCarparking=" + hasCarparking + "\n hasPethome=" + hasPethome + "\n";
	}

}
