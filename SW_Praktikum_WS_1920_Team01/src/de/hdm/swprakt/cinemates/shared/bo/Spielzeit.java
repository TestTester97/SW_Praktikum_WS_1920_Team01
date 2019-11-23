package de.hdm.swprakt.cinemates.shared.bo;

import java.util.Date;



public class Spielzeit extends OwnedBusinessObject{
	
	/*
	 * Diese Klasse stellt die Spielzeit der Filme dar....
	 * 
	 * @author Ömer Degirmenci
	 * 
	 * @version 1.0
	 */

	// Attribut serialVersionUID

	private static final long serialVersionUID = 1L;
	
	// Attribut datum
	
	private Date zeitpunkt;
	
	// Attribut filmID 
	
	private int filmID;
	
	// Attribut kinoID
	
	private int kinoID;
	


	public Date getZeitpunkt() {
		return zeitpunkt;
	}

	public void setZeitpunkt(Date zeitpunkt) {
		this.zeitpunkt = zeitpunkt;
	}

	public int getFilmID() {
		return filmID;
	}

	public void setFilmID(int filmID) {
		this.filmID = filmID;
	}

	public int getKinoID() {
		return kinoID;
	}

	public void setKinoID(int kinoID) {
		this.kinoID = kinoID;
	}

	
	
	
	/*
	 * Diese Methode überprüft zwei Objekte auf Gleichheit
	 * 
	 */

	//@Override
	//public boolean equals(Object o) {

	/**
	 * Abfragen, ob ein Objekt ungleich NULL ist und ob ein Objekt gecastet werden
	 * kann.
	 * 
	 */
		
	/*
	 * Wenn keine Gleichheit festgestellt wurde, geben wir false zurück.
	 */
	
	
	
	/**
	 * Diese Methode erzeugt eine ganze Zahl, die für die Instanz von
	 * <code>Spielzeit</code> charakteristisch ist.
	 * 
	 */

	@Override
	public int hashCode() {
		return super.getID();
	}
	
}