package domain;

import org.junit.Test;
import static org.junit.Assert.*;


public class DealAmountTest {
    @Test
    public void test_同じ値を比較してイコールとなること() {
        DealAmount amount = new DealAmount(10);
        DealAmount amount2 = new DealAmount(10);
        
        assertTrue(amount.equals(amount2));
    }
    @Test
    public void test_違う値を比較してFalseとなること() {
        DealAmount amount = new DealAmount(10);
        DealAmount amount2 = new DealAmount(200);
        
        assertFalse(amount.equals(amount2));
    }
    @Test
    public void test_違う値オブジェクトで比較してFalseとなること() {
        DealAmount amount = new DealAmount(10);
        DealDate otherType = new DealDate("20190101");
        
        assertFalse(amount.equals(otherType));
    }
}