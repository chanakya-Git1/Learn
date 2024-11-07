package Coding.Learn;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class learn_HashMaps {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) {
		HashMap <String,String>hms = new HashMap<>();
		HashMap <String,Integer>hmsi = new HashMap<>();
		HashMap <String,String>hmis = new HashMap<>();
		HashMap <Character,Integer>hmci =new HashMap<>();
//		Adding Names
		hms.put("Chanakya","Sigumanthi");
		hms.put("VijayKanth", "Sigumanthi");
		hms.put("AvinashKumar","Sigumanthi");
//		Adding Ages
		hmsi.put("Chanakya", 29);
		hmsi.put("AvinashKumar",25);
		hmsi.put("VijayKanth", 30);
//		Adding ContactDetails
		hmis.put("Chanakya","7842243322");
		hmis.put("VijayKanth","8019394710");
		hmis.put("AvinashKumar","7075891027");
		
		for(Map.Entry<String, Integer> ei : hmsi.entrySet()) {
			System.out.println(ei);
		}
		System.out.println(hmsi.keySet());
		System.out.println(hmsi.get("Chanakya"));
		System.out.println(hmsi.values());	
		Scanner s = new Scanner(System.in);
		String in = s.nextLine();
		for (String c: hms.keySet()) {
			if(c.contentEquals(in)) {
				System.out.println(in+" "+hms.get(in)+ " Age is : "+hmsi.get(in)+" and mobile number is :"+ hmis.get(in));}
		}
		
		for (String r:hmsi.keySet()) {
			System.out.println(r +" --> "+r.length());}
		
		
		
	
//	HashMap.keySet(); --> returns Keys
//	HashMap.get(KEY); --> returns Key's value
//	HashMap.values(); --> returns Values
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
