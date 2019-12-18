/**
 * 
 */
package de.hdm.swprakt.cinemates.shared;

import java.util.Date;
import java.util.Vector;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.hdm.swprakt.cinemates.shared.bo.Film;
import de.hdm.swprakt.cinemates.shared.bo.Kino;
import de.hdm.swprakt.cinemates.shared.bo.Kinokette;
import de.hdm.swprakt.cinemates.shared.bo.Nutzer;
import de.hdm.swprakt.cinemates.shared.bo.Spielplan;
import de.hdm.swprakt.cinemates.shared.bo.Spielzeit;

/**
 * Synchrone Schnittstelle für eine RPC-fähige Klasse zur Verwaltung von Kinos,
 * Kinoketten Filmen, Spielpläne und Spielzeiten.
 * 
 * @author alina
 * @version 1.0
 *
 */

@RemoteServiceRelativePath("kinoadministration")
public interface KinoAdministration extends RemoteService {

///**
// * Initialisierung des Objekts. Diese Methode ist vor dem Hintergrund von GWT
// * RPC zusaetzlich zum No Argument Constructor der implementierenden Klasse
// * notwendig. Bitte diese Methode direkt nach der Instantiierung aufrufen.
// * 
// * @throws IllegalArgumentException
// */
//public void init() throws IllegalArgumentException;	
//
///**
//
///**
// * Abschnitt aller create-Methoden (Ömer)
// */
//

	/**
	 * Abschnitt aller create-Methoden Erstellen des uebergebenen Film-Objekts
	 * 
	 * @param film Film-Objekt, welches in der Datenbank erstellt werden soll
	 * @return
	 * @throws IllegalArgumentException
	 */
	public Film createFilm(String filmtitel, String beschreibung, String details) throws IllegalArgumentException;

///**
// * Abschnitt aller create-Methoden
// * Erstellen des uebergebenen Kinokette-Objekts
// * @param kinokette Kinokette-Objekt, welches in der Datenbank erstellt werden soll
// * @throws IllegalArgumentException
// */

	// public Kinokette createKinokette(String kinokettenname,String beschreibung )
	// throws IllegalArgumentException;
//
///**
// * Abschnitt aller create-Methoden
// * Erstellen des uebergebenen Kino-Objekts
// * @param kino Kino-Objekt, welches in der Datenbank erstellt werden soll
// * @throws IllegalArgumentException
// */
	public Kino createKino(String kinoname, String adresse, String beschreibung) throws IllegalArgumentException;

///**
// * Abschnitt aller create-Methoden
// * Erstellen des uebergebenen Spielplan-Objekts
// * @param spielplan Spielplan-Objekt, welches in der Datenbank erstellt werden soll
// * @throws IllegalArgumentException
// */
	// public void createSpielplan(Spielplan spielplan) throws
	// IllegalArgumentException;
//
//
///**
// * Abschnitt aller create-Methoden
// * Erstellen des uebergebenen Spielzeit-Objekts
// * @param spielzeit Spielzeit-Objekt, welches in der Datenbank erstellt werden soll
// * @throws IllegalArgumentException
// */
	public Spielzeit createSpielzeit(int filmID, Date zeitpunkt) throws IllegalArgumentException;

///**
// * Abschnitt aller save/update-Methoden (Ömer)
// */
//
//
///**
// * Abschnitt aller save/update-Methoden
// * Speichern des uebergebenen Film-Objekts
// * @param film Film-Objekt, welches in der Datenbank gespeichert werden soll
// * @throws IllegalArgumentException
// */
	public void saveFilm(Film film) throws IllegalArgumentException;

//
///**
// * Abschnitt aller save/update-Methoden
// * Speichern des uebergebenen Kinokette-Objekts
// * @param kinokette Kinokette-Objekt, welches in der Datenbank gespeichert werden soll
// * @throws IllegalArgumentException
// */
//public void editKinokette(Kinokette kinokette) throws IllegalArgumentException;
//
//
///**
// * Abschnitt aller save/update-Methoden
// * Speichern des uebergebenen Kino-Objekts
// * @param kino Kino-Objekt, welches in der Datenbank gespeichert werden soll
// * @throws IllegalArgumentException
// */
//public void save(Kino kino) throws IllegalArgumentException;
//
//
///**
// * Abschnitt aller save/update-Methoden
// * Speichern des uebergebenen Nutzer-Objekts
// * @param nutzer Nutzer-Objekt, welches in der Datenbank gespeichert werden soll
// * @throws IllegalArgumentException
// */
	public Nutzer saveNutzer(Nutzer nutzer) throws IllegalArgumentException;

//
//
///**
// * Abschnitt aller save/edit-Methoden
// * Speichern des uebergebenen Spielplan-Objekts
// * @param spielplan Spielplan-Objekt, welches in der Datenbank gespeichert werden soll
// * @throws IllegalArgumentException
// */
	public void saveSpielplan(Spielplan spielplan) throws IllegalArgumentException;

//
///**
// * Abschnitt aller delete-Methoden
// * Loeschen des uebergebenen Film-Objekts
// * @param film Film-Objekt, welches in der Datenbank geloescht werden soll
// * @throws IllegalArgumentException
// */

