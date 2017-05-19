package AdvancedJava.ConstructorPatterns.factory;

public class Book {

    private Book (final String bookTitle){}

    public static Book newBook(final String title){
        return new Book(title);
    }
}
