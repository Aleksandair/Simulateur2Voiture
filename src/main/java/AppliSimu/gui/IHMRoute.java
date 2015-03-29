package AppliSimu.gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.*;

import DomaineRoute.Route;

/**
 * Created by Skander on 27/03/2015.
 */
public class IHMRoute extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Route maRoute;
	
	public IHMRoute(){
		super();
		this.maRoute = null;
	}

	public IHMRoute(Route maRoute) {
		this.maRoute = maRoute;
	}

	public void paint(Graphics contexteGraphique) {
		Color color = Color.black;
		super.paint(contexteGraphique);
		contexteGraphique.setColor(color);
		dessinerRoute(contexteGraphique, this.maRoute.getPosX(),
				this.maRoute.getPosY(), this.maRoute.getHeight(),
				this.maRoute.getWidth());

	}

	public void dessinerRoute(Graphics contexteGraphique, int x, int y, int w,
			int h) {
		contexteGraphique.fillRect(x, y, w, h);
	}

}
