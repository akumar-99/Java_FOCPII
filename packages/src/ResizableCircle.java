class ResizableCircle extends Circle implements Resizable {
	ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public void resize(int percent) {     
		radius = percent/100*radius+radius;
		System.out.print(radius);
	}
}