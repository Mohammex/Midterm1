package pkgShape;

public class Rectangle extends Shape {
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int width, int length) {
		
	}
	
	public int getiWidth()  {
		return this.iWidth;
	}
	
	public void setiWidth(int width) {
		this.iWidth = width;
	}
	
	public int getiLength() {
		return this.iLength;
	}
	
	public void setiLength(int length) {
		this.iLength = length;
	}
	
	public double area() {
		double result = iWidth * iLength;
		return result;
	}
	
	public double perimeter() {
		double result = 2*(iWidth + iLength);
		return result;
	}
	
	public int compareTo(Object o) {
		Rectangle rec = (Rectangle)o;
		if (this.area() == rec.area())
			return 0;
		else
			return (area() > rec.area()) ? 1 : -1;
	}
}