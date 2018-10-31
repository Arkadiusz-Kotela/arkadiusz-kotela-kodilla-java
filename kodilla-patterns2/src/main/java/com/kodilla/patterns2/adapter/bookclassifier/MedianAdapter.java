package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifiier;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifiier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        if (bookSet.isEmpty()) return 0;

        int[] years = new int[bookSet.size()+1];
        int index = 0;

        Iterator<Book> iterator = bookSet.iterator();

        while ((iterator.hasNext())) {
            years[index] = iterator.next().getPublicationYear();
            index++;
        }

        Arrays.sort(years);
        if (years.length % 2 == 0) {
            return years[(int) (years.length / 2 + 0.5)];
        } else {
            return years[years.length / 2];
        }
    }
}
