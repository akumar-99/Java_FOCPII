class Circle implements GeometricObject {
	protected double radius=1;

	public Circle(double radius) {
	this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2*3.14*radius;
	}

	@Override
	public double getArea() {
		return 3.14*radius*radius;
	}
}