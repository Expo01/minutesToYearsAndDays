package com.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(int minutes) {
        if (minutes < 0) {
            System.out.println("invalid entry");
        } else {
            int years = minutes / (60 * 24 * 365);
            int days = (minutes % (60 * 24 * 365)) / (60 * 24);
            System.out.println(minutes + " minutes = " + years + " years and " + days + " days.");
        }
    }
}
