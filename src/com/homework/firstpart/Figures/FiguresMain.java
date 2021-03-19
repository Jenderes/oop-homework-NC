package com.homework.firstpart.Figures;

public class FiguresMain {
    public static void main(String[] args) {
        System.out.println("======== Class Circle ========");
        Circle circle = new Circle(12,"yellow");
        circle.setColor("green");
        circle.setRadius(15);
        System.out.println(circle.toString()+ " Area = " + circle.getArea());

        System.out.println("======== Class Rectangle ========");
        Rectangle rectangle = new Rectangle(12,15);
        rectangle.setWidth(13);
        System.out.print(rectangle.toString());
        System.out.println(" Area = "+ rectangle.getArea() + " ,Perimeter = "+ rectangle.getPerimeter());

        System.out.println("======== Class MyTriangle ========");
        MyPoint point1 = new MyPoint(-4,-2);
        MyPoint point2 = new MyPoint(-4,4);
        MyPoint point3 = new MyPoint(0,1);
        MyTriangle triangle = new MyTriangle(point1, point2, point3);
        System.out.println("distance point = " + point1.distance(point2));
        System.out.println("Perimeter = " + triangle.getPerimeter() + ", Type = " + triangle.getType().getTitle());
    }
}
