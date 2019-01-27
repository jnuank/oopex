package domain;

public class DealCategory{
    private String value;

    public DealCategory(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;

        return this.getValue() == ((DealCategory) obj).getValue();
    }
}