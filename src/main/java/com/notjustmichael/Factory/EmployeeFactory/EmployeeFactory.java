package com.notjustmichael.Factory.EmployeeFactory;

import com.notjustmichael.Domain.User.Employee;

public class EmployeeFactory {

    public static Employee getEmployee(String id, String name, String lastName){
        return new Employee.EmployeeBuilder()
            .empId(id)
            .empName(name)
            .empLastName(lastName)
            .build();



    }

}
