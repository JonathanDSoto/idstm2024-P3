
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
		
		/*if (r1x + r1w >= r2x &&     // r1 right edge past r2 left
		  r1x <= r2x + r2w &&       // r1 left edge past r2 right
		  r1y + r1h >= r2y &&       // r1 top edge past r2 bottom
		  r1y <= r2y + r2h) {       // r1 bottom edge past r2 top
		    return true;
		}*/
		
		if( this.x + this.w > p.x &&  this.x < p.x + p.w &&
				
			this.y + this.h > p.y && this.y < p.y + p.h) {
			
			return true; 
			
		}
		
		return false;
	}

}
