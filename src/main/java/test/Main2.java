package test;


import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import javax.enterprise.util.TypeLiteral;

public class Main2 {
    public static void main(String[] args) {

        Weld weld = new Weld();

        WeldContainer wc = weld.initialize();

        System.out.println(wc.select(new TypeLiteral<Hello<String>>() {
        }).get().hello());

        wc.shutdown();

    }
}
