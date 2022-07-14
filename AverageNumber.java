package com.number;

import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		float sum=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the size of an array :");
		int n=scn.nextInt();
		float[] array=new float[n];
		System.out.println("enter "+n+" elements:");
		for(int i=0; i<n;i++) {
			
			 array[i] = scn.nextInt();
	            sum=sum+array[i];
		}
	            float average = sum/n;
	            System.out.println("Average of number is : "+average);
		
		


	}

}
