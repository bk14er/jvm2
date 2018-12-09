package pl.sda.jvm.solutions.book;

import java.util.ArrayList;
import java.util.List;

public final class BookCollections {

    private final List<Book> books;

    public BookCollections(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public Book findBookByTitle(final String title){
        return books.stream()
                .filter(p->p.getTitle()
                .equals(title))
                .findFirst().get();

    }

    public void printAllBooks(){
        books.forEach(b -> System.out.println(b));
    }

}
