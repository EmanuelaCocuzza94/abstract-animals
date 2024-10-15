package org.AbstractAnimals;

public class Cane extends Animale{
	private String verso;
	private String mangia;
	
	
	Cane(String type, int zampe){
	super(type, zampe);
	this.setVerso("bau bau");
	this.setMangia("croccantini");
	
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
        return "L'animale è un Cane{" + '\n' +
                "tipo='" + this.getType() + '\'' + '\n' +
                "zampe='" + this.getZampe() + '\'' + '\n' +
                "verso='" + this.getVerso() + '\'' + '\n' +
                "mangia=" + this.getMangia() + '\n' + '}';
    }
}
