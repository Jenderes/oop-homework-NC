package com.homework.secondpart.Polynomial;

public class MyPolynomial {
    private final double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public double evaluate(double x) {
        double p = 0;
        for (double coeff : this.coeffs) {
            p = coeff + (x * p);
        }
        return p;
    }

    public MyPolynomial add(MyPolynomial polynomial) {
        double[] coeffsSecond = polynomial.getCoeffs();
        double[] returnCoeffs;
        if (coeffsSecond.length > this.coeffs.length) {
            returnCoeffs = coeffsSecond.clone();
            for (int i = 0; i < this.coeffs.length; i++) {
                returnCoeffs[i] += this.coeffs[i];
            }
        } else {
            returnCoeffs = this.coeffs.clone();
            for (int i = 0; i < coeffsSecond.length; i++) {
                returnCoeffs[i] += coeffsSecond[i];
            }
        }
        return new MyPolynomial(returnCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial polynomial) {
        double[] coeffsSecond = polynomial.getCoeffs();
        double[] returnCoeffs = new double[coeffsSecond.length+this.coeffs.length-1];
        for (int i = 0; i < coeffsSecond.length; i++){
            for (int j = 0; j < this.coeffs.length; j++){
                returnCoeffs[i+j] += coeffsSecond[i]*this.coeffs[i];
            }
        }
        return new MyPolynomial(returnCoeffs);
    }

    @Override
    public String toString() {
        String stringPolynomial = this.coeffs[this.coeffs.length-1] + "x^" + (this.coeffs.length-1);
        for (int i = this.coeffs.length-2; i >= 0; i--) {
            if (coeffs[i] != 0){
                if (this.coeffs[i] > 0){
                        stringPolynomial = stringPolynomial +" + "+ this.coeffs[ i ];
                } else {
                    stringPolynomial = stringPolynomial + " - " + -this.coeffs[ i ];
                }
                if (i == 1){
                    stringPolynomial = stringPolynomial + "x";
                } else if (i > 1){
                    stringPolynomial = stringPolynomial + "x^" + i;
                }
            }
        }
        return stringPolynomial;
    }
}
