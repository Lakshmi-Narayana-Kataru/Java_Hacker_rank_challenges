package com.learning.hacker_rank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import java.time.LocalDate;

class Result {

    
    public static String findDay(int month, int day, int year) {
    	if(month>12 || day>31 ) {
    		System.out.println("Invalid input");
    	}
        LocalDate ld = LocalDate.of(year,month,day);
        return ld.getDayOfWeek().name();

    }

}

public class Date_time {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
    	Scanner sc = new Scanner(System.in);
    	
    	int month = sc.nextInt();
    	int day = sc.nextInt();
    	int year= sc.nextInt();

        String res = Result.findDay(month, day, year);
        System.out.println(res);

//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
