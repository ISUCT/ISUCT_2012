
package com.isuct.programming;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class regsolvetest {
   public regsolvetest() {
    } 
   @Test
    public void testCheckNum1() {
        System.out.println("checkNum1");
        String aNum = "#D#141212;053535;5700.0417;N;04059.6516;E;0;0;159;22;6.2;000;00;3.00,3.00;NA;GNS:1:10,GPS:1:12";
        regsolvetest instance = new regsolvetest();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }
}
