/*
* To change this template, choose Tools | Templates
* and open the template in the editor.
*/

/**
*
* @author Admin
*/
public class CalkTest {
    
@Test
public void CalkTest() {
// тестируем конструктор (оба варианта)
Calk simpleConstr = new Calk();
Calk defConstr = new Calk(0.2,0.3,0.44);
if (simpleConstr != null & defConstr != null) {
assertTrue(true);
} else {
fail();
}
}

@Test
public void testTaskB0() {
Calk forTest = new Calk();
double[][] res = forTest.taskB(new double[] { 0 });
assertEquals(0,res[0][0], 0.001);
assertEquals(Double.NaN,res[1][0], 0.001);
}

@Test
public void testTaskB1() {
Calk forTest = new Calk();
double[][] res = forTest.taskB(new double[] { 1 });
assertEquals(1,res[0][0], 0.001);
assertEquals(1.188,res[1][0], 0.001);
}

@Test
public void testTaskB7() {
Calk forTest = new Calk();
double[][] res = forTest.taskB(new double[] { 7 });
assertEquals(7,res[0][0], 0.001);

}

@Test
public void testTaskA() {

Calk forTestParam = new Calk(0.2,0.3,0.44);
double[][] res = forTestParam.taskA();

assertEquals(0, res[0][0], 0.001);
assertEquals(5, res[0][5], 0.001);
assertEquals(9, res[0][9], 0.001);
assertEquals(10, res[0][res[0].length - 1], 0.001);

assertTrue(Double.isInfinite(res[1][0]));
assertEquals(10.374, res[1][5], 0.001);
assertEquals(25.031, res[1][9], 0.001);
assertEquals(29.549, res[1][res[0].length - 1], 0.001);


Calk forTestNoParam = new Calk();
try {
res = forTestNoParam.taskA();
fail();
} catch (ArrayIndexOutOfBoundsException arrEx) {
assertTrue(true);
}
}

@Test
public void testTaskADoubleDoubleDoubleDoubleDouble() {

Calk forTestParam = new Calk();
double[][] res = forTestParam.taskA(0.2,0.3,0.44);

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