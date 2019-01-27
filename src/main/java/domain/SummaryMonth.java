package domain;

import java.util.List;
import java.util.stream.Stream;

public class SummaryMonth implements ISummarySpec {
    private DealDate rule;

    public SummaryMonth(DealDate fileterRule)
    {
        this.rule = fileterRule;
    }

    @Override
    public Stream<Deal> fileter(List<Deal> records) {
        return records.stream().filter(deal -> deal.getDate().equalsMonth(rule));
    }


}