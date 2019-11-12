package com.ManyToMany;

import com.Main;
import com.ManyToMany.entity.Company;
import com.ManyToMany.entity.CompanyEmployee;
import com.ManyToMany.entity.Employee;
import com.ManyToMany.service.CompanyEmployeeService;
import com.ManyToMany.service.CompanyService;
import com.ManyToMany.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Main.class)
public class Tests {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private CompanyService companyService;
    @Autowired
    private CompanyEmployeeService companyEmployeeService;

    @Test //prints all employees with the names of the companies to which they relate
    public void test() {
        List<Employee> employees = employeeService.getAll();
        employees.forEach(e -> System.out.println(
                String.format("{id: %s, name: %s, companies: %s}" ,
                        e.getId(),
                        e.getName(),
                        e.getCompanies().stream().map(s -> String.format("{name: %s}",
                                s.getName())).collect(Collectors.toList()))));
    }

    @Test //prints all companies with employees to which they relate
    public void test2() {
        List<Company> companies = companyService.getAll();
        companies.forEach(System.out::println);
    }

    @Test
    public void test3() {
        List<Company> companies = companyService.getAll();
        System.out.println("List before creating relationship: " + companies);

        Company company = companyService.getByName("Cat");
        Employee employee = employeeService.getByName("Jack");
        companyEmployeeService.create(new CompanyEmployee(company.getId(),employee.getId()));

        List<Company> companies2 = companyService.getAll();
        System.out.println("List after creating relationship: " + companies2);

        companyEmployeeService.delete(company.getId(),employee.getId());

        List<Company> companies3 = companyService.getAll();
        System.out.println("List after deleting relationship: " + companies3);
    }
}
