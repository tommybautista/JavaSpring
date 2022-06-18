package com.codingdojo.zookeeperpart1;

public class Mammal {
	//Create a Mammal class that has an energyLevel member variable and displayEnergy() method. The displayEnergy() method should show the animal's energy level as well as return it.
	private int energyLevel;
	
	public Mammal() {
		energyLevel = 100;
	}
	
	public void displayEnergy() {
		System.out.println("Current energy level is: " + energyLevel);
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}
	
}
