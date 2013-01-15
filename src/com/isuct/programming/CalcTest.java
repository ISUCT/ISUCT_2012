/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

/**
 *
 * @author админ
 */
public class CalcTest {
    @Test
	public void testCalc() {
		// тестируем конструктор (оба варианта)
		// особо проверять тут не чего
		Calc simpleConstr = new Calc();
		Calc defConstr = new Calc(2.25, 1.2, 0.3, 2.7);
		if (simpleConstr != null & defConstr != null) {
			// Если конструкторы создали объекты - то все нормально
			assertTrue(true);
		} else {
			fail();
		}
	}

	@Test
	public void testTaskB0() {
		// Передадим несколько значений и проверим - что нам вернет
		Calc forTest = new Calc();
		double[][] res = forTest.taskB(new double[] { 0 });
		// Как Х передали 0, значит и в результате Х должен быть 0
		assertEquals(0,res[0][0], 0.001);
		// теперь Y проверим
		assertEquals(Double.NaN,res[1][0], 0.001);
	}

	@Test
	public void testTaskB1() {
		// Передадим несколько значений и проверим - что нам вернет
		Calc forTest = new Calc();
		double[][] res = forTest.taskB(new double[] { 1 });
		// Как Х передали 1, значит и в результате Х должен быть 1
		assertEquals(1,res[0][0], 0.001);
		// теперь Y проверим
		assertEquals(1.188,res[1][0], 0.001);
	}

	@Test
	public void testTaskB7() {
		// Передадим несколько значений и проверим - что нам вернет
		Calc forTest = new Calc();
		double[][] res = forTest.taskB(new double[] { 7 });
		// Как Х передали 1, значит и в результате Х должен быть 1
		assertEquals(7,res[0][0], 0.001);
		// теперь Y проверим
		assertEquals(18.135, res[1][0],0.001);
	}

	@Test
	public void testTaskA() {
		// задача A без передачи параметров
		// Сперва используем задачу А
		// в случае конструктора с передачей параметров
		Calc forTestParam = new Calc(2.25, 1.2, 0.3, 2.7);
		double[][] res = forTestParam.taskA();

		assertEquals(0, res[0][0], 0.001);
		assertEquals(5, res[0][5], 0.001);
		assertEquals(9, res[0][9], 0.001);
		assertEquals(10, res[0][res[0].length - 1], 0.001);

		assertTrue(Double.isInfinite(res[1][0]));
		assertEquals(10.374, res[1][5], 0.001);
		assertEquals(25.031, res[1][9], 0.001);
		assertEquals(29.549, res[1][res[0].length - 1], 0.001);


		// А в случае если используем конструктор по умолчанию - ничего не должно развалиться
		Calc forTestNoParam = new Calc();
		try {
			res = forTestNoParam.taskA();
			fail(); // сюда мы уже не придем (хотя это не правильно)
		} catch (ArrayIndexOutOfBoundsException arrEx) {
			assertTrue(true);
		}
	}

	@Test
	public void testTaskADoubleDoubleDoubleDoubleDouble() {
		// задача А с передачей параметров
		// задача A без передачи параметров
		// Сперва используем задачу А
		// в случае конструктора с передачей параметров
		Calc forTestParam = new Calc();
		double[][] res = forTestParam.taskA(2.25, 1.2, 0.3, 2.7);

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
