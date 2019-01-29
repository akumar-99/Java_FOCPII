class Box {
	float width;
	float height;
	float depth;

	Box() {
		width = 0.0f;
		height = 0.0f;
		depth = 0.0f;
	}

	Box(float width, float height, float depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	float getWidth() {
		return width;
	}
	float getHeight() {
		return height;
	}
	float getDepth() {
		return depth;
	}

	void setWidth(float width) {
		this.width = width;
	}
	void setHeight(float height) {
		this.height = height;
	}
	void setDepth(float depth) {
		this.depth = depth;
	}

	void displayVolume() {
		float volume = width*height*depth;
		System.out.println("VOLUME :: " + volume);
	}
}