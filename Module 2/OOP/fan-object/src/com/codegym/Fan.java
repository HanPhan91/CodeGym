package com.codegym;

public class Fan {
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = slow;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0 || speed > 3)
            System.out.println("Enter speed 1-3");
        else
            this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean getOn() {
        return on = true;
    }

    public String toString() {
        if (on) {
            return speed + " " + color + " " + radius + " fan is on";
        } else
            return "fan is off";
    }
}
