package org.AbstractAnimals;



public class Main {
	public static void main (String[] args) {
		
		Cane caneJerry = new Cane("mammifero", 4);
		
		System.out.println(caneJerry.toString());
		
		
		Aquila aquilaIry = new Aquila("uccello", 2);
		
		System.out.println(aquilaIry.toString());
		
		
		Passerotto passerottoPia = new Passerotto("uccello", 2);
		
		System.out.println(passerottoPia.toString());
		
		
		Delfino delfinoLia = new Delfino("mammfero", 0);
		
		System.out.println(delfinoLia.toString());
		
		
	}
}
