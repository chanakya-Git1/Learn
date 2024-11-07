package Coding.Learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class learn_Lists {

	@SuppressWarnings({ "unused", "unlikely-arg-type" })
	public static void main(String[] args) {

		List li =new ArrayList<>();
		int []ar = {33,4,5,2,3,4,5,6,7,8,9,};
		
		for(int a :ar) {
			li.add(a);}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		Collections.sort(li);
		System.out.println(li);
		
		
//		Replacing a specifing element using for loop
		List<String> k = new ArrayList<>();
		k.add("Chanakya");
		k.add("Reddy");
		k.add("Tester");
		k.add("Killer");
		k.add("Police");
		k.add("Getter");
		System.out.println(k);
		Scanner s = new Scanner(System.in);
		String ch = "Reddy";
		String change = "POP";
		int c=0;
		
		for (String a :k) {
			if (a.contentEquals(ch)) {
				k.remove(a);
				break;}
			else {
				c++;
			}	
		}
		System.out.println(c);
		k.add(c,change);
		System.out.println(k);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
