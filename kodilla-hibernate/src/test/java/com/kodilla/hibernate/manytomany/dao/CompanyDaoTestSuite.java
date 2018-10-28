package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import jdk.nashorn.internal.runtime.regexp.RegExp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.beans.Expression;
import java.util.List;
import java.util.regex.Pattern;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

//        //CleanUp
//        try {
//            companyDao.delete(softwareMachineId);
//            companyDao.delete(dataMaestersId);
//            companyDao.delete(greyMatterId);
//        } catch (Exception e) {
//            //do nothing
//        }
    }

    @Test
    public void testNamedQueries() {
        //Given
        Employee janekK = new Employee("Jan", "Kowalski");
        Employee adamK = new Employee("Adam", "Kowalski");
        Employee zenekN = new Employee("Zenon", "Nowak");

        employeeDao.save(janekK);
        employeeDao.save(adamK);
        employeeDao.save(zenekN);

        //When
        List<Employee> employeeListByGivenName = employeeDao.retrieveNamesByGivenName("Kowalski");

        //Then
        Assert.assertEquals(2, employeeListByGivenName.size());

        //CleanUp
        employeeDao.delete(janekK);
        employeeDao.delete(adamK);
        employeeDao.delete(zenekN);
    }

    @Test
    public void testNativeQuery() {
        //Given
        Company company1 = new Company("Version_1");
        Company company2 = new Company("Version_2");
        Company company3 = new Company("New Company");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List<Company> companyListNameStartsWith = companyDao.retrieveCompanyByGivenFirstThreeLetters("Ver");

        //Then
        Assert.assertEquals(2, companyListNameStartsWith.size());

        //CleanUp
        companyDao.delete(company3);
        companyDao.delete(company2);
        companyDao.delete(company1);
    }

    @Test
    public void testSearchEmployeeUsingNativeQuery() {
        //Given
        Employee janekK = new Employee("Jan", "Kowalski");
        Employee adamK = new Employee("Adam", "Kowalski");
        Employee zenekN = new Employee("Zenon", "Nowak");

        employeeDao.save(janekK);
        employeeDao.save(adamK);
        employeeDao.save(zenekN);

        //When
        List<Employee> employees = employeeDao.retrieveEmployeeByGivenString("owak");

        //Then
        Assert.assertEquals(1, employees.size());

        //CleanUp
        employeeDao.delete(janekK);
        employeeDao.delete(adamK);
        employeeDao.delete(zenekN);
    }

    @Test
    public void testSearchCompanyUsingNativeQuery() {
        //Given
        Company company1 = new Company("Version_1");
        Company company2 = new Company("Version_2");
        Company company3 = new Company("New Company");

        companyDao.save(company1);
        companyDao.save(company2);
        companyDao.save(company3);

        //When
        List<Company> companies = companyDao.retrieveCompanyByGivenString("ersi");

        //Then
        Assert.assertEquals(2, companies.size());

        //CleanUp
        companyDao.delete(company1);
        companyDao.delete(company2);
        companyDao.delete(company3);

    }

}