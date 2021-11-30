package com.codegym;

public abstract class Machine implements Flyable,Runable {
    private String name;
    private String type;

    public Machine() {
    }

    public Machine(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

