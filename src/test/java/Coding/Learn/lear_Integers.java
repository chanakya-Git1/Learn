package Coding.Learn;

import java.util.Collections;
import java.util.Iterator;

@SuppressWarnings("unused")
public class lear_Integers {

	public static void main(String[] args) {
		int[] nu = {1,2,3,4,6,7,9,10,12};
		int m =0;
		for (int i = 0; i < nu.length; i++) {
			System.out.print(nu[i]+" ");	
			}System.out.println();
		
//	1. Find the missing number in the given series	
		for (int i = 0; i < nu.length-1; i++) {
			if(nu[i]+1==nu[i+1]) {
				}
			else {m=nu[i]+1;
				System.out.println(m + " is the missing number");}
		}
		
		
//	2. Write a program to create a array of only even numbers from given 2 arrays
		
		int [] a = new int[10];
		int [] b = new int[12];
		int [] c = new int[22];
		for (int i = 0; i < a.length; i++) {a[i]=3+(i*3);}
		for (int i = 0; i < b.length; i++) {b[i]=2+(i*2);}
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				c[i]=a[i];}
		}
		for (int i = 0; i < b.length; i++) {
			if(b[i]%2==0) {
				c[i+a.length]=b[i];}
		}
		for (int i = 0; i < a.length; i++) {System.out.print(a[i]+" ");}
		System.out.println();
		for (int i = 0; i < b.length; i++) {System.out.print(b[i]+" ");}
		System.out.println();
		for (int i = 0; i < c.length; i++) {System.out.print(c[i]+" ");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
