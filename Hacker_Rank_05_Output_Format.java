package com.learning.hacker_rank;

import java.io.*;
import java.util.*;

public class Hacker_Rank_05_Output_Format {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("================================");
        for(int i=1; i<=3; i++) {
        	System.out.print("Enter a String :");
            String s = sc.next();
            System.out.print("Enter a number :");
            int n = sc.nextInt(); 
            System.out.print(s);
            for( int j=s.length(); j<15; j++) {
                System.out.print(" ");
            } if(n<100 && n>=10) {
                System.out.println("0" + n);
            } else if(n<10) {
                System.out.println("00" + n);
            } else {
                System.out.println(n);
            }
    }
     System.out.println("================================");
    }
}
