package com.design_pattern;

public class PrototypeTest {

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Amod");

        Employee employee1 = employee.clone();
        employee1.setName("Kunwar");
        System.out.println(employee1.getName());
        System.out.println(employee.getName());
    }
}

class Employee implements Cloneable {

    private int id;

    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
