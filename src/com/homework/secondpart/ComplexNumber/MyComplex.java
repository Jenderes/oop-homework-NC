package com.homework.secondpart.ComplexNumber;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (real == 0 || real == 0 && imag == 0){
            return "(0)";
        } else if(imag == 0) {
            return "(" + real + ")";
        } else {
            return "(" + real + "+" + imag + "i)";
        }
    }

    public boolean isReal(){
        return this.real != 0;
    }

    public boolean isImaginary(){
        return this.imag != 0;
    }

    public boolean equals(double real, double imag){
        return (this.real == real) && (this.imag == imag);
    }

    public boolean equals(MyComplex complex){
        return (this.real == complex.getReal()) && (this.imag == complex.getImag());
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(this.real,2)+Math.pow(this.imag,2));
    }

    public double argument(){
        if (this.real >= 0){
            return Math.atan(this.imag/this.real);
        }
        if (this.real < 0){
            if (this.imag < 0){
                return Math.atan(this.imag/this.real) - Math.PI;
            }
            return Math.PI - Math.atan(this.imag/this.real);
        }
        return 0;
    }
    public MyComplex add(MyComplex right){
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }
    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real+right.getReal(), this.imag+right.getImag());
    }
    public MyComplex subtract(MyComplex right){
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }
    public MyComplex subtractNew(MyComplex right){
        return new MyComplex(this.real-right.getReal(), this.imag-right.getImag());
    }
    public MyComplex multiply(MyComplex right){
        this.real = (this.real*right.getReal())-(this.imag*right.getImag());
        this.imag = (this.real*right.getImag())+(right.getReal()*this.imag);
        return this;
    }
    public MyComplex divide(MyComplex right){
        double divide = Math.pow(right.getReal(),2)+Math.pow(right.getImag(),2);
        this.real = (this.real*right.getReal())+(this.imag*right.getImag())/divide;
        this.imag = (this.real*right.getImag())-(right.getReal()*this.imag)/divide;
        return this;
    }
    public MyComplex conjugate(){
        return new MyComplex(this.real,-this.imag);
    }
}
