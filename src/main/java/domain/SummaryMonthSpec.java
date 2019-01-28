package domain;

import java.util.List;
import java.util.stream.Stream;

/**
 * 月別集計仕様
 */
public class SummaryMonthSpec implements ISummarySpec {
    private DealDate rule;

    public SummaryMonthSpec(DealDate fileterRule) {
        this.rule = fileterRule;
    }

    @Override
    public Stream<Deal> fileter(List<Deal> records) {
        return records.stream().filter(deal -> deal.getDate().equalsMonth(rule));
    }

}