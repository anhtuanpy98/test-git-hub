package com.java.impl;

class Bike {
    void run() {
        System.out.println("running");
    }
}

public class Splender extends Bike{
    void run() {
        System.out.println("running safely with 60km");
    }

    public static void main(String args[]) {

        // Super Class can new Sub-Class
        Bike b = new Splender();// upcasting
        b.run();

        //// Sub-Class CAN NOT new Super Class
        Splender splender = (Splender) new Bike(); // error when runtime
        splender.run();
    }

}
