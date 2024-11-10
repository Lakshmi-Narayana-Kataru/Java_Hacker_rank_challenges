package com.learning.hacker_rank;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1= {2,2,4,4};
		int[] nums2 = {2,2,2,4,4};
		int[] arr = Mergesort(nums1,nums2);

	}

	private static int[] Mergesort(int[] nums1, int[] nums2) {
		// TODO Auto-generated method stub
		int[] arr = new int[nums1.length + nums2.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<=nums2[j]) {
				arr[k]=nums1[i];
				i++;
				k++;
			}
			else{
				arr[k]=nums2[j];
				j++;
				k++;
			}
			
		}
		while(i<nums1.length) {
			arr[k]=nums1[i];
			i++;
			k++;
		}
		while(j<nums2.length) {
			arr[k]=nums2[j];
			j++;
			k++;
		}
		System.out.println(Arrays.toString(arr));
		float sum=0;
		for(int a :arr) {
			sum = sum+a;
		}
		float result = (sum/arr.length);
		System.out.println(result);
		return arr;
	}

}
