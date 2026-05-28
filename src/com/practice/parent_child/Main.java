package com.practice.parent_child;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.parentMethod();

        Child child = new Child();
        child.childMethod();

        Parent parent1 = new Child();
        parent1.parentMethod();

    }
}

class Parent {
    public void parentMethod() {
        System.out.println("parent method");
    }
}

class Child extends Parent {
    public void childMethod() {
        System.out.println("Child method");
    }
}
