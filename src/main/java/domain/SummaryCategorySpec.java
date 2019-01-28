package domain;

import java.util.List;
import java.util.stream.Stream;

/**
 * カテゴリ集計仕様
 */
public class SummaryCategorySpec implements ISummarySpec {
    private DealCategory rule;
    
    /**
     * 
     * @param fileterRule : 集計のための条件
     */
    public SummaryCategorySpec(DealCategory fileterRule)
    {
        this.rule = fileterRule;
    }

    @Override
    public Stream<Deal> fileter(List<Deal> records) {
        return records.stream().filter(deal -> deal.getCategory().equals(rule));
    }
}