package com.learning.hacker_rank;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.IOException;
import java.util.Scanner;



public class Multiplication_Table {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Multiplication Table number :");
       int n = sc.nextInt();
       for(int i=1;i<=10;i++)
       {
           System.out.println(n+" x "+i+" = "+n*i);
       }
       
    }
}
