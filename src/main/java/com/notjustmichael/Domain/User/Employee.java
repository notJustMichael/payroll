package com.notjustmichael.Domain.User;

public class Employee {

    String empId;
    String empName;
    String empLastName;

    public String getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    private Employee(){}

    public Employee(EmployeeBuilder empbuilder) {
        this.empId = empbuilder.empId;
        this.empName = empbuilder.empName;
        this.empLastName = empbuilder.empLastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", empLastName='" + empLastName + '\'' +
                '}';
    }

    public static class EmployeeBuilder{
        private String empId, empName, empLastName;

        public EmployeeBuilder empId(String empId) {
            this.empName = empId;
            return this;
        }

        public EmployeeBuilder empName(String empName) {
            this.empName = empName;
            return this;
        }

        public EmployeeBuilder empLastName(String empLastName) {
            this.empLastName = empLastName;
            return this;
        }

        public EmployeeBuilder copy (Employee employee){
            this.empId = employee.empId;
            this.empName = employee.empName;
            this.empLastName = employee.empLastName;
            return this;
        }

        public Employee build (){
            return new Employee(this);
        }


    }




}
