package com.company;
import java.util.Scanner;
//this basially import Scanner class



public class T_05_Userinput {
    public static void main(String[] args) {
//        to take input from the user use scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
//        System.out.println("enter the number 1");
//        int a=sc.nextInt();
//        System.out.println("enter the number 2");
//        int b= sc.nextInt();
//        int sum=a+b;
//        System.out.println(sum);
        boolean b1=sc.hasNextInt();
        System.out.println(b1);

    }
}
