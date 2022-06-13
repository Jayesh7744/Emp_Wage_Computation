package com.empWage;

public class UsingCaseStatement {
        public static final int isPartTime = 1;
        public static final int isFullTime = 2;
        public static final int empRatePerHr = 20;

        public static void main(String[] args) {

        int empHr = 0;
        int empTotalWage = 0;

       int empCheck = (int) Math.floor(Math.random() * 10) % 3;

       switch (empCheck) {
           case isFullTime:
            empHr = 8;
            break;
           case isPartTime:
            empHr = 4;
            break;
       }
        empTotalWage = empHr * empRatePerHr;
        System.out.println("Total emp wage is: " + empTotalWage);
    }

}
