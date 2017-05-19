package AdvancedJava;

import AdvancedJava.ConstructorPatterns.dependencyInjection.Dependant;
import AdvancedJava.JAXB.JaxbExample;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.text.DateFormat;
import java.util.Date;

public class AdvancedJava {

    public static void main(String[] args) {
        Dependant dependant = new Dependant(DateFormat.getDateInstance());
        Date now = new Date();
        System.out.println(dependant.format(now));

        //JAXB


    }
}
