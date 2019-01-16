import java.util.*;
class Point {	
	private double x;
	private double y;
	
	Point() {
		x = 0.0;
		y = 0.0;
	}

	Point(double x) {	
		this.x = x;
		y = 0.0;
	}

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	public double Distance(Point p1) {
		Point p2 = new Point();
		p2.x = p1.x - this.x;
		p2.y = p1.y - this.y;
		double distance = Math.sqrt(p2.x*p2.x + p2.y*p2.y);
		return distance;
	}
}