	public void deleteFilm(Film film) throws IllegalArgumentException;

///**
// * Loeschen des uebergebenen Gruppen-Objekts
// * @param gruppe Gruppe-Objekt, welches in der Datenbank geloescht werden soll
// * @throws IllegalArgumentException
// */
//public void delete(Gruppe gruppe) throws IllegalArgumentException;
//
///**
// * Loeschen des uebergebenen Kinokette-Objekts
// * @param kinokette Kinokette-Objekt, welches in der Datenbank geloescht werden soll
// * @throws IllegalArgumentException
// */
//public void delete(Kinokette kinokette) throws IllegalArgumentException;
//
///**
// * Loeschen des uebergebenen Kino-Objekts
// * @param kino Kino-Objekt, welches in der Datenbank geloescht werden soll
// * @throws IllegalArgumentException
// */
	public void deleteKino(Kino k) throws IllegalArgumentException;

///**
// * Loeschen des uebergebenen Spielplan-Objekts
// * @param nutzer Spielplan-Objekt, welches in der Datenbank geloescht werden soll
// * @throws IllegalArgumentException
// */
	public void deleteSpielplan(Spielplan sp) throws IllegalArgumentException;

///**
// * Loeschen des uebergebenen Spielzeit-Objekts
// * @param nutzer Spielzeit-Objekt, welches in der Datenbank geloescht werden soll
// * @throws IllegalArgumentException
// */
	public void deleteSpielzeit(Spielzeit sz) throws IllegalArgumentException;

//
///**
// * Saemtliche filme eines Film-Objekts ausgeben
// * @param film Film, dessen Filme angezeigt werden sollen
// * @return ArrayList saemtlicher Filme
// * @throws IllegalArgumentException
// */
	public Vector<Film> getAllFilme() throws IllegalArgumentException;
//

///**
// * Saemtliche kinoketten eines Kinokette-Objekts ausgeben
// * @param kinokette Kinokette, dessen kinoketten angezeigt werden sollen
// * @return ArrayList saemtlicher Kinoketten
// * @throws IllegalArgumentException
// */
//public Vector<Kinokette> findAllKinokette() throws IllegalArgumentException;
//
///**
// * Saemtliche kinos eines Kino-Objekts ausgeben
// * @param kino Kino, dessen kinos angezeigt werden sollen
// * @return ArrayList saemtlicher Kinos
// * @throws IllegalArgumentException
// */
//public Vector<Kino> findAllKino()throws IllegalArgumentException;
//
///**
// * Saemtliche nutzer eines Nutzer-Objekts ausgeben
// * @param nutzer Nutzer, dessen nutzer angezeigt werden sollen
// * @return ArrayList saemtlicher Nutzer
// * @throws IllegalArgumentException
// */
//public Vector <Nutzer> findAllNutzer() throws IllegalArgumentException;
//
///**
// * Saemtliche spielpläne eines Spielplan-Objekts ausgeben
// * @param spielplan Spielplan, dessen spielpläne angezeigt werden sollen
// * @return ArrayList saemtliche Spielpläne
// * @throws IllegalArgumentException
// */
	public Vector<Spielplan> getAllSpielplan() throws IllegalArgumentException;
//
///**
// * Saemtliche spielzeiten eines Spielzeit-Objekts ausgeben
// * @param spielzeit Spielzeit, dessen spielzeiten angezeigt werden sollen
// * @return ArrayList saemtliche Spielzeiten
// * @throws IllegalArgumentException
// */
//public Vector<Spielzeit> findAllSpielzeit() throws IllegalArgumentException;
//
///**
// * Saemtliche umfrageeinträge eines Umfrage-Objekts ausgeben
// * @param umfrage Umfrage, dessen spielzeiten angezeigt werden sollen
// * @return ArrayList saemtlicher Umfragen
// * @throws IllegalArgumentException
// */
//public Vector<Umfrageeintrag> findAllUmfrageeintrag() throws IllegalArgumentException;
//
///**
// * Saemtliche Umfragen eines Spielzeit-Objekts ausgeben
// * @param spielzeit Spielzeit, dessen Gruppen angezeigt werden sollen
// * @return ArrayList saemtlicher Umfrageeinträge einer Spielzeit
// * @throws IllegalArgumentException
// */
//public Vector<Umfrageeintrag> findUmfrageeintragOf(Spielzeit spielzeit) throws IllegalArgumentException;
//
///**
// * Saemtliche Umfragen eines Kino-Objekts ausgeben
// * @param kino Kino, dessen Umfrageeinträge angezeigt werden sollen
// * @return ArrayList saemtlicher Umfrageeinträge eines Kinos
// * @throws IllegalArgumentException
// */
//public Vector<Umfrageeintrag> findUmfrageeintragOf(Kino kino) throws IllegalArgumentException;
//
///**
// * Saemtliche Umfragen eines Umfrage-Objekts ausgeben
// * @param umfrage Umfrage, dessen Umfragen angezeigt werden sollen
// * @return ArrayList saemtlicher Umfragen
// * @throws IllegalArgumentException
// */
//public Vector<Umfrage> findAllUmfrage() throws IllegalArgumentException;

///**
// * Rueckgabe eines bestimmten Film-Objekts
// * @param id ID des gesuchten Films
// * @return Das erste Film-Objekt, welches den Suchkriterien entspricht
// * @throws IllegalArgumentException
// */
//public Film findFilmByID(int id) throws IllegalArgumentException;
//
///**
// * Rueckgabe eines bestimmten Gruppen-Objekts
// * @param id ID der gesuchten Gruppe
// * @return Das erste Gruppen-Objekt, welches den Suchkriterien entspricht
// * @throws IllegalArgumentException
// */
//public Gruppe findGruppeByID(int id) throws IllegalArgumentException;
//
///**
// * Rueckgabe eines bestimmten Kinokette-Objekts
// * @param id ID der gesuchten Kinokette
// * @return Das erste Kinokette-Objekt, welches den Suchkriterien entspricht
// * @throws IllegalArgumentException
// */
//public Kinokette findKinoketteByID(int id) throws IllegalArgumentException;
//
///**
// * Rueckgabe eines bestimmten Kino-Objekts
// * @param id ID des gesuchten Kinos
// * @return Das erste Kino-Objekt, welches den Suchkriterien entspricht
// * @throws IllegalArgumentException
// */
//public Kino findKinoByID(int id) throws IllegalArgumentException;
//
///**
// * Rueckgabe eines bestimmten Nutzer-Objekts
// * @param id ID des gesuchten Nutzers
// * @return Das erste Nutzer-Objekt, welches den Suchkriterien entspricht
// * @throws IllegalArgumentException
// */
//public Nutzer findNutzerByID(int id) throws IllegalArgumentException;
//
///**
// * Rueckgabe eines bestimmten Spielplan-Objekts
// * @param id ID des gesuchten Spielplans
// * @return Das erste Spielplan-Objekt, welches den Suchkriterien entspricht
// * @throws IllegalArgumentException
// */
//public Spielplan findSpielplanByID(int id) throws IllegalArgumentException;
//

///**
// * Rueckgabe eines bestimmten Spielzeit-Objekts
// * @param id ID der gesuchten Spielzeit
// * @return Das erste Spielzeit-Objekt, welches den Suchkriterien entspricht
// * @throws IllegalArgumentException
// */
//public Spielzeit findSpielzeitByID(int id)throws IllegalArgumentException;

