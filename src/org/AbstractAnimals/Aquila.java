package org.AbstractAnimals;

public class Aquila extends Animale implements AnimaleCheSaVolare{
	
	private String verso;
	private String mangia;
	private String faiVolare;
	
	
	Aquila(String type, int zampe){
	super(type, zampe);
	this.setVerso("pio pio");
	this.setMangia("mammiferi e uccelli");
	this.setFaiVolare("Sto volando!");
	
	}
	
	public String getVerso() {
		 return this.verso;
	};
	
	public void setVerso(String inputVerso) {
		 this.verso = inputVerso;
	};
	
	public String getMangia() {
		 return this.mangia;
	};
	
	public void setMangia(String inputMangia) {
		 this.mangia = inputMangia;
	};
	
	
	@Override
	public String faiVolare() {
		return "Sta volando!";
	}
	
	public void setFaiVolare(String inputFaiVolare) {
		 this.faiVolare = inputFaiVolare;
	};
	
	public String getFaiVolare() {
		 return this.faiVolare;
	};
	
	@Override
    public String toString() {
        return "L'animale è un Aquila{" + '\n' +
                "tipo='" + this.getType() + '\'' + '\n' +
                "zampe='" + this.getZampe() + '\'' + '\n' +
                "verso='" + this.getVerso() + '\'' + '\n' +
                "vola?='" + this.getFaiVolare() + '\'' + '\n' +
                "mangia=" + this.getMangia() + '\n' + '}';
    }
}
