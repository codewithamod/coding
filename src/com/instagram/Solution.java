package com.instagram;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Employee e1 = new Employee(10, "amod");
        Employee e2 = new Employee(1, "Joe");
        Employee e3 = new Employee(10, "Bob");

        List<Employee> lst = new ArrayList<>();
        lst.add(e1);
        lst.add(e2);
        lst.add(e3);

        Set<Employee> set = new HashSet<>(lst);
        System.out.println(set);


    }
}

class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Employee employee) {
            return employee.id == this.id;
        }
        return false;

    }
}
