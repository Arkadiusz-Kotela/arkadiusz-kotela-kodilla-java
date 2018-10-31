package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

import static org.junit.Assert.*;

public class SalaryAdapterTest {
    @Test
    public void testTotalSalary() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter adapter = new SalaryAdapter();

        //When
        double totalSalary = adapter.TotalSalary(workers.getWorkesrs(), workers.getSalaries());

        //Then
        System.out.println(totalSalary);
        assertEquals(20000, totalSalary, 0);
    }
}