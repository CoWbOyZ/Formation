package begin.test;

import static org.junit.Assert.*;

import org.junit.Test;

import begin.Geometric;

public class GeometricTest {

	@Test
	public void testGetEmptyCircle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFullCircle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmptySquare() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFullSquare() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIter() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRec() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetEmptyRectangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSpaceLine() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRectangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetTriangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testRetournerLigne() {
		fail("Not yet implemented");
	}

	@Test
	public void testRetournerTrait() {
		fail("Not yet implemented");
	}

	@Test
	public void testBackToTheLine() {
		//fail("Not yet implemented");
		assertEquals(Geometric.backToTheLine(),"\n");
	}
	
	@Test
	public void testGetXLine() {
		//fail("Not yet implemented");
		assertEquals(Geometric.getXLine(5, "*"),"*****");
		assertEquals(Geometric.getXLine(0, "*"),"");
		assertEquals(Geometric.getXLine(-10, "x"),"");
		assertEquals(Geometric.getXLine(7, "x"),"xxxxxxx");
	}

	@Test
	public void testGetStarLine() {
		//fail("Not yet implemented");
		assertEquals(Geometric.getStarLine(5),"*****");
		assertEquals(Geometric.getStarLine(0),"");
		assertEquals(Geometric.getStarLine(-10),"");
	}

}
