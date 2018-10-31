package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	
	int iDepth;
	
	public Cuboid(int width, int length, int depth) {
		
		super(width, length);
		
		setiDepth(depth);
	}
	
	public int getiDepth() {
		return iDepth;
	}
	
	public void setiDepth(int value) {
		iDepth = value;
	}
	
	public double volume() {
		return getiWidth() * getiLength() * getiDepth();
	}
	
	@Override
	public double area() {
		return getiWidth() * getiLength();
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	public int compareTo(Object o) {
		Rectangle rec = (Rectangle)o;
		if (this.area() == rec.area())
			return 0;
		else
			return (area() > rec.area()) ? 1 : -1;
	}
	
	class SortByArea implements Comparator<Cuboid> {
		
		public int compare(Cuboid a, Cuboid b) {
			return a.compareTo(b);
		}
	}

	class SortByVolume implements Comparator<Cuboid> {
		
		public int compare(Cuboid a, Cuboid b) {
			if (a.volume() == b.volume())
				return 0;
			else
				return (a.volume() > b.volume()) ? 1 : -1;
		}
	}
}