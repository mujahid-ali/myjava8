package com.company.interfaceenhancement.lambda;

import java.util.Arrays;

public class LambdaMain {


    public static void main(String[] args) {

        Vehicle vehicle = () -> {
            System.out.println("Lambda implementing show method of vehicle. ");
        };

        vehicle.show();

        Calculator calculator = (int a, int b) -> {
            return a + b;
        };

        System.out.println(calculator.add(5,9));

        Employee employee1 = new Employee(11, "Mujahid");
        Employee employee2 = new Employee(3, "Ali");
        Employee employee3 = new Employee(3, "Hamnah");
        Employee employee4 = new Employee(3, "Jasim");
        Employee employee5 = new Employee(100, "Rashid");
        Employee employee6 = new Employee(101, "Rashid");

        Employee[] employees = new Employee[6];

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;

        /*
        Arrays.sort(employees, (Employee e1, Employee e2) -> {
            if (e1.employeeNum == e2.employeeNum) {
                return e1.employeeName.compareTo(e2.employeeName);
            }
            return Integer.compare(e1.employeeNum, e2.employeeNum);
        });
    */
        Arrays.sort(employees);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].employeeNum + "  " + employees[i].employeeName);
        }

        Arrays.sort(employees, (Employee e1, Employee e2) -> {
            if (e1.employeeName.equals(e2.employeeName)) {
                return Integer.compare(e1.employeeNum, e2.employeeNum);
            }
            return e1.employeeName.compareTo(e2.employeeName);
        });

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].employeeNum + "  " + employees[i].employeeName);
        }




    }
}