	/**
	 * Auslesen aller Kinos der Kinokette Diese Methode wird bei delete Kinokette
	 * verwendet
	 */
	public Vector<Kino> getKinosOf(Kinokette kk) throws IllegalArgumentException;

	/**
	 * Auslesen sämtliche Kinoketten dieses Systems.
	 */
	public Vector<Kinokette> getAllKinokette() throws IllegalArgumentException;

	/**
	 * Löschen einer Kinokette
	 */

	public void deleteKinokette(Kinokette kk) throws IllegalArgumentException;

	/**
	 * Hinzufügen eines Kinos zur Kinokette
	 */
	public Kino addKinoToKinokette(Kinokette kinokette) throws IllegalArgumentException;

	/**
	 * Auslesen sämtliche Kinos dieses Systems.
	 */

	public Vector<Kino> getAllKinos() throws IllegalArgumentException;

	/**
	 * Auslesen des Spielplans des Kinos Diese Methode wird bei deleteKino verwendet
	 */
	public Spielplan getSpielplanOf(Kino k) throws IllegalArgumentException;

	/**
	 * Auslesen der Spielzeiten des Spielplans Diese Methode wird bei
	 * deleteSpielplan verwendet.
	 */
	public Vector<Spielzeit> getSpielzeitOf(Spielplan sp) throws IllegalArgumentException;

	/**
	 * Diese Methode wird aufgerufen,um alle Kinos die zu einer Kinokette gehört
	 * angezeigt werden sollen. Die Mapper Methode findKinosByKinokette wird
	 * aufgerufen.
	 */

	public Vector<Kino> getAllKinoOfKinokette(Kinokette kinokette) throws IllegalArgumentException;

	/**
	 * Speichern eines Kinos.
	 */
	public void saveKino(Kino k) throws IllegalArgumentException;

	/**
	 * Auslesen sämtliche Spielzeiten dieses Systems.
	 */

	public Vector<Spielzeit> getAllSpielzeiten() throws IllegalArgumentException;
}
