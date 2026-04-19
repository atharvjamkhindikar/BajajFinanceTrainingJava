package com.training.org.statics;

class Player {

	static String leaue = "IPL"; // Static Variable
	String name;

	public Player(String name) {
		super();
		this.name = name;
	}

}

public class StaticVariableExample {
	
	static{
		System.out.println("Static Block Executed First ");
	}

	public static void main(String[] args) {
		Player p1 = new Player("Virat");
		Player p2 = new Player("Rohit");

		System.out.println(Player.leaue);
		System.out.println(Player.leaue);
	}

}
