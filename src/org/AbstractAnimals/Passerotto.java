package org.AbstractAnimals;

public class Passerotto extends Animale {
	private String verso;
	private String mangia;
	
	
	Passerotto(String type, int zampe){
	super(type, zampe);
	this.setVerso("pio pio");
	this.setMangia("fiocchi d'avena");
	
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
    public String toString() {
        return "L'animale è un Passerotto" + '\n' +
                "tipo='" + this.getType() + '\'' + '\n' +
                "zampe='" + this.getZampe() + '\'' + '\n' +
                "verso='" + this.getVerso() + '\'' + '\n' +
                "mangia=" + this.getMangia() + '\n' + '}';
    }
}
