package com.homework.secondpart.ComplexNumber;

import com.homework.firstpart.Employee.Employee;

public class ComplexMain {
    public static void main(String[] args) {
        System.out.println("======== Class MyComplex ========");
        MyComplex complexFirst = new MyComplex(1,2);
        MyComplex complexSecond = new MyComplex(1,2);
        System.out.println("complexFirst = " + complexFirst.toString() + ", complexSecond = " + complexSecond.toString());
        System.out.println("equals = " + complexFirst.equals(complexSecond));
        System.out.println("magnitude = " + complexFirst.magnitude());
        System.out.println("argument = " + complexFirst.argument());
        System.out.println("addNew = " + complexFirst.addNew(complexSecond).toString());
        System.out.println("subtractNew = " + complexFirst.subtractNew(complexSecond).toString());
        System.out.println("multiply = " + complexFirst.multiply(complexSecond).toString());
        System.out.println("divide = " + complexFirst.divide(complexSecond).toString());
        System.out.println("conjugate = " + complexFirst.conjugate().toString());
    }
}
