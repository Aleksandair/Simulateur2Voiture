package AppliSimu.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.*;

import DomaineRoute.Route;

/**
 * Created by Skander on 27/03/2015.
 */
public class IHMRoute implements Observer {
	private static final long serialVersionUID = 1L;
	private Route maRoute;
	
	public IHMRoute(){
		super();
		this.maRoute = null;
	}

	public IHMRoute(Route maRoute) {
		this.maRoute = maRoute;
        maRoute.addObserver(this);
	}

	public void dessinerRoute(Graphics contexteGraphique) {
		contexteGraphique.fillRect(maRoute.getPosX(), maRoute.getPosY(), maRoute.getWidth(), maRoute.getHeight());
    }

    @Override
    public void update(Observable o, Object arg) {
        //maRoute = (Route) arg;
    }
}
