package main;

import model.Produkt;
import ui.Menu;

public class Main {
	
	public static void wyswietlPI(){
		System.out.println(Math.PI);
	}

	public static void main(String[] args) {
		wyswietlPI(); // metoda musi byc statyczna bo to jest statyczne
		//nie trzeba miec obiektow ale mozna wywo³ac obiektu - przy metodach statycznych
		Produkt.wyswietlIloscObiektow();
		
		Math.cos(3.12);//to tez metoda statystyczna, nie chce tworzyc obiektu, tylko dla podanej wartosci robi obliczenie
		//w metodzie statycznej nie mozna sie odwolac do niestycznych skladowych
		Menu menu = new Menu();
		menu.wyswietlMenu();
		

	}

}

