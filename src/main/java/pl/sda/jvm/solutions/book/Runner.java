package pl.sda.jvm.solutions.book;

import java.math.BigDecimal;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args){


        Price p1 = new Price(BigDecimal.TEN,Currency.EUR);
        Book b1 = new Book(1l,"test1","test2",p1);
        Book b2 = new Book(2l,"test3","test3",p1);

        BookCollections bookCollections =new BookCollections(Arrays.asList(b1,b2));

        bookCollections.printAllBooks();

    }

}
