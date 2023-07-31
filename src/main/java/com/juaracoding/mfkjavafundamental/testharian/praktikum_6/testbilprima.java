package com.juaracoding.mfkjavafundamental.testharian.praktikum_6;
/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 31/07/2023 12:32
@Last Modified 31/07/2023 12:32
Version 1.0
*/

import java.util.Scanner;
public class testbilprima {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int bil, cek=0;

		System.out.println("JAVA MENENTUKAN BILANGAN PRIMA ATAU BUKAN");
		System.out.print("Masukan Angka : ");
		bil=input.nextInt();

		System.out.println("----------------------------------------------");
		for (int i=2; i<=bil; i++){
			if (bil%i==0){
				cek++;
			}
		}

		if (cek==1){
			System.out.println(bil+" adalah bilangan prima");
		}else {
			System.out.println(bil+" bukan bilangan prima");
		}
	}
}
