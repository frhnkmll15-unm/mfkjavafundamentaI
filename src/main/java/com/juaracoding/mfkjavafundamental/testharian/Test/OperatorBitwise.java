package com.juaracoding.mfkjavafundamental.testharian.Test;
/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 06/04/2023 23:21
@Last Modified 06/04/2023 23:21
Version 1.0
*/

//Bitwise adalah operator khusus untuk menangani operasi logika bilangan biner dalam bentuk bit.
public class OperatorBitwise {
	public static void main(String[] args) {
		int a =181;
		int b =108;
		int hasil;

		hasil = a & b;
		System.out.println("Hasil dari a & b : " + hasil);

		hasil = a | b;
		System.out.println("Hasil dari a | B : "+ hasil);

		hasil = a ^ b;
		System.out.println("Hasil dari a ^ b : "+ hasil);

		hasil = ~a;
		System.out.println("Hasil dari ~ a : "+ hasil);

		hasil = a >> 1;
		System.out.println("Hasil dari a >> 1 : "+hasil);

		hasil = b << 2;
		System.out.println("Hasil dari b << 2 : "+hasil);

	}
}
