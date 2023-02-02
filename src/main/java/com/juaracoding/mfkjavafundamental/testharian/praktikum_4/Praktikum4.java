package com.juaracoding.mfkjavafundamental.testharian.praktikum_4;


/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Administrator a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 1/31/2023 04:11 PM
@Last Modified 1/31/2023 04:11 PM
Version 1.0
*/
import java.util.InputMismatchException;
import java.util.Scanner;
public class Praktikum4 {
	/*
			Soal Nomor 2 Praktikum 4 Java Fundamental
	*/
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int intPilih;
		int intR;
		int panjang;
		int Lebar;
		int Sisi;
		int Alas;
		int Tinggi;
		int diagonalSatu;
		int diagonalDua;

		while (true) {
			System.out.println("Pilih Method:");
			System.out.println("1. Hitung Luas Lingkaran");
			System.out.println("2. Hitung Luas Persegi Panjang");
			System.out.println("3. Hitung Luas Persegi");
			System.out.println("4. Hitung Luas Segitiga");
			System.out.println("5. Hitung Luas Belah Ketupat");
			try {
				System.out.print("Silahkan Pilih Menu : ");
				intPilih = input.nextInt();
				switch (intPilih) {
					case 1:
						System.out.println("Luas Lingkaran");
						intR = input.nextInt();
						System.out.println("Luas lingkaran : " + getLingkaran(intR));
						break;
					case 2:
						System.out.println("Luas Persegi Panjang");
						panjang = input.nextInt();
						System.out.print("Masukan lebar : ");
						Lebar = input.nextInt();
						System.out.println("Luas persegi panjang : " + getPersegiPanjang(panjang,Lebar));
						break;
					case 3:
						System.out.println("Luas Persegi");
						Sisi = input.nextInt();
						System.out.println("Luas Persegi : "+ getPersegi(Sisi));
						break;
					case 4:
						System.out.println("Luas Segitiga");
						Alas = input.nextInt();
						System.out.print("Masukan tinggi : ");
						Tinggi = input.nextInt();
						System.out.println("Luas segitiga : " + getSegitiga(Alas, Tinggi)+ " cm");
						break;
					case 5:
						System.out.println("Luas Belah Ketupat");
						diagonalSatu = input.nextInt();
						System.out.print("Masukan diagonal 2 : ");
						diagonalDua = input.nextInt();
						System.out.println("Luas belah ketupat : " + getBelahKetupat(diagonalSatu, diagonalDua) + " cm");
						break;
					default:
						System.out.println("Pilihan tidak tersedia");
						continue;
				}
			}catch (InputMismatchException e) {
				System.out.println("Input harus angka");
				input.nextLine();
				continue;
			}
			System.out.println("Apakah anda ingin memilih menu lain? (Y/N)");
			String strPilihanLanjut = input.next();
			if (!strPilihanLanjut.equalsIgnoreCase("Y")){
				break;
			}
		}
	}

	private static double getLingkaran(int r){
		double hasil;
		hasil = 3.14*Math.pow(r,2);
		return hasil;
	}

	private static Integer getPersegiPanjang(int panjang, int lebar){
		int hasil;
		hasil = panjang*lebar;
		return hasil;
	}

	private static double getPersegi(int sisi){
		double hasil;
		hasil = Math.pow(sisi,2);
		return hasil;
	}

	private static double getSegitiga(int alas, int tinggi){
		double hasil;
		hasil = 0.5*alas*tinggi;
		return hasil;
	}

	private static double getBelahKetupat(int d1,int d2){
		double hasil;
		hasil = 0.5*d1*d2;
		return hasil;
	}
}
