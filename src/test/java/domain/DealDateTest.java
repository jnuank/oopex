package domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;


public class DealDateTest {
    @Test
    public void testGetValue() {
        DealDate date = new DealDate("20190127");
        LocalDate date2 = LocalDate.of(2019, 1, 27);
        
        assertEquals(date2, date.getValue());
    }

    @Test
    public void testEquals(){
        DealDate date = new DealDate("20190127");
        DealDate date2 =new DealDate("20190127");

        assertTrue(date.equals(date2));
    }
}
