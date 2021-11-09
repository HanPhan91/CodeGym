package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(6);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.getOn();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
