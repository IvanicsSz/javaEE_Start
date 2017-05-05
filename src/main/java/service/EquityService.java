package service;

import jdk.nashorn.internal.runtime.logging.Logger;
import model.EquityModel;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class EquityService {

    @Inject
    @CsvRead
    private CsvReader csvReader;

    @Inject
    StringToDate stringToDate;

    @Inject
    EntityProducer entityProducer;

    @Inject
    private java.util.logging.Logger logger;

    private List<String> csvResult;

    public EquityService() {
    }

    public EquityService(CsvReader csvReader)  {
        this.csvReader = csvReader;
    }

    public List<EquityModel> equity(String csvPath) throws Exception{
        csvResult = csvReader.reader(csvPath);
        List<EquityModel> result = new ArrayList<>();

        for (int i = 1; i < csvResult.size(); i++) {
            if (i%2 == 1) {
                EquityModel equityModel = entityProducer.em();
                equityModel.setPl(Double.parseDouble(csvResult.get(i)));
                equityModel.setDate(stringToDate.stringToDate(csvResult.get(i-1)));
                System.out.println("equityModel = " + equityModel);
                result.add(equityModel);
            }


        }
        logger.info("Equity from csv: " + result);
        return result;
    }

}
