class Point3D extends Point2D {
	private float z;

	Point3D() {
		z = 0.0f;
	}

	Point3D(float x, float y, float z) {
		super(x, y);
		this.z = z;
	}

	public float getZ() {
		return z;
	}
	
	public void setX(float z) {
		this.z = z;
	}
	

	public void setXYZ(float x, float y, float z) {
		setX(x);
		setY(y);
		this.z = z;
	}

	// float[] getXYZ() {
	// }

	public String toString() {
		String temp = Float.toString(getX()) + "," + Float.toString(getY()) + "," + Float.toString(z);
		return temp;
	}
}