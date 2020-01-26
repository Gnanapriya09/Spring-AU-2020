package com.building;

public class BuildingBuilder {
	private int Dininghall;
	private int doors;
	private int windows;
	private boolean gardening;
	private boolean hasCarparking;
	private boolean hasPethome;

	public BuildingBuilder setDininghall(int Dininghall) {
		this.Dininghall = Dininghall;
		return this;

	}

	public BuildingBuilder setDoors(int doors) {
		this.doors = doors;
		return this;

	}

	public BuildingBuilder setwindows(int windows) {
		this.windows = windows;
		return this;

	}

	public BuildingBuilder setgardening(boolean gardening) {
		this.gardening = gardening;
		return this;

	}

	public BuildingBuilder sethasCarparking(boolean hasCarparking) {
		this.hasCarparking = hasCarparking;
		return this;
	}

	public BuildingBuilder sethasPethome(boolean hasPethome) {
		this.hasPethome = hasPethome;
		return this;
	}

	public Building Builder() {
		return new Building(this.Dininghall, this.doors, this.windows, this.gardening, this.hasCarparking, this.hasPethome);
	}

}
