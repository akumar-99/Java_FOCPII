class Shape1 {
	private String color;
	private Boolean filled;

	public Shape1() {
		color = "red";
		filled = true;
	}

	public Shape1(String color, Boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Boolean isFilled() {
		return filled;
	}

	public void setFilled(Boolean filled) {
		this.filled = filled;
	}

	// String toString() {

	// }
}