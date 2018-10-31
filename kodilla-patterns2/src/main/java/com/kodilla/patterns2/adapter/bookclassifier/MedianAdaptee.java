package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookStatistic;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.Statistic;

import java.util.Map;

public class MedianAdaptee implements BookStatistic {
    private Statistic statistic;

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return statistic.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        return statistic.medianPublicationYear(books);
    }
}
