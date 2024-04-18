
public class Player {

	int x;
	int y;
	int w;
	int h;
	String c;
	
	public Player(int x,int y,int w,int h, String color) {
		
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.c = color;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}
	
	public boolean colision(Player p) {
		
		if(this.x + this.w > p.x) {
			return true;
		}
		
		return false;
	}

}
