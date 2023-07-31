package com.juaracoding.mfkjavafundamental.testharian.praktikum_6;
/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 31/07/2023 10:58
@Last Modified 31/07/2023 10:58
Version 1.0
*/

import java.util.Scanner;
public class bilanganprima {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int bil, awal, akhir;

		System.out.println("Java Bilangan Prima");
		System.out.print("Mulai dari : ");
		awal=input.nextInt();
		System.out.print("Sampai : ");
		akhir=input.nextInt();
		System.out.println("----------------------------------------------");
		for (int i=awal; i<=akhir; i++){
			bil=0;
			for (int j=1;j<=i;j++){
				if (i%j==0){
					bil=bil+1;
				}
			}
			if (bil==2){
				System.out.print(i+" ");
			}
		}
	}
}
