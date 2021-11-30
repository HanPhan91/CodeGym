package com.codegym;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void getSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] Speed(){
        float[] array= {xSpeed,ySpeed};
        return array;
    }

    @Override
    public String toString() {
        return "MoveablePoint: ("+ super.getX() + ", "
                + super.getY() + ", "
                + "speed= ("+ getxSpeed() + ", "+ getySpeed()+ " )";
    }
    public MoveablePoint move(){
        super.setX(super.getX()+ xSpeed);
        super.setX(super.getY()+ ySpeed);
        return this;
    }
}
