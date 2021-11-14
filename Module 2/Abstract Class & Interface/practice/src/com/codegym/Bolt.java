package com.codegym;

public class Bolt extends Animal implements Barkable,Runable {
    private String canine;

    public Bolt(String canine) {
        this.canine = canine;
    }

    public Bolt(String name, int age, String canine) {
        super(name, age);
        this.canine = canine;
    }

    public Bolt() {
    }

    @Override
    public String toString() {
        return "Bolt{ " +
                "canine= "
                + canine
                + " name: " + super.getName()
                + " age: " + super.getAge()
                + "}";
    }

    @Override
    public void Sound() {
        System.out.println("I'm a dog, i can Barkable");
    }

    @Override
    public void Move() {
        System.out.println("I'm a dog, i can running ");
    }
}
