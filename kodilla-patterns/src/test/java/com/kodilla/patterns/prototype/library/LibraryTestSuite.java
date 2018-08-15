package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Library");
        IntStream.iterate(1, n -> n+1)
                .limit(5)
                .forEach(n -> library.getBooks()
                        .add(new Book(
                                "Book" + n,
                                "Author " + n,
                                LocalDate.now())));

        //When
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Shallowly cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deeply cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        System.out.println(library.getName());
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }

        System.out.println(clonedLibrary.getName());
        for (Book book : clonedLibrary.getBooks()) {
            System.out.println(book);
        }
        System.out.println(deepClonedLibrary.getName());
        for (Book book : deepClonedLibrary.getBooks()) {
            System.out.println(book);
        }

        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());

    }
}
