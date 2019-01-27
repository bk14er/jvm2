package pl.sda.jvm.solutions.book;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class BookCollections {

    private final List<Book> books;

    public BookCollections(List<Book> books) {
        this.books = books;
    }

    public void add(Book book){
        books.add(book);
    }


    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public Optional<Book> findBookByTitle(final String title){
        return books.stream()
                .filter(p->p.getTitle()
                .equals(title))
                .findFirst();

    }

    public void printAllBooks(){
        books.forEach(b -> System.out.println(b));
    }

}
