package com.codingdojo.zookeeperpart1;

//Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
public class Gorilla extends Mammal {
	
	int gorillaEnergy = getEnergyLevel();

	
	//	For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease 	the energy level by 5
	public int throwSomething(int thingsParam) {
		int things= thingsParam;
		if (things <= 1) {
			System.out.println("The gorilla has thrown something!");
		} else {
			System.out.println("The gorilla has thrown number of things!");			
		}
		gorillaEnergy = (gorillaEnergy - (5*things));
		return gorillaEnergy;
	}
	
	
	//For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10

	public int eatBananas(int numberOfBananasParam) {
		int numberOfBananas = numberOfBananasParam;
		System.out.printf("The gorilla just ate %n banana!",numberOfBananas);
		gorillaEnergy = (gorillaEnergy + (10*numberOfBananas));
		if (gorillaEnergy > 100) {
			gorillaEnergy = 100;
		}
		return gorillaEnergy;
		
	}
	
	//For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
	public int climb() {
		System.out.println("The gorilla climbed a tree!");
		gorillaEnergy = (gorillaEnergy - 10);
		return gorillaEnergy;
	}
	
}
