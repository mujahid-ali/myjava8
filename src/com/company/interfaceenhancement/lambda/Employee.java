package com.company.interfaceenhancement.lambda;

public class Employee implements Comparable<Employee> {

    int employeeNum;
    String employeeName;

    public Employee(int employeeNum, String employeeName) {
        this.employeeNum = employeeNum;
        this.employeeName = employeeName;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.employeeNum == o.employeeNum) {
            return this.employeeName.compareTo(o.employeeName);
        }
        return Integer.compare(this.employeeNum, o.employeeNum);
    }
}
