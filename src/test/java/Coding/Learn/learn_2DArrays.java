package Coding.Learn;

import java.util.Iterator;

public class learn_2DArrays {

	public static void main(String[] args) {

//		Giving a homogeneous array with similar dimension
			Object [][] data = new Object[2][2];
			data[0][0]="Avinash";
			data[0][1]="UI Tester";
			data[1][0]="Chandra";
			data[1][1]="API Tester";
			
//			System.out.println(data[0][1]);
			
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j <data.length; j++) {
				System.out.print(data[i][j]+" ");}
			System.out.println();
		}
		
		Object [][] data1 = new Object[5][2];
		data1[0][0]="Chani";data1[0][1]="UI Tester";
		data1[1][0]="Vijay";data1[1][1]="API Tester";
		data1[2][0]="Chani";data1[2][1]="UI Tester";
		data1[3][0]="Vijay";data1[3][1]="API Tester";
		data1[4][0]="Chani";data1[4][1]="UI Tester";
		System.out.println(data1.length);
		for (int i = 0; i < data1.length; i++) {
			for (int j = 0; j <data1[0].length; j++) {
				System.out.print(data1[i][j]+" ");}
			System.out.println();
		}
		
	
		
		
		
		
	}

}
