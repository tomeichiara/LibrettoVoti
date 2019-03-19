package it.polito.tdp.libretto;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> voti;
	
	public Libretto() {
		this.voti=new ArrayList<Voto>();
		
	}
	/**
	 * Aggiunge un nuovo voto al libretto
	 * 
	 * @param v il voto da aggiungere
	 * 
	 */
	public void add(Voto v) {
		voti.add(v);
	}
	
	/**
	 * Vi sono tre metodi per cercare tutti i voti
	 * pari a 25 e stamparli.
	 * 
	 * Devo pensare che poi mi servirà un'interfaccia grafica
	 * La formattazione adesso non ci interessa.
	 * Uso allora il terzo metodo.
	 */
	
//	public void StampaVoti(int voto) {
//		
//	}
//	public String StampaVoti2(int voto) {
//		
//	}
//	public List<Voto> cercaVoti(int voto){
//		
//	}
	
	
	
	public List<Voto> cercaVoti(int punti){
		List<Voto> result = new ArrayList<Voto>();
		
		for(Voto v:this.voti) {
			if(v.getPunti()==punti) {
				result.add(v);
			}
		}
		return result;
	}
	
	public Voto cercaEsame(String nomeEsame) {
		for(Voto v:this.voti) {
			// se uso == confronta le posizioni in 
			// memoria e non se le due stringhe sono uguali.
			if (v.getCorso().equals(nomeEsame)) {
				return v;
			}
		}
		return null;
	}
	
	/**
	 * Dato un Voto, determina se esiste già un voto con 
	 * uguale corso e uguale punteggio.
	 * @param v
	 * @return 	true se ho trovato un corso e punteggi uguali.
	 * 			false se non ho trovato oppure ha un voto diverso.
	 */
	
	public boolean esisteGiaVoto(Voto v) {
		Voto trovato = this.cercaEsame(v.getCorso());
		if(trovato == null)
			return false;
		if(trovato.getPunti()==v.getPunti()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
}
