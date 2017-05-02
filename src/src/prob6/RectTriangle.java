package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	public RectTriangle(double w, double h) {
		width = w;
		height = h;
	}
	
	public double getArea() {
		return width*height/2;
	}
	public double getPerimeter() {
		return width+height+Math.sqrt(width*width+height*height);
	}
	

}
