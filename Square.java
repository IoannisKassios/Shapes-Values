package project1;

public class Square{
	//member variables
	private Point[] points;
	
	//methods
	//default constructor
	public Square() {
		points = new Point[4];
	}
	//custom constructor
	public Square(Point[] p) {
		points = p;
	}
	//custom constructor (copy)
	public Square(Square r) {
		points = r.getPoints();
	}
	
	//getters/setters
	public Point[] getPoints() {
		return points;
	}
	
	public void setPoints(Point[] p) {
		points = p;
	}
	
	//helper methods width, height
	public int getWidth() {
		return getPoints()[1].getX() - getPoints()[0].getX();
	}
	
	public int getHeight() {
		return getPoints()[1].getY() - getPoints()[2].getY();
	}
	
	//display data
	public void displayRectangleData() {
		System.out.println("Point A: ");
		getPoints()[0].displayCoords();
		System.out.println("Width = " + getWidth());
		System.out.println("Width = " + getHeight());
	}
	
	//calc area
	public int area() {
		return getWidth() * getHeight();
	}
	
	//calc perimeter
	public int perimeter() {
		return  (getWidth()*2) + (getHeight()*2);
	}
}