package test;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Rectangle;

public class RectangleTest {

	@Test
	public void testArea() {
		Rectangle r = new Rectangle(2, 3);
		assertTrue("area() test failed", r.area() == 2*3);
	}

	@Test
	public void testPerimeter() {
		Rectangle r = new Rectangle(2, 3);
		assertTrue("perimeter() test failed", r.perimeter() == 2*2+2*3);
	}

	@Test
	public void testRectangle() {
		Rectangle r1 = new Rectangle(2, 3);
		Rectangle r2 = new Rectangle(2, 3);
		
		assertEquals(r1, r2);
	}

	@Test
	public void testSetiWidth() {
		Rectangle r = new Rectangle(2, 3);
		r.setiLength(4);
		assertTrue("setiWidth() test failed", r.getiWidth() == 4);
	}

	@Test
	public void testSetiLength() {
		Rectangle r = new Rectangle(2, 3);
		r.setiLength(4);
		assertTrue("setiLength() test failed", r.getiLength() == 4);
	}

	@Test
	public void testGetiWidth() {
		Rectangle r = new Rectangle(2, 3);
		assertTrue("getiWidth() test failed", r.getiWidth() == 2);
	}

	@Test
	public void testGetiLength() {
		Rectangle r = new Rectangle(2, 3);
		assertTrue("getiLength() test failed", r.getiLength() == 3);
	}

	@Test
	public void testCompareTo() {
		Rectangle r1 = new Rectangle(2, 3);
		Rectangle r2 = new Rectangle(3, 4);
		assertTrue("compareTo() test failed", r1.compareTo(r2) == 1);
	}

}
