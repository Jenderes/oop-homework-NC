package com.homework.secondpart.Ball;

import com.homework.secondpart.Ball.Ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 - height;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public boolean collides(Ball ball){
        double correctPositionX = ball.getX()+ball.getRadius();
        double correctPositionY = ball.getY()+ball.getRadius();
        return correctPositionX <= x2 && correctPositionX >= x1 && correctPositionY >= y2 && correctPositionY <= y1;
    }

    @Override
    public String toString() {
        return "Ball[("+ this.x1+" ,"+ this.y2+"), ("+ this.x2+" ,"+ this.y2+")]";
    }
}

