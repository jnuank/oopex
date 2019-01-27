package domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DealDate{
    private LocalDate value;

    public LocalDate getValue(){
        return value;
    }

    public DealDate(LocalDate value){
        this.value = value;
    }

    public DealDate(String yyyymmdd){
        this.value = LocalDate.parse(yyyymmdd, 
                                    DateTimeFormatter.ofPattern("yyyyMMdd"));
    }

    @Override
    public boolean equals(Object obj) {
        if(this.getClass() != obj.getClass()) return false;
        
        return this.value.equals(((DealDate) obj).getValue());
    }
    

}