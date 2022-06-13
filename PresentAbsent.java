package com.empWage;

public class PresentAbsent {

    public static void main(String[] args) {

        double empCheck = Math.floor(Math.random() * 10) % 2;

        if (empCheck == 1) {
            System.out.println("Is Present");
        }
        else {
            System.out.println("Is Absent");
        }
    }

}
