package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	
	public Rectangle( int width, int height ) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public void resize(double s) {
		width *= s;
		height *= s;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getPerimeter() {
		return 2*(width + height);
	}
}
