package service;


import model.EquityModel;

import javax.enterprise.inject.Produces;

public class EntityProducer {

    @Produces
    public EquityModel em(){
        return new EquityModel();
    }
}
