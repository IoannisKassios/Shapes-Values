package project1;

public class Circle
{
  //member variables, pi cost
	private Point center;
	private int radius;
	public static final double PI = 3.14159;
	
	//methods
	//default constructor
	public Circle() {
		center = new Point();
	}
	
	public Circle(Point c, int r) {
		center = new Point(c);
		radius = r;
	}
	
	//getters/setters for center
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center = center;
	}
	
	//getters/setters for radius
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//method to show data
	public void displayCircleData() {
		System.out.println("center: ");
		getCenter().displayCoords();
		System.out.println("radius: " + getRadius());
	}
	//method calculate area
	public double area() {
		return PI * radius * radius;
	}
	
	//calculate and returns Circle circumference
	public double circumference() {
		return 2 * PI * radius;
	}
	
	
}