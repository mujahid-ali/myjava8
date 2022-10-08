package com.company.interfaceenhancement.doublecolonoperator;

public class Employee {

    public  Employee() {
        System.out.println("Employee default constructor");
    }

    public void details() {
        System.out.println("Showing employee details");
    }

    public void details2(int number) {
        System.out.println("Employee details2 with number = " + number);
    }

    public static void detailsStatic(int number) {
        System.out.println("Employee static details with 1 param = " + number);
    }
}
