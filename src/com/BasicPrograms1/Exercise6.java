package com.BasicPrograms1;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = sc.nextInt();
        System.out.println("enter number 2");
        int num2 = sc.nextInt();

        int addition = num1 + num2;
        int multiply = num1 * num2;
        int subtract = num1 - num2;
        int divison =   num1 / num2;
        int mod = num1 % num2;
                // % (module) gives remainder - ex 10 %3 = outputs 1 as remainder
                // / (division) gives quotent - This operator divides the left-hand number by the right-hand number, yielding the quotient. 10 / 3 = 3.33 or 3

        System.out.println("addition: " + num1 + "+" + num2+": " + addition);
        System.out.println("multiply: " + num1 + "*" + num2+": " +  multiply);
        System.out.println("subtract: " + num1 + "-" + num2+": " +  subtract);
        System.out.println("divison: " + num1 + "/" + num2+": " +  divison);
        System.out.println("mod: " + num1 + "%" + num2+": " +  mod);
    }
}
