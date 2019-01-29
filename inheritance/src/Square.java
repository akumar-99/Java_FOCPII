class Square1 extends Rectangle1 {

	public Square1() {
	}

	public Square1(double side) {
		this.length = side;
		this.length = length;
	}

	public Square1(double width, double length, String color, Boolean filled, Double radius) {
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