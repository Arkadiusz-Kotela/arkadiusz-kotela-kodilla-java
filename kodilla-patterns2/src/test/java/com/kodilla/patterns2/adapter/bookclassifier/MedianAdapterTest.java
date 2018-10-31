package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static org.junit.Assert.*;

public class MedianAdapterTest {
    @Test
    public void testPublicationYearMedian() {
        //Given
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        Book book1 = new Book(
                "author1",
                "title1",
                1991,
                "signature1");
        Book book2 = new Book(
                "author2",
                "title2",
                2002,
                "signature2");
        Book book3 = new Book(
                "author3",
                "title3",
                1893,
                "signature3");
        Book book4 = new Book(
                "author4",
                "title4",
                2014,
                "signature5");
        Book book5 = new Book(
                "author5",
                "title5",
                1915,
                "signature5");

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        //When
        System.out.println(books.size());
        for (Object book : books) {
            System.out.println(book + ", ");
        }
        int median = adapter.publicationYearMedian(books);

        //Then
        assertEquals(1991, median);
    }
}