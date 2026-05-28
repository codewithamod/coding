package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SortEmployeeBySal {
    public static void main(String[] args) {

        Employee employee = new Employee(1, "amod", 1232432.00);
        Employee employee1 = new Employee(1, "vinay", 2232432.00);
        Employee employee2 = new Employee(1, "Yash", 232432.00);
        Employee employee3 = new Employee(1, "Abhi", 4232432.00);

        List<Employee> lst = new ArrayList<>();
        lst.add(employee);
        lst.add(employee1);
        lst.add(employee2);
        lst.add(employee3);

        Optional<Employee> first = lst.stream().sorted(Comparator.comparing(Employee::getSal).thenComparing(Employee::getId).reversed()).findFirst();
        System.out.println(first);

    }
}

class Employee {
    int id;
    String name;
    double sal;

    public Employee() {

    }

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
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

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}