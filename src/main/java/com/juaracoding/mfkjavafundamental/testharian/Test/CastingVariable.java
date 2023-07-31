package com.juaracoding.mfkjavafundamental.testharian.Test;/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 06/04/2023 23:00
@Last Modified 06/04/2023 23:00
Version 1.0
*/

public class CastingVariable {
	private static float dataThird;
	private static long dataFourth;

	public static void main(String[] args){  short dataFirst = 457;
			double doubleData = dataFirst; //short ke double
			char dataSecond = 'W';
			long longData = dataSecond;//char ke long  int dataThird = 456;
			float floatData = dataThird;// int ke float  byte dataFourth = 127;
			long longDataSecond = dataFourth;//byte ke long
			float dataFifth = 565.3f;
			double doubleDataSecond = dataFifth;//float ke double  System.out.println("Short ke Double: "+ doubleData);  System.out.println("Char ke Long: "+ longData);  System.out.println("Int ke Float: "+ floatData);
			System.out.println("Byte ke Long: "+ longDataSecond);  System.out.println("Float ke Double: "+ doubleDataSecond);
		}
	}

