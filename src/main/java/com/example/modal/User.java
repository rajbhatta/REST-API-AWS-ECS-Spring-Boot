package com.example.modal;

public class User {
    private int id;
    private String name;
    private int age;
    private float salary;

    public User(int id, String name, int age, float salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public float getSalary() {
        return salary;
    }
}
