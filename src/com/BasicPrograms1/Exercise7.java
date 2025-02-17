package com.BasicPrograms1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter table number");
        int table = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(table + "X" + i + "=" + table * i);
        }
    }
}
