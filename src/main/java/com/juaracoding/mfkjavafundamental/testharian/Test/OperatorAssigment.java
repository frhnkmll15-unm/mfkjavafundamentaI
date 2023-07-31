package com.juaracoding.mfkjavafundamental.testharian.Test;
/*
Created By IntelliJ IDEA 2022.1.3 (Community Edition)
Build #IC-221.5921.22, built on June 21, 2022
@Author Farhan a.k.a Muhammad Farhan Kamil
Java Developer
Created On 06/04/2023 23:12
@Last Modified 06/04/2023 23:12
Version 1.0
*/



public class OperatorAssigment {
	public static void main(String[] args) {
		int a, b, c, d, e;
		a = 5;
		b = 3;
		b = b + 1;
		c = a + b;
		d = c + c + a;
		e = (c + d) * a;

		System.out.println("Isi Variabel a: "+ a);
		System.out.println("Isi Variabel b: "+ b);
		System.out.println("Isi Variabel c: "+ c);
		System.out.println("Isi Variabel d: "+ d);
		System.out.println("Isi Variabel e: "+ e);
	}
}
