package com.learning.hacker_rank;

import java.io.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Hacker_Rank_03_If_Condition {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number :");
		int N = Integer.parseInt(bufferedReader.readLine().trim());

		if(N %2 !=0){
			System.out.println("Weird");
		}
		else if(N % 2 ==0 && (N>=2 && N<=5)){
			System.out.println("Not Weird");
		}
		else if(N % 2 ==0 && (N>=6 && N<=20)){
			System.out.println("Weird");
		}
		else if(N % 2 ==0 && N>20){
			System.out.println("Not Weird");
		}
		else{
			System.out.println("Invalid Input");
		}
		bufferedReader.close();
	}
}
