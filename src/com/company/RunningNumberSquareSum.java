package com.company;

public class RunningNumberSquareSum {
    public static void main(String[] args){
        int lowerbound = 1;
        int upperbound = 1000;
        int sum = 0;
        int number = lowerbound;
        while (number <= upperbound){
            sum += number*number;
            ++number;
        }
        System.out.println("The sum from " + lowerbound + " to " + upperbound + " is " + sum);
    }
}
