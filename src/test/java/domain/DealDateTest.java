package domain;

import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;


public class DealDateTest {
    @Test
    public void test_2019年1月27日のオブジェクトが作成されること() {
        DealDate date = new DealDate("20190127");
        LocalDate date2 = LocalDate.of(2019, 1, 27);
        
        assertEquals(date2, date.getValue());
    }

    @Test
    public void test_同じ日付でイコールとなること(){
        DealDate date = new DealDate("20190127");
        DealDate date2 =new DealDate("20190127");

        assertTrue(date.equals(date2));
    }
}
