package com.codegym;

public class AngryBird extends Animal implements Flyable {
    private String canine;

    public AngryBird() {
    }

    public AngryBird(String canine) {
        this.canine = canine;
    }

    public AngryBird(String name, int age, String canine) {
        super(name, age);
        this.canine = canine;
    }

    public String getCanine() {
        return canine;
    }

    public void setCanine(String canine) {
        this.canine = canine;
    }

    @Override
    public String toString() {
        return "AngryBird{"
                + " canine= " + canine
                + " name= " + super.getName()
                + " age= " + super.getAge()
                + "}";
    }

    @Override
    public void Move() {
        System.out.println("I'm a bird, i can Fly");
    }
}
