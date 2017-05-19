package controller;

import model.EquityModel;
import service.EquityService;
import service.PortfolioService;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.util.List;

@Path("/book")
//@Stateless
public class EquityRestService {

    @Context
    private UriInfo uriInfo;

    @Inject
    EquityService equityService;

    @Inject
    PortfolioService portfolioService;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<EquityModel> book() throws Exception {

        portfolioService.loadEquitys(equityService.equity("/home/szilard/codecool/JAVA/advanced/bookshop/src/main/resources/Untitled3.csv"), equityService.equity("/home/szilard/codecool/JAVA/advanced/bookshop/src/main/resources/Untitled2.csv"));
        return portfolioService.sortPortfolio();
    }
}