package project1;

public class Main{
	public static void main(String[] args) {
		//point for circle
		Point p1 = new Point(1,1);
		
		//create circle
		Circle c1 = new Circle(p1, 4);
		
		//print circle data
		System.out.println("Circle circumference = " + c1.circumference());
		System.out.println("Circle area = " + c1.area());
		c1.displayCircleData();
		/////////////////////////////////////////////////////////////////////////////////
		//4 points for rectangle
		Point[] p = {new Point(2,2), new Point(8,2), new Point(8,-1), new Point(2,-1)};
		//create square
		Square r1 = new Square();
		r1.setPoints(p);
		
		//print square data
		System.out.println("Square perimeter = " + r1.perimeter());
		System.out.println("Square area = " + r1.area());
		r1.displayRectangleData();
		
	}
}