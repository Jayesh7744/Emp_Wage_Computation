package com.empWage;

public class PartFullTime {

    public static void main(String[] args) {

//        Constant
        int isPartTime = 1;
        int isFullTime = 2;
        int empRatePerHr = 20;

//        variables
        int empHr = 0;
        int empTotalWage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;

        if (empCheck == isFullTime)
            empHr = 8;
        else if (empCheck == isPartTime)
            empHr = 4;
        empTotalWage = empHr * empRatePerHr;
        System.out.println("Total emp wage is: " + empTotalWage);
    }

}
