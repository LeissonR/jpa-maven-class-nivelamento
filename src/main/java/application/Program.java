package application;

import entities.People;

public class Program {

	public static void main(String[] args) {
	
		People p1 = new People(1, "Nac Red", "nacRR@nac.com");
		People p2 = new People(2, "Nac Brown", "nacBB@nac.com");
		People p3 = new People(3, "Nac Green", "nacGG@nac.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
