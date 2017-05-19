package ejb;

import model.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//@Stateless
public class BookEjb {

    @PersistenceContext(unitName = "chapter06PU")
    private EntityManager em;

    public void createBook() {

// Creates an instance of book
     //   Book book = new Book("H2G2", "The Hitchhiker's Guide to the Galaxy", 12.5F,"1-84023-742-2", 354, false);

// Persists the book to the database
//        em.persist(book);
    }
}
