package ru.danilsibgatyllin.structural.composite;

import java.util.ArrayList;

public class WorkHR {
    public static void main(String[] args) {
        Employee jon =new Designer("Jon",2000f);
        Employee din = new Developer("Din",2500f);

        Organization org =new Organization(new ArrayList<>());

        org.addEmployeeToOrganization(jon);
        org.addEmployeeToOrganization(din);

        org.seeAllEmployee();
    }
}
