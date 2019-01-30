class Circle1 extends Shape1 {
	private double radius;
	private final double pi = 3.14;

	public Circle1() {
		radius = 1.0;
	}

	public Circle1(double radius) {
		this.radius = radius;
	}

	public Circle1(Double radius, String color, Boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return (pi*radius*radius);
	}

	public double getPerimeter() {
		return (2*pi*radius);
	}

	public String toString() {
		return ("radius" + radius);
	}
}