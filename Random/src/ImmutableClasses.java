class Point{
	private int xPos, yPos;

	Point(int x, int y){
		this.xPos = x;
		this.yPos = y;
	}

	public void toString(){
		return "x = " + xPos + " y = " + yPos;
	}

	int getXPos(){
		return xPos;
	}
	int getYPos(){
		return yPos;
	}
}

public final class ImmutableCircle{
	private Point Center;
	private int radius;

	ImmutableCircle(int x, int y, int r){
		Center = new Point(x,y);
		radius = r;
	}

	public string toString(){
		return "center : " + center + " and radius " + radius;
	}

	public int getRadius(){
		return radius;
	}

	public int getCenter(){
		return new Point(Center.getXPos, Center.getYPos);
	}

	public static void main(String[] s){
		System.out.println(new ImmutableCircle(10,10,5));
	}
}