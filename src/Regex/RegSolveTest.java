package Regex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RegSolveTest {

    public RegSolveTest() {
    }

    @Test
    public void testCheckNum1() {
        System.out.println("checkNum1");
        String aNum = "!0001,03,01000000,00000105,1FDCFE96,33E5E736,13EAA5FA,000a00CCb32c05D;03000101,1FDCFE96,33E5E736,13EAA5FA,000a00CCb32c05D;00000905,1FDCFE96,33E5E736,13EAA5FA,000a00CCb32c05F;03000901,1FDCFE96,33E5E736,13EAA5FE,000a00CCb32c05F;03000905,1FDCFE96,33E5E736,13EAA600,000a00CCb32c05F;00000905,1FDCFE96,33E5E736,13EAA5FA,000a00CCb32c05F;1B001905,1FDCFE96,33E5E736,13EAA5FA,000a00CCb32c05F;03001901,1FDCFE96,33E5E736,13EAA5FE,000a00CCb32c05F;03001905,1FDCFE96,33E5E736,13EAA600,000a00CCb32c05F;04001907,1FDCFE96,33E5E736,13EAA618,000a00CCb32c05F;1B000907,1FDCFE96,33E5E736,13EAA61A,000a00CCb32c05F;1B001907,1FDCFE96,33E5E736,13EAA641,000a00CCb32c05F;1B000907,1FDCFE96,33E5E736,13EAA671,000a00CCb32c05F;1B001907,1FDCFE96,33E5E736,13EAA67A,000a00CCb32c05F;1B000907,1FDCFE96,33E5E736,13EAA69F,000a00CCb32c05F;05000B07,21FA9558,187242C4,13EAA6F1,000a04B9b09c05F;13000B0F,21FA9558,187242C4,14076E6A,000a04B9b09c05F;06000B0F,21FA9558,187242C4,14076FBF,000a04B9b09c05F;13000907,21FA9558,187242C4,14077217,000a04B9b09c05F*12";
        RegSolve instance = new RegSolve();
        boolean expResult = true;
        boolean result = instance.checkNum(aNum);
        assertEquals(expResult, result);
    }
}
