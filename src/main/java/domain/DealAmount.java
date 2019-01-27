package domain;

public class DealAmount {
    private int value;

    public DealAmount(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;

        return this.getValue() == ((DealAmount) obj).getValue();
    }

}