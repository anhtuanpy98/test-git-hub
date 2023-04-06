package com.java.impl;

class Person {
    void message() {
        System.out.println("welcome");
    }
}

public class Student16 extends Person {
    void message() {
        System.out.println("welcome to java");
    }

    void display() {
        message();// gọi phương thức message() của lớp hiện tại
        super.message();// gọi phương thức message() của lớp cha
    }

    public static void main(String args[]) {
        Student16 s = new Student16();
        s.display();
    }
}
