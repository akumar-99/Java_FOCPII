class Square1 extends Rectangle1 {

	public Square1() {
	}

	public Square1(double side) {
		setLength(side);
	}

	public Square1(double side, String color, Boolean filled, Double radius) {
		setColor(color);
		setFilled(filled);
		setLength(side);
	}

	public double getSide() {
		return getLength();
	}

	public void setSide(double side) {
		setLength(side);
	}

	public void setWidth(double side) {
		setWidth(side);
	}

	public void setLength(double side) {
		setLength(side);
	}

	public String toString() {
		return "square";
	}
}