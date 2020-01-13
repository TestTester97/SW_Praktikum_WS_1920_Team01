/**
 * 
 */
package de.hdm.swprakt.cinemates.client.gui.admin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.hdm.swprakt.cinemates.client.ClientSideSettings;
import de.hdm.swprakt.cinemates.client.KinoAdministrationEntry;
import de.hdm.swprakt.cinemates.client.KinobesuchsplanungEntry;
import de.hdm.swprakt.cinemates.client.gui.editor.NutzerkontoForm;
import de.hdm.swprakt.cinemates.server.LoginServiceImpl;


/**
 * Diese Klasse dient zur Darstellung des Headers der Applikation. Sie beinhaltet das Logo der Applikation,
 * sowie den Namen 
 * @author alina
 * @version 1.0
 *
 */
public class HeaderfuerKinoAdministration extends HorizontalPanel {

	/* Diese privaten Attribute stellen Widgtes dar, deren Inhalte Variable sind. 
	 * Sie werden benötigt, um die Inhalte im weiteren Verlauf sinnvolll zu struktutieren. 
	 * Es werden dazu später ClickHandler auf die Widgets implementiert.
	 */
	private Button adminButton;
	private Button planerButton;
	private Button nutzer;
	private Button logout;
	private Label nutzerbeschriftung;
	private Image logo;



	/*
	 * Beim Anzeigen werden die Widgets erzeugt. Alle werden in einem
	 * Raster angeordnet, dessen Größe sich aus dem Platzbedarf der enthaltenen
	 * Widgets bestimmt.
	 */

	public void onLoad() {

		super.onLoad();

		/*+ Zunächst die Instantiierung der einzelenen Widgets/Buttons
		 * 
		 */
		adminButton = new Button();
		adminButton.setHTML("<i class=\"fas fa-sync\"></i>");
		adminButton.getElement().setId("adminbutton");
		adminButton.setSize("80px", "80px");

		nutzer = new Button("Nutzer");
		nutzer.setHTML("<i class=\"fas fa-user\"></i>");
		nutzer.setSize("80px", "80px");
		nutzer.getElement().setId("NutzerButton");
		planerButton = new Button("Zur Kinobesuchsplanung");
		planerButton.getElement().setId("planerbutton");
		logo = new Image("images/CineMates Logo.jpg");
		logo.setWidth("80px");
		logout = new Button("Logout");
		logout.getElement().setId("LogoutButton");
		logout.setSize("80px", "80px");


		logout.setHTML("<i class=\"fas fa-sign-out-alt\"></i>");
		logo = new Image("images/CineMates Logo.jpg");
		logo.setWidth("150px");




		/** Hinzufügen der Buttons/Widgtes zum HorizontalPanel
		 * 
		 */
		this.add(logo);
		this.add(planerButton);
		RootPanel.get("MenuBar").add(nutzer);
		RootPanel.get("MenuBar").add(logout);
		RootPanel.get("MenuBar").add(adminButton);



		/** Auf den Button, welcher zunächst den Nutzernamen darstellen soll, soll ein Panel "gelegt" werden,
		 * welches es dem Nutzer ermöglicht, sich sein Nutzerkonto anzeigen zu lassen
		 * ,es zu bearbeiten, sowie sich auszuloggen.
		 * 
		 */

		/** Hinzufügen der ClickHandler zu den Buttons
		 * 
		 */
		adminButton.addClickHandler(new AdminClickHandler());
		planerButton.addClickHandler(new PlanerClickHandler());
		nutzer.addClickHandler(new NutzerClickHandler());
		logout.addClickHandler(new LogoutClickHandler());


	}

	/**
	 *************************
	 *Abschnitt der Click-Handler
	 *************************
	 */


	/** Für ClickHandler-Klassen bietet sich das Konzept der nested classes an, da sie nicht weiter benötigt werden
	 * als an dieser Stelle. Sie implementieren das, von GWT bereitgestellte, Interface <code> ClickHandler </code>
	 *
	 */
	private class AdminClickHandler implements ClickHandler{

		/** Der Nutzer soll zunächst auf die Seite der Kinobesuchsplanung geführt werden.
		 *  Klickt er dann nochmals auf Button "Kinoadministration", so wird die Seite neu geladen.
		 */
		@Override
		public void onClick(ClickEvent event) {
			Window.Location.reload();



		}
	}
	private class PlanerClickHandler implements ClickHandler{

		/** Klickt der Nutzer auf den Button der mit "Kinobesuchsplanung" beschriftet ist,
		 *  so wird er auf diese Seite weitergeleitet.
		 */

		@Override
		public void onClick(ClickEvent event) {
			Window.Location.assign("Kinobesuchsplanung.html");
		}




	}
	/**
	 * Klickt der Nutzer auf den Nutzerbutton, so wird ihm sein Nutzerkonto
	 * angezeigt und er kann hier seinen Nutzernamen bearbeiten.
	 */
	private class NutzerClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {

			RootPanel.get("DetailsPanel").clear();
			
			ClientSideSettings.getLogger().severe("Nutzerkonto anzeigen geklickt");
			
			NutzerkontoForm nutzerkontoform = new NutzerkontoForm();

			RootPanel.get("DetailsPanel").add(nutzerkontoform);

		}
	}
	
	
	private class LogoutClickHandler implements ClickHandler {

		@Override
		public void onClick(ClickEvent event) {
			
			Window.Location.assign(KinoAdministrationEntry.AktuellerNutzer.getNutzer().getLogoutUrl());
			
		}
		
	}
}