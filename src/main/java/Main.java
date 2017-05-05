import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import service.EquityService;
import service.PortfolioService;
import test.Main2;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("hello");
        weld();

    }

    public static void weld() throws Exception{
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        EquityService equityService = container.instance().select(EquityService.class).get();

        PortfolioService portfolioService = container.instance().select(PortfolioService.class).get();

        portfolioService.loadEquitys(equityService.equity("/home/szilard/codecool/JAVA/advanced/bookshop/src/main/resources/Untitled3.csv"), equityService.equity("/home/szilard/codecool/JAVA/advanced/bookshop/src/main/resources/Untitled2.csv"));

        portfolioService.sortPortfolio();

        weld.shutdown();
    }
}
