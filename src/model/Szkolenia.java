package model;

import java.math.BigDecimal;

public class Szkolenia extends Produkt{
	
	private String technologia;
	
	
	public Szkolenia(BigDecimal cena, String nazwa, String technologia) {
		super (cena, nazwa); //wywo³anie konstruktora rodzica
		this.technologia = technologia;
	}


	public String getTechnologia() {
		return technologia;
	}


	public void setTechnologia(String technologia) {
		this.technologia = technologia;
	}
	
	public String toString(){
		return nazwa+ " " + cena + " " + " PLN " +  technologia;
	}
	public String dajRabat(){
		return "-15%";
		
	}
}
