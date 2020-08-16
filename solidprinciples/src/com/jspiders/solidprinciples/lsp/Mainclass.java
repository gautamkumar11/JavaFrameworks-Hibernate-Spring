package com.jspiders.solidprinciples.lsp;

import java.util.ArrayList;

public class Mainclass {

	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		Pegion pegion = new Pegion();
		
		ArrayList<Bird> birds = new ArrayList<Bird>();
		birds.add(parrot);
		birds.add(pegion);
		
		for(int i=0; i< birds.size(); i++)
		{
			Bird bird = birds.get(i);
			bird.fly();
		}

	}

}
