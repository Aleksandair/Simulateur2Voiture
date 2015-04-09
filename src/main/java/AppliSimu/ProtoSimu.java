package AppliSimu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import AppliSimu.gui.IHMRoute;
import AppliSimu.gui.IHMVoiture;
import DomaineRoute.Route;
import DomaineVoiture.Voiture;

public class ProtoSimu {

	public static final int dureeUneSecondeEnMilliSecondes = 1000;

	public static void main(String[] args) {

		final Voiture maVoiture = new Voiture (100, 0, 10);
		final Route routeHorizontale = new Route(0, 280, 500, 50);

		IHMRoute route = new IHMRoute(routeHorizontale);

        IHMVoiture monTriangle = new IHMVoiture(maVoiture, route);

		Timer timerAvancer = new Timer(dureeUneSecondeEnMilliSecondes, new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				maVoiture.miseAJourPosition();
			}
		});
		
		timerAvancer.start();
		
		while(true){
		}

	}

}
