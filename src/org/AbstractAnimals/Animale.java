package org.AbstractAnimals;

public abstract class Animale {
	private String type;
	private int zampe;
	
	public Animale(String type, int zampe){
		this.setType(type);
		this.setZampe(zampe);
	}
	
	public String getType() {
		 return this.type;
	};
	
	public void setType(String inputType) {
		this.type = inputType;
	}
	
	public int getZampe() {
		 return this.zampe;
	};
	
	public void setZampe(int inputZampe) {
		 this.zampe = inputZampe;
	};
	
	public void dormi() {
		System.out.println("Zzz");
	}
	
	public void verso() {}
	
	public void mangia() {}
}
