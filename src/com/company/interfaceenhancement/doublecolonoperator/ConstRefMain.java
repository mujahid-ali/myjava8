package com.company.interfaceenhancement.doublecolonoperator;

public class ConstRefMain {
    public static void main(String[] args) {

        ConstrRefFuncInterface constrRefFuncInterface = () -> new Employee();

        constrRefFuncInterface.getEmployee();

        // using double colon ::

        ConstrRefFuncInterface constrRefFuncInterface1 = Employee::new;
        constrRefFuncInterface1.getEmployee();
    }
}
