package model;

import java.math.BigDecimal;



public class Komputer extends Produkt implements Urz¹dzenieElektroniczne{ //extends ze dziedziczymy po produkcie(koputer jest produktem i co 
	//co produkt ma komputer dziedzicz
	
	//private BigDecimal cena; //do przechowywania danych finansowych
	//private String nazwa;
	private String cpu;
	private String ram;
	
	public Komputer(BigDecimal cena, String nazwa, String cpu, String ram) { //konstruktor parametryczny
		//source - generate constructor using fields
		
		super(cena, nazwa); //wywo³anie kompstruktora klasy po ktorej dziedziczymy
		//z rodzica mamy teraz cene i nazwe. Tworzymy obiekt rodzica. super - zawsze oznacza klase po ktorej dziedziczmy
		
		this.cpu = cpu;
		this.ram = ram;
	}
	
	public String dajRabat(){
		return "-10%";
		
	}

	

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public String toString(){
		return cena+ " " + nazwa + " " + " PLN " +  cpu+ " "+ram;
	}

	public void zaktualizuj(BigDecimal cena, String nazwa, String ram, String cpu) {
		this.cena = cena;
		this.nazwa = nazwa;
		this.ram = ram;
		this.cpu = cpu;
		
		
	}

	@Override
	public void wyswietlCetryfikatCE() {
		System.out.println("Certyfikat CE dla komputera");
		
	}
	
	
	
}
