package com.learning.hacker_rank;

import java.util.*;
import java.text.*;

public class Currency_formatter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Amount : ");
        double payment = scanner.nextDouble();
        scanner.close();
        //NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
       //NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        @SuppressWarnings("deprecation")
		String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        //NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        //NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        // Write your code here.
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

