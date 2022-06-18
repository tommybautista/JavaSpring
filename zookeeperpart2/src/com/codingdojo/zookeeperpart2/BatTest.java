package com.codingdojo.zookeeperpart2;

public class BatTest {

	public static void main(String[] args) {
		Bat b1 = new Bat();
		b1.displayEnergy();
		b1.fly(2);
		System.out.println("Current energy level is: " + b1.batEnergy);
		b1.eatHumans(2);
		System.out.println("Current energy level is: " + b1.batEnergy);
		b1.attackTown(3);
		System.out.println("Current energy level is: " + b1.batEnergy);
	}

}
