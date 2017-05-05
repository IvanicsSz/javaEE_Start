package model;

import lombok.Data;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import java.util.Date;

@Data
public class EquityModel implements Comparable<EquityModel>{

    private Date date;
    private Double pl;
    private Double equity;
    private int contract;

    public EquityModel() {
    }


    @Override
    public int compareTo(EquityModel em) {
        int compare = date.compareTo(em.getDate());
        if(compare == 0)
            return 0;
        else if(compare == 1)
            return 1;
        else
            return -1;
    }

}
