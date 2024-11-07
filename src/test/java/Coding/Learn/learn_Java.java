package Coding.Learn;
import java.util.*;
public class learn_Java {
	public static void main(String[] args) {
		
//	1. Find the largest of 2 numbers
		try (Scanner s = new Scanner(System.in)) {
			int given = s.nextInt();
			 int a=10;
			 int b =given;
			 int c= 1;
			 if(a<b){
			     if(a<c){
			         System.out.println("a is smaller");
			     }else{
			         System.out.println("c is smaller");
			     }    
			}else if (b<c){
			     System.out.println("b is smaller");
			}else{
			     System.out.println("c is smaller");
			}
		}
		
		
//		2. Find the sum of number between a range divisible by 9 only
		int a[] = new int[15];
		int sum =0;
		for(int i=0;i<a.length;i++) {
			a[i]=(int) (i*3+6);
			System.out.print(a[i]+" ");}
		System.out.println();
		for(int ar:a) {
			if(ar%9==0) {
				sum =sum+ar;}
		}System.out.println(sum);
		
		
//		3. Fibonacci Series
		int f= 0;
		int s= 1;
		for (int i = 0; i < 10; i++) {
			int fi = f+s;  
			f=s;   
			s=fi;
			System.out.print(f+" ");}
		
//		4. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

