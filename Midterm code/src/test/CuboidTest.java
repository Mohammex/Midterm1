package test;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgShape.Cuboid;

public class CuboidTest {

	@Test
	public void testArea() {
		Cuboid c = new Cuboid(2, 3, 4);
		assertTrue("area() test failed", c.area() == 2*3);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void testUnsupportedOperationException() {
		Cuboid c = new Cuboid(2, 3, 4);
		c.perimeter();
	}
	
	@Test
	public void testCuboid() {
		Cuboid c1 = new Cuboid(2, 3, 4);
		Cuboid c2 = new Cuboid(2, 3, 4);
		
		assertEquals(c1, c2);
	}

	@Test
	public void testGetiDepth() {
		Cuboid c = new Cuboid(2, 3, 4);
		c.setiDepth(5);
		assertTrue("setiDepth() test failed", c.getiWidth() == 5);
	}

	@Test
	public void testSetiDepth() {
		Cuboid c = new Cuboid(2, 3, 4);
		assertTrue("getiDepth() test failed", c.getiDepth() == 4);
	}

}
