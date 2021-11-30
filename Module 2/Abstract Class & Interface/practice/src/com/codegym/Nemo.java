package com.codegym;

public class Nemo extends Animal implements Swimable {
  private String canine;

    public Nemo() {
    }

    public Nemo(String canine) {
        this.canine = canine;
    }

    public Nemo(String name, int age, String canine) {
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
        return "Nemo{ "
                + " canine= " + canine
                + " name= " + super.getName()
                + " age= "+ super.getAge()
                + " }";
    }

    @Override
    public void Move() {
        System.out.println("I'm a fish, i can Swim");
    }
}
