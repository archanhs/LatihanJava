package com.bcafinance.training.day2;

import java.util.Random;

/*
@Author ASUS a.k.a. Archan
ITDP 7
Created with Eclipse version 4.25.0
Created on 08-11-2022 10:21:20
Last Modified on 08-11-2022 10:21:20
Version 1.0
*/

public class CekClass {
	public static void main(String[] args) {
		
		Random ran = new Random();
		int intX = 0;
		char chY;
		String strB = "";
		for (int i = 0;i<9;i++) {
			if(i<3) {
				chY = (char) ran.nextInt(65, 91);
				strB = strB+chY;
			} else if(i<6) {
				chY = (char) ran.nextInt(97, 123);
				strB = strB+chY;
			} else {
				chY = (char) ran.nextInt(48, 58);
				strB = strB+chY;
			}
			
		}
		System.out.println(strB);
    }
}
