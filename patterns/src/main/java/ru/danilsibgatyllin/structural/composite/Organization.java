package ru.danilsibgatyllin.structural.composite;

import java.util.List;

public class Organization {

    private final List<Employee> orgEmployees;

    public Organization(List<Employee> orgEmployees) {
        this.orgEmployees = orgEmployees;
    }

    public void addEmployeeToOrganization(Employee employee){
        orgEmployees.add(employee);
    }

    public void seeAllEmployee(){
        this.orgEmployees.forEach(employee-> System.out.println("Name -"+employee.getName() + " Salary -" + employee.getSalary()));
    }
}
