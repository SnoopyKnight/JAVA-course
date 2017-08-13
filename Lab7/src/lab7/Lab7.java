package lab7;

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] graphics = new Shape[4];
		graphics[0] = new Point(2, 3);
		graphics[1] = new Circle(5.0);
		graphics[2] = new Square(8);
		graphics[3] = new Rectangle(10, 70);
		for(Shape s : graphics){
			System.out.println(s.toString());
		}
	}
}

abstract class Shape {
	protected String name;

	public Shape() {
		this.name = "???";
	}

	public Shape(String name) {
		this.name = name;
	}

	/*public void setName(String newName) {
		this.name = newName;
	}

	public String getName() {
		return name;
	}*/

	public abstract double getArea();

	public String toString() {
		String result = " ";
		result = "Shape name = " + name + ", Area = " + getArea();
		return result;
	}

}

class Point extends Shape {
	protected int x;
	protected int y;

	public Point() {
		super();
		this.x = 0;
		this.y = 0;
		this.name = "Point";
		
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.name = "Point";
	}

	public double getArea() {
		return 0.0;
	}

	public String toString() {
		String result = " ";
		result = "Shape name = " + name + ", Area = " + getArea() + ",(x,y) = "
				+ "(" + x + "," + y + ")";
		return result;
	}

}

class Circle extends Point {
	private double radius;

	public Circle() {
		super();
		this.radius = 0;
		this.name = "Circle";
	}

	public Circle(double radius) {
		super(2,3);
		this.radius = radius;
		this.name = "Circle";
	}

	public double getArea() {
		return 3.14159 * Math.pow(radius, 2);
	}

	public String toString() {
		String result = " ";
		result = "Shape name = " + name + ", Area = " + getArea() + ",(x,y) = "
				+ "(" + x + "," + y + ")" + "is the center and the radius is "
				+ radius;
		return result;
	}
}

class Square extends Point {
	private double width;

	public Square() {
		super();
		this.width = 0;
		this.name = "Square";
	}

	public Square(double width) {
		super(2,3);
		this.width = width;
		this.name = "Square";
	}

	public double getArea() {
		return Math.pow(width, 2);
	}

	public String toString() {
		String result = " ";
		result = "Shape name = " + name + ", Area = " + getArea() + ",(x,y) = "
				+ "(" + x + "," + y + ")"
				+ " is the upper left corner. The width is " + width;
		return result;
	}

}

class Rectangle extends Point {
	private double width;
	private double height;

	public Rectangle() {
		super();
		this.width = 0;
		this.height = 0;
		this.name = "Retangle";
	}

	public Rectangle(double width, double height) {
		super(2,3);
		this.width = width;
		this.height = height;
		this.name = "Retangle";
	}

	public double getArea() {
		return width * height;
	}

	public String toString() {
		String result = " ";
		result = "Shape name = " + name + ", Area = " + getArea() + ",(x,y) = "
				+ "(" + x + "," + y + ")"
				+ " is the upper left corner. The width is " + width
				+ " and the height is " + height;
		return result;
	}
}