package com.homework.firstpart.Figures;

import com.homework.firstpart.Figures.MyPoint;

import java.util.Arrays;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1 = new MyPoint(x1,y1);
        this.v2 = new MyPoint(x2,y2);
        this.v3 = new MyPoint(x3,y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public double getPerimeter(){
        double distanceAB = this.v1.distance(this.v2);
        double distanceBC = this.v2.distance(this.v3);
        double distanceCA = this.v3.distance(this.v1);
        return distanceAB+distanceBC+distanceCA;
    }

    public Type getType(){
        double distanceAB = this.v1.distance(this.v2);
        double distanceBC = this.v2.distance(this.v3);
        double distanceCA = this.v3.distance(this.v1);
        if (distanceAB == distanceBC && distanceBC  == distanceCA){
            return Type.EQUILATERAL;
        } else if (distanceAB == distanceBC || distanceBC  == distanceCA || distanceAB == distanceCA) {
            return Type.ISOSCELES;
        } else {
            return Type.SCALENE;
        }
    }

    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + Arrays.toString(v1.getXY()) +
                ", v2=" + Arrays.toString(v2.getXY()) +
                ", v3=" + Arrays.toString(v3.getXY()) +
                '}';
    }
}
