package model;

import java.util.ArrayList;
import java.util.List;

public class Sklep {
	
	private String www;
	
	//private List<Komputer> komputery;
	//private List<Szkolenia> szkolenia;
	
	private List<Produkt> produkty;

	public Sklep(String www) {
		this.www = www;
		this.produkty = new ArrayList<>(); //lista komputerow w sklepiej
		
	}
	
	
	
	//dodajKomputer
	
	public void dodajProdukt(Produkt produkt){
		produkty.add(produkt);
		
	}
	
	//usunKomputer
	
	public void usunProdukt(int index){
		produkty.remove(index -1); //bo index uytkownik wprowadza nam od 1, a my mamy od 0 zawsze
		
	}
	//wyswietlListe
	public void wyswietlListe (){
		
		for( int i =0; i<produkty.size(); i++)
		System.out.println((i+1) + ". " + produkty.get(i));//wyswietla nam indeks i liste komputerow 
	}
	//zmodyfikujKomputer
	
	public void zmodyfikujProdukt (int index, Produkt produkt){ //znajdziemy komputer na podanym indeksie 
		// i podmieniumy na ten co mamy po prawej
		produkty.set(index -1, produkt); // ta metoda nam podmieni komputer na miejscu index ktory podamy
		
		
	}
	public Produkt znajdzProdukt(int index){ //metoda, ktora znajdzie mi komputer o podanym indeksie 
		//i go wezmie z listy komputerow
		return produkty.get(index - 1);
		
	}

	public boolean czyPusty() {
		
		return produkty.isEmpty(); //funkcja czy pusty
	}

	public boolean sprawdzIndex(int index) {
		return index >0 && index <= produkty.size();
	/*	if(index>0 && indez <= komputery.size()){
		return true;
	}else{
		return false;
	}
	*/
	}



	public void wyswietlRabaty() {
		for(Produkt produkty : produkty){
			System.out.println(produkty.dajRabat());
		}
	}
	
	
	public void wyswietlCefryfikatCE(){ //jezeli urzadzenie jest elektroniczne to ma sie wyswietlic certyfikat CE
		for (Produkt produkt : produkty){
			if(produkt instanceof Urz¹dzenieElektroniczne){
				Urz¹dzenieElektroniczne ue = (Urz¹dzenieElektroniczne) produkt;
				ue.wyswietlCetryfikatCE();
			}
		}
		
	}

}
