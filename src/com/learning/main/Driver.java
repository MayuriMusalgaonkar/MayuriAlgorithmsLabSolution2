package com.learning.main;

import java.util.Scanner;

import com.learning.services.CurrencyService;
import com.learning.sorting.SortCurrencyDenomination;

public class Driver {

	public static void main(String[] args) {
   
		System.out.println("Enter the size of currency denomination:");
		
		Scanner sc = new Scanner(System.in);
		int currencySize=0;
		currencySize=sc.nextInt();
		
		if(currencySize==0) {
			System.out.println("Size should be greater than Zero");
			currencySize=sc.nextInt();
		}
		
		
		int[] currencyArray=new int[currencySize];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<currencyArray.length;i++) {
			currencyArray[i]=sc.nextInt();
			if(currencyArray[i]==0) {
				System.out.println("Enter Value greater than Zero");
				currencyArray[i]=sc.nextInt();
			}
		}
		
		SortCurrencyDenomination sortCurrencyDenomination=new SortCurrencyDenomination();		
		sortCurrencyDenomination.sort(currencyArray, 0, currencySize-1);
		
		System.out.println("Enter the amount you want to pay");	
		int amounttoPay=sc.nextInt();
		if(amounttoPay==0) {
			System.out.println("Enter Amount greater than Zero");
			amounttoPay=sc.nextInt();
		}
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		
		CurrencyService.findMinNotes(currencyArray,amounttoPay);
		

	}
	
	

}
