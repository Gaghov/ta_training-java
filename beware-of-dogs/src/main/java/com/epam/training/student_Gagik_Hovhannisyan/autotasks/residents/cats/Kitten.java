package com.epam.training.student_Gagik_Hovhannisyan.autotasks.residents.cats;

public class Kitten extends Cat {

    public Kitten(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Kitten " + name;
    }
}
