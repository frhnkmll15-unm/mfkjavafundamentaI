package com.juaracoding.mfkjavafundamental.testharian.praktikum_1;


/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Administrator a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 1/15/2023 04:11 PM
@Last Modified 1/15/2023 04:11 PM
Version 1.0
*/

import java.util.Scanner;

public class Praktikum1 {
    public static void main(String[] args) {
        Scanner MyObj = new Scanner(System.in);
        System.out.println("Masukkan Kata : ");
        String strKata = MyObj.nextLine();

        char charMyLetter = 'I'; int intMynum = 0; int intMyObj = 0;
        for (int i=0; i<strKata.length(); i++)
        {
            charMyLetter = strKata.charAt(i);
            intMynum = charMyLetter;
            if ((intMynum>=48 && intMynum<=57) || (intMynum>=32 && intMynum<=47) || (intMynum>=64 && intMynum<=89))
            {
                intMyObj=intMyObj+intMynum;
            }
            System.out.println("Index Ke-"+i+" Adalah Huruf "+strKata.charAt(i));
        }
        System.out.println("Hasil : "+intMyObj);
    }
}