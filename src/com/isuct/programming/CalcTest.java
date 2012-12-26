package com.isuct.programming;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void testCalc() {
		// тестируем конструктор (оба варианта)
		Calc simpleConstr = new Calc();
		Calc defConstr = new Calc(2,0.95,1.25,0.3,2.75);
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
		assertEquals(Double.NaN,res[1][0], 0.001);
	}

	@Test
	public void testTaskB1() {
		Calc forTest = new Calc();
		double[][] res = forTest.taskB(new double[] { 1 });
		assertEquals(1,res[0][0], 0.001);
		assertEquals(1.188,res[1][0], 0.001);
	}

	@Test
	public void testTaskB7() {
		Calc forTest = new Calc();
		double[][] res = forTest.taskB(new double[] { 7 });
		assertEquals(7,res[0][0], 0.001);
	
	}

	@Test
	public void testTaskA() {

		Calc forTestParam = new Calc(2,0.95,1.25,0.3,2.75);
		double[][] res = forTestParam.taskA();

		assertEquals(0, res[0][0], 0.001);
		assertEquals(5, res[0][5], 0.001);
		assertEquals(9, res[0][9], 0.001);
		assertEquals(10, res[0][res[0].length - 1], 0.001);

		assertTrue(Double.isInfinite(res[1][0]));
		assertEquals(10.374, res[1][5], 0.001);
		assertEquals(25.031, res[1][9], 0.001);
		assertEquals(29.549, res[1][res[0].length - 1], 0.001);


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
		double[][] res = forTestParam.taskA(2,0.95,1.25,0.3,2.75);

		assertEquals(0, res[0][0], 0.001);
		assertEquals(5, res[0][5], 0.001);
		assertEquals(9, res[0][9], 0.001);
		assertEquals(10, res[0][res[0].length - 1], 0.001);

		assertTrue(Double.isInfinite(res[1][0]));
		assertEquals(10.374, res[1][5], 0.001);
		assertEquals(25.031, res[1][9], 0.001);
		assertEquals(29.549, res[1][res[0].length - 1], 0.001);
	}

}