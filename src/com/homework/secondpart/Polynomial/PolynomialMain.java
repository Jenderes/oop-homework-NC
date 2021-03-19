package com.homework.secondpart.Polynomial;

public class PolynomialMain {
    public static void main(String[] args) {
        System.out.println("\n======== Class MyPolynomial ========");
        MyPolynomial polynomialFirst = new MyPolynomial(1,2,3,4,5);
        MyPolynomial polynomialSecond = new MyPolynomial(5,4,3,2);
        System.out.println("Degree = " + polynomialFirst.getDegree());
        System.out.println("evaluate = " + polynomialFirst.evaluate(3));
        System.out.println("add = " + polynomialFirst.add(polynomialSecond).toString());
        System.out.println("multiply = " + polynomialFirst.multiply(polynomialSecond).toString());
    }
}
