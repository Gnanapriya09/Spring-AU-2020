package com.building;

public class MainBuildingplan {
	public static void main(String[] args) {
		BuildingBuilder builder = new BuildingBuilder();
		builder.setDoors(1);
		builder.setwindows(4);
		builder.setgardening(true);
		builder.setDininghall(2);
		Building building = builder.Builder();
		System.out.println(building);
	}
}
