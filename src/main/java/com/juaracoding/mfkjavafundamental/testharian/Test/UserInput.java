package com.juaracoding.mfkjavafundamental.testharian.Test;
/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 06/04/2023 23:31
@Last Modified 06/04/2023 23:31
Version 1.0
*/

import java.util.Scanner;


public class UserInput {
	public static void main(String[] args) {
		 int panjang,lebar;
		Scanner sn = new Scanner(System.in);

		System.out.println("Panjangnya : ");
		panjang =sn.nextInt();
		System.out.println("Lebarnya : ");
		lebar = sn.nextInt();

		System.out.println("Panjangnya : "+panjang);
		System.out.println("Lebarnya : "+ lebar);
	}
}
