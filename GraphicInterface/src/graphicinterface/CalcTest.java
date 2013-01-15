
package graphicinterface;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {

	@Test
	public void testCalc() {
		
		Calc simpleConstr = new Calc();
		Calc defConstr = new Calc(0.2,0.4,2.2);
		if (simpleConstr != null & defConstr != null) {
			
			assertTrue(true);
		} else {
			fail();
		}
	}

	@Test
	public void testTaskB0() {
		
		Calc forTest = new Calc();
		double[][] res = forTest.taskB(new double[] { 0 });
		assertEquals(0,res[0][0], 0.001);
		assertEquals(1,res[1][0], 0.001);
	}

	@Test
	public void testTaskB1() {
		Calc forTest = new Calc();
		double[][] res = forTest.taskB(new double[] { 1 });
		assertEquals(1,res[0][0], 0.001);
		assertEquals(0.2,res[1][0], 0.001);
	}

	@Test
	public void testTaskB7() {
		Calc forTest = new Calc();
		double[][] res = forTest.taskB(new double[] { 2 });
		assertEquals(2,res[0][0], 0.001);
		
		assertEquals(-0.857, res[1][0],0.001);
	}

	@Test
	public void testTaskA() {
		
		Calc forTestParam = new Calc(0.2,0.4,2.2);
		double[][] res = forTestParam.taskA();

		assertEquals(0.2, res[0][0], 0.001);
		assertEquals(1.2, res[0][5], 0.001);
		assertEquals(2, res[0][9], 0.001);
		assertEquals(2.2, res[0][10], 0.001);

		assertTrue(Double.isInfinite(res[1][0]));
		assertEquals(0, res[1][5], 0.001);
		assertEquals(-0.857, res[1][9], 0.001);
		assertEquals(-1.082, res[1][10], 0.001);

		Calc forTestNoParam = new Calc();
		try {
			res = forTestNoParam.taskA();
			fail(); 
		} catch (ArrayIndexOutOfBoundsException arrEx) {
			assertTrue(true);
		}
	}

	@Test
	public void testTaskADoubleDoubleDoubleDoubleDouble() {
		
		Calc forTestParam = new Calc();
		double[][] res = forTestParam.taskA(0.2,0.4,2.2);

		assertEquals(0.2, res[0][0], 0.001);
		assertEquals(1.2, res[0][5], 0.001);
		assertEquals(2, res[0][9], 0.001);
		assertEquals(2.2, res[0][10], 0.001);

		assertTrue(Double.isInfinite(res[1][0]));
		assertEquals(0, res[1][5], 0.001);
		assertEquals(-0.857, res[1][9], 0.001);
		assertEquals(-1.082, res[1][10], 0.001);

	}

} 
    
    
    
    

