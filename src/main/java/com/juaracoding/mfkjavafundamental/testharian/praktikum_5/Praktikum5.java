package com.juaracoding.mfkjavafundamental.testharian.praktikum_5;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Administrator a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 2/6/2023 12:40 AM
@Last Modified 2/6/2023 12:40 AM
Version 1.0
*/


import java.util.Scanner;

public class Praktikum5 {
	/*
       Soal Nomor 2 Praktikum 5 Java Fundamental
    */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.println("Masukan Angka yang dipilih : ");
				int intHasil = scan.nextInt();
					for (int i = 0; i < intHasil; i++) {
						for (int j = 0; j <= i; j++) {
							System.out.print("* ");
						}
						System.out.println(" ");}
				        {
						System.out.println("Apakah anda ingin memilih menu lain? (Y/N)");
						String strPilihanLanjut = scan.next();
						if(!strPilihanLanjut.equalsIgnoreCase("Y")) {
						}
					}
			   }
		   }
	   }
