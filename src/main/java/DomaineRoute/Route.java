package DomaineRoute;

public class Route {
	private int posX;
	private int posY;
	private int width;
	private int height;

	public Route(int posX, int posY, int width, int height) {
		this.posX = posX;
		this.posY = posY;
		this.width = width;
		this.height = height;
	}
	
	public int getPosX(){
		return this.posX;
	}
	
	public int getPosY(){
		return this.posY;
	}

	public int getWidth(){
		return this.width;
	}
	
	public int getHeight(){
		return this.height;
	}
}
