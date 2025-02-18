package com.BasicPrograms1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = sc.nextInt();
        System.out.println("enter number 2");
        int num2 = sc.nextInt();
        System.out.println("enter number 3");
        int num3 = sc.nextInt();

        int average = (num1 + num2 + num3) / 3;
        System.out.println(average);
    }
}
