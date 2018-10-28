package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessSearchEngine {
    private static final Logger LOGGER = LoggerFactory.getLogger(BusinessSearchEngine.class);

    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    @Autowired
    public BusinessSearchEngine(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void addCompany(Company company) {
        companyDao.save(company);
    }

    public void addEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    public void searchEmployeeByName(final String expression) throws QueryNotFoundException {
        boolean wasError = false;
        List<Employee> employees = employeeDao.retrieveEmployeeByGivenString(expression);
        LOGGER.info("Searching for employee by given name");
        try {
            if (employees.size() == 0) {
                wasError = true;
                LOGGER.error(QueryNotFoundException.ERR_EMPLOYEE_NOT_FOUND);
                throw new QueryNotFoundException(QueryNotFoundException.ERR_EMPLOYEE_NOT_FOUND);
            } else {
                System.out.println("Employee found by given name: ");
                for (Employee employee : employees) {
                    System.out.println("ID: " + employee.getId() + ", " + employee.getFirstName() + ", " + employee.getLastName());
                }
            }
        } finally {
            if (wasError){
                LOGGER.info("Unsuccessful search");
            }

        }
    }

    public void searchCompanyByName(String expression) throws QueryNotFoundException {
        boolean wasError = false;
        List<Company> companies = companyDao.retrieveCompanyByGivenString(expression);
        LOGGER.info("Searching for company by given name");
        try {
            if (companies.size() == 0) {
                wasError = true;
                LOGGER.error(QueryNotFoundException.ERR_COMPANY_NOT_FOUND);
                throw new QueryNotFoundException(QueryNotFoundException.ERR_COMPANY_NOT_FOUND);
            } else {
                System.out.println("Company found by given name: ");
                for (Company company : companies) {
                    System.out.println("ID: " + company.getId() + ", " + company.getName());
                }
            }
        } finally {
            if (wasError) {
                LOGGER.info("Unsuccessful search");
            }
        }
    }


}
