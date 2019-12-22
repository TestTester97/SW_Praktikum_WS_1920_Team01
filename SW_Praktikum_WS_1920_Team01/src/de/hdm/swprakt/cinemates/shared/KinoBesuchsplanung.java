/**
 * 
 */
package de.hdm.swprakt.cinemates.shared;

import java.util.Vector;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.hdm.swprakt.cinemates.shared.bo.Film;
import de.hdm.swprakt.cinemates.shared.bo.Gruppe;
import de.hdm.swprakt.cinemates.shared.bo.Nutzer;
import de.hdm.swprakt.cinemates.shared.bo.Umfrage;
import de.hdm.swprakt.cinemates.shared.bo.Umfrageeintrag;
import de.hdm.swprakt.cinemates.shared.bo.Votum;

/**
 * Synchrone Schnittstelle für eine RPC-fähige Klasse zur Planung eines Kinobesuchs.(Anlage und Verwaltung
 * von Gruppen, Umfragen, etc.)
 * @author alina
 * @version 1.0
 *
 */

@RemoteServiceRelativePath("kinobesuchsplanung")
public interface KinoBesuchsplanung extends RemoteService {

	/**
	 * Initialisierung des Objekts.
	 * @throws IllegalArgumentException
	 */

	public void init() throws IllegalArgumentException;

	public Nutzer findNutzerByEmail(String email);

	public Nutzer createNutzer(String email, String nutzername);

	public void save(Nutzer nutzer);

	public void save(Gruppe gruppe);

	public Vector <Umfrage> showAllUmfrage();

	public Umfrage createUmfrage(String umfragenname);

	public Vector <Votum> showVotumOfUmfrageeintrag(Umfrageeintrag umfrageeintrag);

	public void deleteUmfrage(Umfrage umfrage);


	public Vector <Umfrageeintrag> umfrageergebnisseAnzeigen(Umfrage umfrage);

	public Umfrageeintrag bestesErgebnisErmitteln(Umfrage umfrage);

	public void deleteUmfrageeintrag(Umfrageeintrag umfrageeintrag);

	public void deleteVotum(Votum votum);

	public Vector <Gruppe>getAllGruppen();

	public Vector <Gruppe> getAllGruppenOfNutzer(Nutzer nutzer);

	public Vector <Gruppe> getAllGruppenOfUmfrage(Umfrage umfrage);

	public Nutzer getOwnerOfGruppe(Gruppe gruppe);

	public void mitgliedEntfernen(Nutzer nutzer, Gruppe gruppe);

	public Gruppe mitgliedHinzufügen(Nutzer nutzer, Gruppe gruppe);

	public Gruppe createGruppe(Nutzer nutzer, String gruppenname, Vector<Nutzer> gruppenmitglieder);

	public void deleteGruppe(Gruppe gruppe);

	public Umfrage save(Umfrage umfrage);

	public Vector<Umfrage> showAllUmfragenOfGruppe(Gruppe gruppe);

	public Vector<Umfrage> showAllUmfrageOfNutzer(Nutzer nutzer);

	public Vector<Umfrage> showAllUmfragenOFilm(Film film);

	public Vector<Umfrage> showAllUmfrageOfNutzerOhneErgebnis(Nutzer nutzer);

	public Vector <Umfrageeintrag> showUmfrageeinträgeofUmfrage(Umfrage umfrage);



}
