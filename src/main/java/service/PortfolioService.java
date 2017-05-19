package service;

import model.EquityModel;
import service.sorting.Sort;
import service.sorting.SortType;
import service.sorting.Sorting;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class PortfolioService {


    @Inject
    @Sort(type = SortType.QUICK_SORT)
    private Instance<Sorting<EquityModel>> sorting;

    @Inject
    private java.util.logging.Logger logger;

    @Inject
    private EquityService equityService;


    private List<EquityModel> portfolio = new ArrayList<>();

    //@Afterproperties set
    public PortfolioService() {
    }


    public void loadEquitys(List<EquityModel>... equity) {
        for (int i = 0; i < equity.length; i++) {
            portfolio.addAll(equity[i]);
        }
        logger.info("Equities: " + portfolio);


    }


    public List<EquityModel> sortPortfolio(){
        logger.info("Portfolio: " + portfolio);
        logger.info("Sorted List: " + sorting.get().sort(portfolio));
        return sorting.get().sort(portfolio);
    }


    public List<EquityModel> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(List<EquityModel> portfolio) {
        this.portfolio = portfolio;
    }
}

