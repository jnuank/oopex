package domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;


public class DealRecordsTest {
    DealRecords accountBook = new DealRecords();

    @Before
    public void setup(){
        var date = new DealDate("20190127");
        var amount = new DealAmount(1000);
        var category = new DealCategory("食費");

        var deal1 = new Deal(date, amount, category);

        accountBook.register(deal1);

        var date2 = new DealDate("20190128");
        var amount2 = new DealAmount(2500);
        var category2 = new DealCategory("交際費");

        var deal2 = new Deal(date2, amount2, category2);

        accountBook.register(deal2);

        var deal3 = new Deal(new DealDate("20190201"), 
                            new DealAmount(3000),
                            new DealCategory("食費"));

        accountBook.register(deal3);

    }

    @Test
    public void testAllSummary() {
        var rule = new SummaryNone();
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(6500, totalAmount);
    }

    @Test
    public void testCategorySummary(){
        var category = new DealCategory("食費");
        var rule = new SummaryCategory(category);
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(4000, totalAmount);
    }
    @Test
    public void testCategorySummary2(){
        var category = new DealCategory("交際費");
        var rule = new SummaryCategory(category);
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(2500, totalAmount);
    }
    @Test
    public void testMonthSummary(){
        // いまのところ月だけで取得するインターフェースを用意していない
        var month = new DealDate("20190101");
        var rule = new SummaryMonth(month);
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(3500, totalAmount);
    }
    @Test
    public void testMonthSummary2(){
        // いまのところ月だけで取得するインターフェースを用意していない
        var month = new DealDate("20190201");
        var rule = new SummaryMonth(month);
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(3000, totalAmount);
    }
    @Test
    public void testMonthSummary3(){
        // いまのところ月だけで取得するインターフェースを用意していない
        var month = new DealDate("20180101");
        var rule = new SummaryMonth(month);
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(0, totalAmount);
    }

}
