package com.codingdojo.zookeeperpart1;

public class MammalTest {

	public static void main(String[] args) {
//		Mammal m1 = new Mammal();
//		m1.displayEnergy();
//		System.out.println(m1.getEnergyLevel());
//		
		Gorilla g1 = new Gorilla();
		g1.displayEnergy();
		g1.throwSomething(10);
		System.out.println("Current energy level is: " + g1.gorillaEnergy);
		g1.eatBananas(4);
		System.out.println("Current energy level is: " + g1.gorillaEnergy);
		g1.climb();
		System.out.println("Current energy level is: " + g1.gorillaEnergy);
	}
	
}
