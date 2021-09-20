package com.learning.services;

public class CurrencyService {
	
	public static void findMinNotes(int arr[], int amount) {
		int[] arr2 =new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			
			if(amount!=0  ) {
				arr2[i]=amount/arr[i];
				amount=amount%arr[i];
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			if(arr2[i]!=0) {
				System.out.println(arr[i]+":"+arr2[i]);
			}
		}
	}

}
