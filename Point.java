package project1;

public class Point{
	//member variables
	private int x;
	private int y;
	
	//methods
	//default constructor
	public Point() {}
	
	//init custom constructor
	public Point(int p_x, int p_y) {
		x = p_x;
		y = p_y;
	}
	//init custom constructor that gets Point p as parameter
	public Point(Point p) {
		x = p.getX();
		y = p.getY();
	}
	
	//getters-setters for x
	public void setX(int p_x) {
		x = p_x;
	}
	public int getX() {
		return x;
	}
	//getters-setters for y
	public void setY(int p_y) {
		y = p_y;
	}
	public int getY() {
		return y;
	}
	//display point coords
		public void displayCoords() {
			System.out.print("x = " + x);
			System.out.println(", y = " + y);
	}
}