package com.homework.secondpart.Ball;

public class BallMain {
    public static void main(String[] args) {
        Ball ball = new Ball(10,-10,2,3,4);
        ball.move();
        Container container = new Container(0,0,100,100);
        System.out.println(ball.toString());
        System.out.println("Ball in container = " + container.collides(ball));

        Ball ballSecond = new Ball(10,10,3,4,2);
        ballSecond.move();
        System.out.println(ballSecond.toString());
        System.out.println("Ball in container = " + container.collides(ballSecond));
    }
}
