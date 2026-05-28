package com.design_pattern;

public class SingletonTest {
    public static void main(String[] args) {

        Thread t1 = new Thread(() -> {
            Student s = Student.getInstance();
            System.out.println(s.hashCode());
        });

        Thread t2 = new Thread(() -> {
            Student s1 = Student.getInstance();
            System.out.println(s1.hashCode());
        });

        t1.start();
        t2.start();
    }
}

class Student {
    private static volatile Student student;

    private Student() {
    }

    public static Student getInstance() {
        if (student == null) {
            synchronized (Student.class) {
                if (student == null) {
                    student = new Student();
                }
            }
        }

        return student;
    }

}
