package model;

import lombok.Data;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Data
@Entity
@XmlRootElement
@NamedQuery(name = Book.FIND_ALL, query = "SELECT b FROM Book b")
public class Book {

    public static final String FIND_ALL = "Book.findAll";

    @Id
    @GeneratedValue
    private String id;
    private Date date;
    private Double pl;
    private Double equity;
    private int contract;


}
