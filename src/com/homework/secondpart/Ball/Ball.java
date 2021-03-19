package com.homework.secondpart.Ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float)(speed*Math.cos(direction));
        this.yDelta = (float)(-speed*Math.sin(direction));
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        this.x += xDelta;
        this.y += yDelta;
    }

    public void reflectionHorizontal(){
        this.xDelta = -xDelta;
    }
    public void reflectionVertical(){
        this.yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[("+ this.x+" ,"+ this.y+"), speed =("+ this.yDelta+" ,"+ this.yDelta+")]";
    }
}
