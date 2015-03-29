package DomaineRoute;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestRoute {
	int posX;
	int posY;
	int width;
	int heigth;
	Route route;
	
	@Before
	public void setUp() throws Exception {
		posX = 5;
		posY = 5;
		width = 10;
		heigth = 10;
		route = new Route(posX, posY, width, heigth);
	}

	@Test
	public void initRoute() {
		assertEquals(5, route.getPosX());
		assertEquals(5, route.getPosY());
		assertEquals(10, route.getWidth());
		assertEquals(10, route.getHeight());
	}

}
