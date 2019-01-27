package domain;

import java.util.List;
import java.util.stream.Stream;

public class SummaryCategory implements ISummarySpec {
    private DealCategory rule;
    
    public SummaryCategory(DealCategory fileterRule)
    {
        this.rule = fileterRule;
    }
    @Override
    public Stream<Deal> fileter(List<Deal> records) {
        return records.stream().filter(deal -> deal.getCategory().equals(rule));
     
    }

}