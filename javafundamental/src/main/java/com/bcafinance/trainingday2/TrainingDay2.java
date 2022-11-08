package com.bcafinance.trainingday2;

import java.util.Random;

/*
@Author Jett A.K.A. Jett Enrico Chandra
CT0
Created with Eclipse Version
Created on 08-11-2022 10:19:38
Last Modified on 08-11-2022 10:19:38
Version 1.0
*/

public class TrainingDay2 {
	public static void main(String[] args) {
		char abc ='1';
		String input = "Tb@14XzM!@#i^";
		char[] asciInput = input.toCharArray();
		int total =0;
		int def = abc;
		int myVal = 35;
		int test = 0;
		int test1 =0;
		boolean reminderOn = true;
		Random ran = new Random();
		int intAsciChar=0;
		String tes = "";
		
		System.out.println(abc);
		System.out.println(def);
//		
		for (int a = 0; a<input.length(); a++) {
			if ((asciInput[a] >= 65 && asciInput[a] <= 90) ||
					(asciInput[a] >= 97 && asciInput[a] <= 122) ||
					(asciInput[a] >= 48 && asciInput[a] <= 57)) {
				total += asciInput[a];	
			}
		}
		
		System.out.println(total);
		
		for (int i = 0; i < 9; i++) {
			if (i<3) {
				intAsciChar = ran.nextInt(65,91); 
				tes += (char)intAsciChar;
			}
			else if (i<6) {
				intAsciChar = ran.nextInt(97,123); 
				tes += (char)intAsciChar;
			}
			else  {
				intAsciChar = ran.nextInt(48,58); 
				tes += (char)intAsciChar;
			}
			
		}
		
		System.out.println(tes);
		
		
//		if ( myVal > 100 ) 
//			{  if (reminderOn) {
//				myVal = myVal % 100;
//			}
//			else {
//				myVal = myVal / 100;
//			}
//			}
//		else
//		{
//		System.out.print(myVal);
//		}
//		
		for (int i = 0; i< 10; i++) {
			test++;
			for(int j =0; j < 20; j++) {
				test++;
			}
		}
		System.out.println(test);
	}
}
