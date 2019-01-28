package domain;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DealRecordsTest {
    DealRecords accountBook = new DealRecords();

    @Before
    public void setup() {
        // お小遣い帳にデータを登録しておく
        var date = new DealDate("20190127");
        var amount = new DealAmount(1000);
        var category = new DealCategory("食費");
        var deal1 = new Deal(date, amount, category);

        // 2019-01-27 食費 ¥1000
        accountBook.register(deal1);

        var date2 = new DealDate("20190128");
        var amount2 = new DealAmount(2500);
        var category2 = new DealCategory("交際費");
        var deal2 = new Deal(date2, amount2, category2);

        // 2019-01-28 交際費 ¥2500
        accountBook.register(deal2);

        var deal3 = new Deal(new DealDate("20190201"), new DealAmount(3000), new DealCategory("食費"));

        // 2019-02-01 食費 ¥3000
        accountBook.register(deal3);
    }

    @Test
    public void test_全部の金額を合計する() {
        var rule = new SummaryNoneSpec();
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(6500, totalAmount);
    }

    @Test
    public void test_食費カテゴリで集計できること() {
        var category = new DealCategory("食費");
        var rule = new SummaryCategorySpec(category);
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(4000, totalAmount);
    }

    @Test
    public void test_交際費カテゴリで集計できること() {
        var category = new DealCategory("交際費");
        var rule = new SummaryCategorySpec(category);
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(2500, totalAmount);
    }

    @Test
    public void test_2019年1月で集計できること() {
        // いまのところ月だけで取得するインターフェースを用意していない
        var month = new DealDate("20190101");
        var rule = new SummaryMonthSpec(month);
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(3500, totalAmount);
    }

    @Test
    public void test_2019年2月で集計できること() {
        // いまのところ月だけで取得するインターフェースを用意していない
        var month = new DealDate("20190201");
        var rule = new SummaryMonthSpec(month);
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(3000, totalAmount);
    }

    @Test
    public void test_2018年1月で集計して0円であること() {
        // いまのところ月だけで取得するインターフェースを用意していない
        var month = new DealDate("20180101");
        var rule = new SummaryMonthSpec(month);
        int totalAmount = accountBook.getTotalAmount(rule);

        assertEquals(0, totalAmount);
    }
}
