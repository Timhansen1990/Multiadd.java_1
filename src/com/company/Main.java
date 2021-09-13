package com.company;


public class Main {

    public static void main(String[] args) {
	// Exercise 6
        System.out.println(Multadd(1.0, 2.00, 3.0));
        // here we use our method "Multiadd".
        System.out.println(Math.sin(Math.PI/4) + (Math.cos(Math.PI/4))/2);
        // here we use the Math method to calculate the values of sinus and cos.
        System.out.println(Math.log(10) + Math.log(20));
        // here we use the Math Method to calculate the Values of Log10 and Log20 ("Bonus knowledge: Log(10) is the same as LN ")
        System.out.println(expSum(5));
        // here we use our new method expSum to calculate Euler's number.

    }
    public static double  Multadd(double a, double b, double c) {


        return a * b + c;
    }
    public static double expSum(double x){
        return x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
    }
    }

