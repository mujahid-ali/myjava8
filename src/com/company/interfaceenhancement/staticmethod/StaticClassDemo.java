package com.company.interfaceenhancement.staticmethod;

public class StaticClassDemo implements StaticMethodDemo {

    public static void demoMethod1() {
        System.out.println("This is demoMethod1 from  StaticClassDemo ");
    }
    public static void main(String[] args) {

        StaticClassDemo obj1 = new StaticClassDemo();
        obj1.demoMethod1();
        System.out.println("Static method can be called using interface name.  ");
        StaticMethodDemo.demoMethod1();
        StaticMethodDemo.demoMethod2();
    }

}
