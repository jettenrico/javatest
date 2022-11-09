package com.bcafinance.trainingday3;

import java.util.Scanner;

/*
@Author Jett A.K.A. Jett Enrico Chandra
CT0
Created with Eclipse Version 4.25.0
Created on 09-11-2022 09:18:53
Last Modified on 09-11-2022 09:18:53
Version 1.0
*/

public class TrainingDay3 {
	public static void main(String[] args) {
//		String strFirst = "Doyok";  
//		String strSecond = "Doyok"+"";
//		String strThird = "Welcome";
//		System.out.println(strFirst.equals(strSecond)); //akan menghasilkan  true
//		System.out.println(strFirst.equals(strSecond));
//		System.out.println(strThird.substring(1,6));
//
//		Scanner sc = new Scanner(System.in); 	
//		System.out.println("Masukkan apa saja: ");
//		String strB = sc.next();
//		System.out.println(strB);
		
		StringBuilder sBuilder = new StringBuilder();
		
		int panjang, lebar;
		
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Panjangnya :");
		panjang = sn.nextInt();
		
		System.out.print("Lebarnya : ");
		lebar = sn.nextInt();
		
//		System.out.println("Panjangnya adalah : " + panjang);
//		System.out.println("Lebarnya adalah : " + lebar);
//		
		System.out.println(sBuilder.append("Panjangnya adalah : ").append(panjang).toString());
		sBuilder.setLength(0);
		System.out.println(sBuilder.append("Lebarnya adalah : ").append(lebar).toString());
		
		char[] chX = {'3','4','5'};
		char[] chY = new char[3];
		chY[2] = 'F';
		
		double[] doP = new double[5];
		doP[4] = 1.5;
		
		System.out.println(doP[2]);
		
		String [][] strS = new String[2][3];
		strS[0][0] = "AB";
		strS[0][1] = "CD";
		strS[0][2] = "EF";
		strS[1][0] = "GH";
		strS[1][1] = "IJ";
		strS[1][2] = "KL";
		StringBuilder sBuild = new StringBuilder();
		String strPrintz ="";
		
		for (int i=0;i<strS.length;i++) {
			for(int j=0;j<strS[i].length;j++) {
				if(j==strS[i].length-1) {
					sBuild.setLength(0);
					strPrintz = sBuild.append(strPrintz).append(strS[i][j]).append("\n").toString();
				}else {
					sBuild.setLength(0);
					strPrintz = sBuild.append(strPrintz).append(strS[i][j]).append(",").toString();
				}
			}
		}
		System.out.println(strPrintz);
	}
}
