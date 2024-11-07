package Coding.Learn;
import java.util.*;
@SuppressWarnings("unused")
public class learn_Strings {

	public static void main(String[] args) {
//		1. Counting the number of vowels present in a given string
		String str = "asdeegghjklqtyuioprequkrujnvcnmamkoryuridk";
	      int v= 0;
	        for(char c : str.toCharArray()){
	         if(c=='e'){v++;}
	         else if(c=='a'){v++;}
	         else if(c=='i'){v++;}
	         else if(c=='o'){v++;}
	         else if(c=='u'){v++;}
	      }System.out.println(v);

//	    2. Convert first letter of given string words to uppercase
	      String given = "sigumanthi chanakya chandra kanth reddy";
	      String gi="";
	      String []st = given.split(" ");
	      System.out.println(st.length);
	      System.out.println(given);
	      for(int i = 0;i<st.length;i++){
	          char cc= st[i].charAt(0);
	          gi=Character.toUpperCase(cc)+st[i].substring(1);
	          System.out.print(gi+" ");
	      }System.out.println();
	    
	      
//	      3. Finding total number of upper and lower case letters in given string
	      String str1= "Sigumanthi Avinash Kumar Reddy";
	      int lo=0;
	      int up=0;
	      for(char c1 : str1.toCharArray()) {
	    	  if(Character.isUpperCase(c1)) {
	    		  up++;
	    	  }else if(Character.isLowerCase(c1)) {
	    		 lo++; 
	    	  }
	      }System.out.println("Total nnumber of UpperCase letters are :"+up);
	       System.out.println("Total number of LowerCase letters are :"+lo);
	      
	      StringBuffer s = new StringBuffer(str1);
	      String out = s.insert(7, given).toString();
	      System.out.println(out);
	    	  
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	}

}
