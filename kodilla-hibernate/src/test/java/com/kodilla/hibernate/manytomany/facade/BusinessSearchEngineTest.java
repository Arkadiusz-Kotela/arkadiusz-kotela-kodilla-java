package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessSearchEngineTest {

    @Autowired
    private BusinessSearchEngine engine;

    @Test
    public void testSearchEmployeeByName() {
        engine.addEmployee(new Employee("First", "Kononowicz"));
        engine.addEmployee(new Employee("Second", "Walasiewicz"));
        engine.addEmployee(new Employee("Third", "Nowak"));

        try {
            engine.searchEmployeeByName("wicz");
        } catch (QueryNotFoundException e) {
            //
        }
    }

    @Test
    public void testSearchCompanyByName() {
        engine.addCompany(new Company("Brain Storm"));
        engine.addCompany(new Company("Heart Storm"));
        engine.addCompany(new Company("Train Horn"));

        try {
            engine.searchCompanyByName("orn");
        } catch (QueryNotFoundException e) {
            //
        }
    }
}