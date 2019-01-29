class Point2D {
	private float x;
	private float y;

	Point2D() {
		x = 0.0f;
		y = 0.0f;
	}

	Point2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}
	public float getY() {
		return y;
	}

	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}

	public void setXY(float x, float y) {
		this.x = x;
		this.y = y;
	}

	// float[] getXY() {
	// }

	public String toString() {
		String temp = Float.toString(x) + "," + Float.toString(y);
		return temp;
	}
}