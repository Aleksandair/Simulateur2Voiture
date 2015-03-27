package DomaineRoute;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import AppliSimu.gui.IHMRoute;

public class TestRoute {
	int posX;
	int posY;
	int larg;
	IHMRoute route;
	
	@Before
	public void setUp() throws Exception {
		posX = 5;
		posY = 5;
		larg = 10;
		route = new IHMRoute(posX, posY, larg);
	}


	@Test
	public void initRoute() {
		assertEquals(5, route.getX());
		assertEquals(5, route.getY());
		assertEquals(10, (int)route.getlarg());
	}

}
