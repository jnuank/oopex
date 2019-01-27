package domain;

import java.util.*;

public class DealRecords {
    private List<Deal> values;

    public DealRecords(){
        this.values = new ArrayList<Deal>();
    }

    public void register(Deal deal){
        this.values.add(deal);
    }
} 