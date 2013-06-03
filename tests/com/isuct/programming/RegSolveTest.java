/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 * @author Stud_6
 */
public class RegSolveTest {

    public RegSolveTest() {
    }

    /**
     * Test of checkNum method, of class RegSolve.
     */
    @Test
    public void testCheckNum1() {
        System.out.println("checkNum1");
        String aNum = "800-555-1212";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckNum2() {
        System.out.println("checkNum2");
        String aNum = "800 555 1212";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckNum3() {
        System.out.println("checkNum3");
        String aNum = "800.555.1212";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckNum4() {
        System.out.println("checkNum4");
        String aNum = "(800) 555-1212";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckNum5() {
        System.out.println("checkNum5");
        String aNum = "1-800-555-1212";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckNum6() {
        System.out.println("checkNum6");
        String aNum = "800-555-1212-1234";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckNum7() {
        System.out.println("checkNum7");
        String aNum = "800-555-1212x1234";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckNum8() {
        System.out.println("checkNum8");
        String aNum = "800-555-1212 ext.1234";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckNum9() {
        System.out.println("checkNum9");
        String aNum = "work-1-(800) 555.1212 #1234";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckNum10() {
        System.out.println("checkNum10");
        String aNum = "8005551212";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }

    @Test
    public void testCheckNum11() {
        System.out.println("checkNum11");
        String aNum = "80055512121234";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }
}
