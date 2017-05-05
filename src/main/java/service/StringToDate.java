package service;

import javax.enterprise.context.ApplicationScoped;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@ApplicationScoped
public class StringToDate {

    private static final String DEFAULT_FORMAT = "yyyy-MM-dd";

    public StringToDate() {
    }

    public Date stringToDate(String s) {

        Date date = null;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DEFAULT_FORMAT);
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException ex) {
            System.out.println("Parse exception");
        }
        return date;
    }
}
