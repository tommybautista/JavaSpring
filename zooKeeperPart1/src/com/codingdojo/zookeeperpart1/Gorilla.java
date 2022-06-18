package com.codingdojo.zookeeperpart1;

//Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
public class Gorilla extends Mammal {

	
	//	For the throwSomething() method, have it print out a message indicating that the gorilla has thrown something, as well as decrease 	the energy level by 5
	public void throwSomething() {
		System.out.println("The gorilla has thrown something!");
		System.out.println(getEnergyLevel() - 5);
	}
	
	
	//For the eatBananas() method, have it print out a message indicating the gorilla's satisfaction and increase its energy by 10

	public void eatBananas() {
		System.out.println("The gorilla just ate a banana!");
		
	}
	
	//For the climb() method, have it print out a message indicating the gorilla has climbed a tree and decrease its energy by 10
	public void climb() {
		System.out.println("The gorilla climbed a tree!");
	}
	
}
