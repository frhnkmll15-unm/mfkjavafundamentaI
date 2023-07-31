package com.juaracoding.mfkjavafundamental.testharian.Test;/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 06/04/2023 23:41
@Last Modified 06/04/2023 23:41
Version 1.0
*/

public class VokalKonsonan {
	public static void main(String[] args) {
		String huruf = "j";
		if(huruf.equals("a") || huruf.equals("i") || huruf.equals("u") || huruf.equals("e") || huruf.equals("o"))
		{
			System.out.println(huruf+" Adalah huruf vocal ");
		}
		else
		{
			System.out.println(huruf+" Adalah huruf konsonan");
		}
	}
}
