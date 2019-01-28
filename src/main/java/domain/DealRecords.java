package domain;

import java.util.*;

/**
 * 取引履歴
 */
public class DealRecords {
    private List<Deal> values;

    public DealRecords(){
        this.values = new ArrayList<Deal>();
    }

    public void register(Deal deal){
        this.values.add(deal);
    }

    /**
     * 
     * @param spec : 集計ルール
     * @return : 集計した取引金額
     */
    public int getTotalAmount(ISummarySpec spec){
        var filterdDealRecords = spec.fileter(this.values);
        var test2 = filterdDealRecords.mapToInt(deal -> deal.getDealAmount().getValue());

        return test2.sum();
    }

} 