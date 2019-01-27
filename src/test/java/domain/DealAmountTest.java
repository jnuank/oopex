package domain;

import org.junit.Test;
import static org.junit.Assert.*;


public class DealAmountTest {
    @Test
    public void testEquals() {
        DealAmount amount = new DealAmount(10);
        DealAmount amount2 = new DealAmount(10);
        
        assertTrue(amount.equals(amount2));
    }
    @Test
    public void testEquals2() {
        DealAmount amount = new DealAmount(10);
        DealAmount amount2 = new DealAmount(200);
        
        assertFalse(amount.equals(amount2));
    }
    @Test
    public void testEquals3() {
        DealAmount amount = new DealAmount(10);
        DealDate otherType = new DealDate("20190101");
        
        assertFalse(amount.equals(otherType));
    }
}