
import org.junit.Test;
import static org.junit.Assert.*;

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

    }
}