package ui;

import java.math.BigDecimal;
import java.util.Scanner;

import model.Komputer;
import model.Produkt;
import model.Sklep;
import model.Szkolenia;

public class Menu {

	public void wyswietlMenu(){
		
		Sklep sklep = new Sklep("www.skle.pl");
		System.out.println("1. Dodawaj produkt");
		System.out.println("2. Usuñ produkt");
		System.out.println("3. Edytuj produkt");
		System.out.println("4. Wyœwietlanie produktow");
		System.out.println("5. Dodaj szkolenie");
		System.out.println("6. Wyswietl rabat");
		System.out.println("q Zakonczenie programu");
		String opcja = " ";
		
		Scanner sc = new Scanner (System.in);
		do{
		System.out.println("Wybierz opcje");
		opcja = sc.nextLine();
	
		switch(opcja){
		case "1":{
			System.out.println("podaj cene: ");
			BigDecimal cena = sc.nextBigDecimal();
			//15.6\n - problem z enterem przy wczytywaniu wartosci dlatego trzeba dac to co nizej
			sc.nextLine();
			System.out.println("podaj nazwe");
			String nazwa = sc.nextLine();
			
			System.out.println("podaj cpu");
			String cpu = sc.nextLine();
			
			System.out.println("podaj ram");
			String ram = sc.nextLine();
			
			Produkt produkt = new Komputer(cena, nazwa, cpu, ram);
			sklep.dodajProdukt(produkt);
		}
			break;
			
		case "2":{
			
			sklep.wyswietlListe(); //wyswietlam liste komputerow
			if (sklep.czyPusty()){
				System.out.println("Lista jest pusta, nie ma czego usun¹c");
				
			} else{
			
				System.out.println("podaj indeks do usuniecia");
				int index = sc.nextInt();
				sc.nextLine(); //zaby wczytalo ten wprowadzony eneter?, kiedy wczytujemy cos innego niz string
				//to dla zabezpiecznenia to trzeba dac
				
				if(sklep.sprawdzIndex(index)){
				sklep.usunProdukt(index);
				System.out.println("komputer zostal poprawnie usuniety");
					
				}else{
					System.out.println("podales niepoprawny index");
				}
				
			}
		}
			break;
			
		case "3":{
			sklep.wyswietlListe();
			System.out.println("ktory element edytujemy: ");
			int index= sc.nextInt();
			sc.nextLine();
			//wyswietl komputer o podanym indeksie
			Produkt produkt = sklep.znajdzProdukt(index);
			
			if(produkt instanceof Komputer){
				
				Komputer komputer = (Komputer)sklep.znajdzProdukt(index);//()rzutowanie, zmiana jednego typu na drugi
				//pytamy uzytkownika co chce zmienic 
			
				System.out.println("Podaj now¹ cenê (aktualna cena: " + komputer.getCena() + ") ");
				BigDecimal cena = sc.nextBigDecimal();
				sc.nextLine();
				System.out.println("podaj nowa nazwe ( aktualna to " + komputer.getNazwa());
				String nazwa = sc.nextLine();
				System.out.println("podaj nowy cpu" +komputer.getCpu());
				String cpu = sc.next();
				System.out.println("podaj nowy ram "+komputer.getRam());
				String ram = sc.next();
				
				//przypisuje nowe wartosci
				//komputer.setCena(cena);
				//komputer.setNazwa(nazwa);
				//komputer.setRam(ram);
				//komputer.setCpu(cpu);
				//mozemy to sobie zrobic za pomoca metody
				
				komputer.zaktualizuj(cena,nazwa,ram, cpu); // kolejnosc paramterow w nawiasia musi byc taka sama
				//jak w metodzie
				
				sklep.zmodyfikujProdukt(index, komputer);
				
			}
			
		
		}
			break;
		case "4":
			if (sklep.czyPusty()){
				System.out.println("brak towar do wyswietlenia");
			}
			sklep.wyswietlListe();
			break;
			
		case "5":{
			System.out.println("podaj cene: ");
			BigDecimal cena = sc.nextBigDecimal();
			//15.6\n - problem z enterem przy wczytywaniu wartosci dlatego trzeba dac to co nizej
			sc.nextLine();
			System.out.println("podaj nazwe");
			String nazwa = sc.nextLine();
			
			System.out.println("podaj technologie");
			String technologie = sc.nextLine();
			
		
			Szkolenia szkolenie = new Szkolenia (cena, nazwa, technologie);
			sklep.dodajProdukt(szkolenie);
			
		}
			break;
			
		case "6":{
			sklep.wyswietlRabaty();
			
		}
			break;
		case "q":
		case "Q":	
			System.out.println("Wyjscie z programu");
			break;
			
		default:
			System.out.println("Nie ma takiej opcji");
			break;
		}
		}while(!"q".equalsIgnoreCase(opcja));
		
		
		
		
	}
	
}
