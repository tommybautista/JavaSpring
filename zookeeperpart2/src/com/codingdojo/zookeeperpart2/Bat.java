package com.codingdojo.zookeeperpart2;

//Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.
public class Bat extends Mammal {
	
	int batEnergy = getEnergyLevel();
	
	//	For the fly() method, print the sound of a bat taking off and decrease its energy by 50
	public int fly(int flyParam) {
		int fly = flyParam;
		System.out.println("swoosh swoosh swoosh");
		batEnergy -= (50*fly);
		if(batEnergy < 0) {
			batEnergy = 0;
		}
		return batEnergy;
	}
	
	//	For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
	public int eatHumans(int eatParam) {
		int eat = eatParam;
		System.out.println("nom nom nom");
		batEnergy += (25*eat);
		if(batEnergy > 300) {
			batEnergy = 300;
		}
		return batEnergy;
	}
	
	//	For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
	public int attackTown(int attackParam) {
		int attack = attackParam;
		System.out.println("crackle crackle crackle");
		batEnergy -= (100*attack);
		if(batEnergy < 0) {
			batEnergy = 0;
		}
		return batEnergy;
	}

}
