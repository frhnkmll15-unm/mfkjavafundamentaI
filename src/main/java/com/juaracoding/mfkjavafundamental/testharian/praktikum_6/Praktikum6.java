package com.juaracoding.mfkjavafundamental.testharian.praktikum_6;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Administrator a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 2/7/2023 11:04 AM
@Last Modified 2/7/2023 11:04 AM
Version 1.0
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Praktikum6 {
    /*
	Soal Nomor 2 Praktikum 6 Java Fundamental
    */
	public static void main(String[] args) {
		ArrayList<Integer> Array = new ArrayList<Integer>();
		Scanner Scan = new Scanner(System.in);
		Scanner Sc = new Scanner(System.in);
		Boolean Sum = true;
		int tampung = 0;
		int intCari = 0;
		int intPenampung;
		System.out.println("Angka yang dimasukan adalah : ");
		do {
			try {
				intPenampung = Scan.nextInt();
				Array.add(intPenampung);
			} catch (Exception e) {
				tampung = -1;
			}
		} while (tampung != -1);
		System.out.println("Hasil inputkan adalah : " + Array);
		System.out.print("Mencari angka : ");
		intCari = Sc.nextInt();
		for (int i = 0; i < Array.size(); i++) {
			if (intCari == Array.get(i)) {
				System.out.println("Angka " + intCari + " ditemukan pada index ke " + i + " urutan ke " + (i + 1) + " dari data yang di input.");
				Sum = false;
				continue;
			}
		}
		System.out.println("Angka " + intCari + " yang anda cari tidak ditemukan!");
		}
	}

