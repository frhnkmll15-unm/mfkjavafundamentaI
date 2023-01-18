package com.juaracoding.mfkjavafundamental.testharian.praktikum_2;

/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Administrator a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 1/18/2023 8:03 PM
@Last Modified 1/18/2023 8:03 PM
Version 1.0
*/

import java.util.Scanner;
public class Praktikum2 {
    /*
	Soal Nomor 1 Praktikum 2 Java Fundamental
    */
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Masukan Angka:");
        int Mynum = 0; double H = 0.0; int X = 0;
        try {
            for (int i = 0; i >= 0; i++)
            {
                Mynum = MyObj.nextInt();
                int[] bagi = {Mynum};
                X += bagi.length;
                H += Mynum;
            }
        }
        catch (Exception e)
        {System.out.println("Rata-rata : " + H/X);
        }
    }
}



