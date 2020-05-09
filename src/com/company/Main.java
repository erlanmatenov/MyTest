package com.company;


import java.util.Scanner;

public class Main {
  // Calculator code is here
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second, third, result;
        System.out.println("Insert your numbers here  ");
        first = num.nextInt();
        System.out.println("Insert your numbers here  ");
        second = num.nextInt();
        System.out.println("Insert your numbers here  ");
        third = num.nextInt();
        result = first + second + third;
        result +=1; // +=, /=, --=, *=, => changable
        System.out.println("Your number  is " + result);


    }
}
