package test;

import javax.enterprise.inject.Default;
import javax.enterprise.util.TypeLiteral;

@Default
public class HelloClass <T extends Comparable<T>> implements Hello<String> {

    public String hello(){

        System.out.println("T method runs");
        return null;
    }
}
