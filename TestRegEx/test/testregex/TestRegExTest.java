/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testregex;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author алпорва
 */
public class TestRegExTest {
    
    public TestRegExTest() {
    }

    @Test
    public void testCheckNum() {
         System.out.println("checkNum");
        String aNum = "$GPRMC,110457,A,5552.1776,N,3732.6664,E,0.1,147.6,210408,,*26";
        TestRegEx instance = new TestRegEx();
        boolean expResult = false;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
}