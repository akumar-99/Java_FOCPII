class Rectangle1 extends Shape1 {
	private double width;
	private double length;

	public Rectangle1() {
		width = 1.0;
		length = 1.0;
	}

	public Rectangle1(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle1(double width, double length, String color, Boolean filled, Double radius) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return (length*width);
	}

	public double getPerimeter() {
		return (2*(length+width));
	}

	// String toString() {

	// }
}