package Coding.Learn;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class learn_Arrays {

	public static void main(String[] args) {
		
//		1. Copying 2 arrays to third array
		int[]ar =new int[20];
		int []br = new int[10];
		for(int i=0;i<ar.length;i++) {
			ar[i]=22+i;}
		for(int i=0;i<br.length;i++) {
			br[i]=2+i;}
		System.out.println(ar);
		int [] cr = new int[30];
		System.arraycopy(ar, 0, cr, 0, ar.length);
		System.arraycopy(br, 0, cr, ar.length, br.length);
		for (int i = 0; i < cr.length; i++) {
			System.out.print(cr[i]+" ");}
		System.out.print(" ");
		
		
//		2. Write a program to count no of elements in a array that are strictly greater that given number
		int [] io = {4,5,6,1,9,3,89,-1,3,4,5,-10,1,-11,12,1,4};
		int count =0;
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		for(int i:io) {
			if(i>a) {
				count++;}
		}System.out.println(count);
		
//		3. Finding duplicates in an array
		int[] arr = {1, 2, 3, 4, 2, 5, 6, 3};
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num); }
        }
        System.out.println("Duplicate elements: " + duplicates);
		
//		4. 
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
