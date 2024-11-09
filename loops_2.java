package com.learning.hacker_rank;

import java.io.*;
import java.util.*;

public class loops_2 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int Q=sc.nextInt();
      //int result = 0;
      for(int i=0;i<Q;i++)
      {
          int a=sc.nextInt();
          int b=sc.nextInt();
          int n=sc.nextInt();
          for(int j=0;j<n;j++)
          {
              a=a+(int)Math.pow(2,j)*b;
              System.out.print(a+" ");
          }
          System.out.println();
      }
      
    }
}
