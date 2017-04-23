package model;

import java.math.BigDecimal;

public abstract class Produkt { //abstract nie mozemy utworzyc obiektu klasy produkt bo nie ma to sensu(np. narysuj zwierze)
	//utworzenie obiektu klasu produkt jest nielegalne bo jest ona abstrakcyjna
	//abstract moze byc tez uzywane do metod
	
	protected int id;
	//generator id
	
	
	
	protected BigDecimal cena; // protected publiczne dla rodziny, private dla pozostalych
	protected String nazwa;
	//zmienna statyczna, dostepna dla wszystkich obiektow danej klasy, jedna dla wszystkich obietow, wszystkie obiekty maj¹ wspolny generator,
	//wspolna numeracja dla szkolen i komputerow.
	// final do takich danych ktorych nie mozna edytowac
	//final static - stala dostepna dla wszystkich

	private static int generator =1;
	
	public Produkt(BigDecimal cena, String nazwa) {
		this.cena = cena;
		this.nazwa = nazwa;
		this.id = generator;
		generator++;
	}

	public BigDecimal getCena() {
		return cena;
	}

	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public abstract String dajRabat();
	
	public static void wyswietlIloscObiektow(){ //metoda statyczna
		System.out.println(generator);
	}
}
