package domain;

public class Deal{
    private DealDate date;
    private DealAmount amount;
    private DealCategory category;

    public Deal(DealDate date, DealAmount amount, DealCategory category){
        this.date = date;
        this.amount = amount;
        this.category = category;
    }
}