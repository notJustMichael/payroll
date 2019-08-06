package com.notjustmichael.Repository;

import com.notjustmichael.Domain.User.Employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeRepositoryImpl implements EmployeeRepository {

    private ArrayList<Employee> employeeDB;
    private static EmployeeRepositoryImpl employeeRepository = null;
    private EmployeeRepositoryImpl(){
        employeeDB = new ArrayList<>();
    }

    public static EmployeeRepositoryImpl getEmployeeRepositoryImpl(){
        if (employeeRepository == null) {
            employeeRepository = new EmployeeRepositoryImpl();
        }
        return null;
    }

    @Override
    public Employee create(Employee employee) {
        employeeDB.add(employee);
        return employee;
    }

    @Override
    public Employee read(String s) {
        Employee emp5 = null;
        for (Employee emp:employeeDB) {
            if(emp.getEmpId().equalsIgnoreCase(s))            {
                emp5 = emp;
            }
        }
        return emp5;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public void delete(String s) {

    }
}


