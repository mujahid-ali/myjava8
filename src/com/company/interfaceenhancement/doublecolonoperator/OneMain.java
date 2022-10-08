package com.company.interfaceenhancement.doublecolonoperator;

public class OneMain {
    public static void main(String[] args) {

        LambdaOne lambdaOne = () -> System.out.println("from lamda one");
        lambdaOne.show();

        Employee employee = new Employee();

        LambdaOne lambdaOne1 = employee :: details;
        lambdaOne1.show();

        LambdaTwo lambdaTwoStatic = Employee :: detailsStatic;
        lambdaTwoStatic.show2(3);

    }
}
