class BoxWeight extends Box {
	float weight;

	BoxWeight() {
		weight = 0.0f;
	}

	BoxWeight(float width, float height, float depth, float weight) {
		super(width, height, depth);
		this.weight = weight;
	}

	// BoxWeight(float width, float height, float depth, float weight) {
	// 	this.width = width;
	// 	this.height = height;
	// 	this.depth = depth;
	// 	this.weight = weight;
	// }

	float getWeight() {
		return weight;
	}

	void setWeight(float width) {
		this.weight = weight;
	}

	void displayWeight() {
		System.out.println("WEIGHT :: " + weight);
	}
}