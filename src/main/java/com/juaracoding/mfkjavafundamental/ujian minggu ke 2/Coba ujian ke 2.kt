package com.juaracoding.mfkjavafundamental.`ujian minggu ke 2`

import java.io.OutputStream
import java.util.Scanner

class `Coba ujian ke 2` {
}
package com.juaracoding.mfkjavafundamental.cobacoba;


/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author Administrator a.k.a. Muhammad Farhan Kamil
Java Developer
Created on 1/17/2023 8:16 AM
@Last Modified 1/17/2023 8:16 AM
Version 1.0
*/

 Ujian ke 2

soal = 1
import  java.util.Random;
public class utilRandom{
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i = 0; i < 10;i++)
        {
            System.out.println("Random Number " +i+" -> "+rand.nextint(70,100));
        }
    }
}

Interval output nilai dari code perulangan diatas adalah ?

Select one:

a.70 s.d 99

soal = 2
public class Research{
    public static void main(String[] args) {
        int intloop =0;

        for (int i = 0; i < 10; i++){
            intloop++;

            for (int j = 0; j < 20; j++){
                intloop++;
            }
            System.out.println(intloop);
        }
    }

    Apa output dari code diatas ?

    Select one: c.210


soal = 3
        Seorang QA Tester diberikan akses bisa melihat code dari aplikasi, pengujian ini dinamakan….
        Select one: d.Whitebox Testing
        (White box testing atau yang dapat diartikan menjadi “pengujian kotak putih” adalah pengujian yang dilakukan untuk
         menguji perangkat lunak dengan cara menganalisa dan meneliti struktur internal dan kode dari perangkat lunak.
         Lain halnya dengan black box testing yang hanya melihat hasil input dan output dari perangkat lunak,
         pengujian white box testing berfokus pada aliran input dan output dari perangkat lunak. )


soal = 4
public class Research{
    public static void main(String[] args) {
        int intloop = 0;
        for (int i = 0; i < = 10; i++){
            intloop++;
            for(int j = 0; j < 20; j++){
                if(j==10)
                {
                    break;
                }
                intloop++;
            }
        }
        System.out.println(intloop);
    }
}

    Apa output dari code diatas ?

        Select one: c.110



soal = 5
public  class Research{
    public static void main(String[] args) {
        if( (5 < 3 )&& (7 !=2) ) {
            System.out.println("ok");
        }
        else if( ( 4 == 4 ) || !( 3 > 2 )) {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
    Apa Output dari code diatas ?

    Select one: c.YES


soal = 6
public  class Research{
    public static void main(String[] args) {
        int intloop = 0;
        for(int i = 0; i < 5; i++){
            intloop++;
            if(intloop>5)
            {
                break;
            }
            System.out.println(intloop);
        }
    }
    Apa output dari code diatas ?

    Select one: a.5


soal = 7
    Method dalam pemrograman JAVA yang digunakan untuk membandingkan 2 variabel bertipe String tanpa mengabaikan perbedaan huruf besar & kecil adalah…

    Select one: d.equals()
                (Metode equals() membandingkan dua string, dan mengembalikan true jika stringnya sama, dan false jika tidak.
                 Tip: Gunakan metode compareTo() untuk membandingkan dua string secara leksikografis.)

soal = 8
        public class GanjilGenap{
            public static void main(String[] args) {
                int angka = 11;
                if(angka%2==0) {
                    System.out.println("Angka " + angka + "adalah angka bilangan ganjil");
                }
                else {
                    System.out.println("Angka " + angka + "adalah angka bilangan ganap");
                }
            }
        }
    Apa yang salah dari code diatas ?
     Select one: b.Outputnya terbalik

soal = 9

public class Research{
    public static void main(String[] args) {
        int intloop = 0;
        for(int i = 0; i < 5; i++ ){
            if(intloop<5)
            {
                continue;
            }
            intloop++;
        }
        System.out.println(intloop);
    }
    Apa output dari code diatas ?

    Select one: a.0


soal = 10
        class Research {
            public static void main(String[] args) {
                int panjang = 0;
                Scanner sn = new Scanner(system.in);
                panjang = sn.next();
                System.out.println(Panjang);
            }
        }
    Apa yang salah dari code diatas….
    Select one: d.sn.next() seharusnya sn.nextInt()

 soal = 11
    Cara mendeklarasikan tipe data String yang benar dalam pemrograman JAVA adalah
    Select one: b.String str = “”;

 soal = 12
    public class Research {
        public static void main(String[] args) {
            String strCompare = "Kemarau";
            string output = (strCompare.equals("Kemarau")) ? "1":"2";
            System.out.println(output);}}

    Apakah output dari code diatas?
    Select one: b.2

 soal = 13
    String strCompare = "Welcome";
    System.out.println(strThird.substring(x.y));

    Berapa nilai x dan y jika mengharapkan output “elco”
    Select one: b. x=1 dan y=5

  soal = 14
    Method yang digunakan untuk menggabungkan dua variable bertipe String adalah …
    Select one: b.concat()

  soal = 15
    public class Research {
        public static void main(String[] args)
        {
            int intloop = 0;
            for (int i = 0; i < 10; i++ ){
            int intloop ++;
            for (int j = 0; j < 20; i++)
            if (j == 10) {
                break;
            }
            intloop++;
        }
            System.out.println(intloop);
        }
    }
    Apa output dari code diatas ?
    Select one: b.Error : Unresolved compilation problem

   soal = 16
       public class Research {
            public static void main(String[] args) {
               if( (5 < 3 )&& (7 !=2) )
               {
                   System.out.println("ok");
               }
               else if( ( 4 == 4 ) || !( 3 > 2 )) {
                   System.out.println("YES");
               }
               else
               {
                   System.out.println("NO");
               }
           }
       }
        Apa Output dari code diatas ?
        Select one: a.Error : Unresolved compilation problem

   soal = 17
    public class Research {
        public static void main(String[] args) {
            intloop = 0;
            boolean isGood = True;
            do{
                intloop++;
                while(isGood);
                System.out.println(isGood);
            }
        }
        Apa output dari code diatas ?
        Select one: d.Error : Unresolved compilation problem

    soal = 18
    import java.util.scanner;
        public class AyoTebak {
            Scanner scn = new Scanner (system.in );
            System.out .println("Masukan kata yang ingin di proses : ");
            String strText = scn.next();//Input Text
            String poli = "";
            StringBuilder.setLenght(0);//Hapus seluruh isiBuilder
            for(int i=strText.lenght();i>0;i++)
            {
                System.out.println(strText.substring(i - 1, i) + " i = " + i);
                strTest = strText.substring(i - 1, i);
                poli = strBuilder.append(strTest).toString();
            }
            strBuilder.setLenght(0);
            if(strText.equalsIgnoreCase(poli))
            {
                System.out.println("MERUPAKAN ANAGRAM");
            }
            else
            {
                System.out.println("Bukan Anagram");
            }
        }
        }
        Ini adalah logika program sederhana dari ?
        Select one: d.Palindrom

    soal = 19
    public class Research;
        public static void main(String[] args) {
            boolean isRemainderon = true;
            int intVal = 1200;
            String strCuaca = "Hujan";
            String strExec = "";
            if(intVal >1500)
                system.out.println(intVal);
            System.out.println(strCuaca);}}

        Apa output dari code diatas ?
        Select one: b.Hujan

    Soal = 20
        String.strSambung = "8"+3;
        system.out.println(strSambung);

        Output dari code diatas adalah
        Select one: a.83

    Soal = 21
    public class Research;
        public static void main(String[] args) {
    intChoose = 3; intChoose = 2;
    switch(intChoose)
    {
        case 1:
        system.out.println("Ini satu");break;
        case 2:
        system.out.println("Ini dua");break;
        default :
        system.out.println("Selain Satu dan dua");break;
    }
  }
}
        Apa Output dari code diatas ?
        Select one: b.Ini dua

    soal = 22
    public class Research;
        public static void main(String[] args) {
            intloop = 0;
            boolean isGood = True;
            do {
                intloop++;
                continue;
            }while(isGood);
           System.out.println(intloop);
}
}
        Apa output dari code diatas ?
        Select one: a.1

     soal = 23
        Method dalam pemrograman JAVA yang digunakan untuk membandingkan
        2 variabel bertipe String dengan mengabaikan perbedaan huruf besar & kecil adalah…
        Select one: d.equalsIgnoreCase()

     soal = 24
        public class Research;
            public static void main(String[] args) {
                int intloop = 0;
                for(int i = 0; i < 5; i++ ){
                    intloop++=;
                    continue:
                 }
                System.out.println(i);
            }
    }
    Apa output dari code diatas ?
    Select one: a.Error : Unresolved compilation problem

     soal = 25
        String strThird = "Welcome";
        System.out.println(strThird.substring(6,7));

        Apakah output dari code diatas ?
        Select one: a.e

    soal = 26
        String strThird = "Welcome";
        System.out.println(strThird.substring(x));

        Berapa nilai x jika mengharapkan output “ome”
        Select one: b.4

    soal = 27
    public class Research;
        public static void main(String[] args) {
    intloop = 0;
    for (int i = 0; i < 10; i++){
        for (int j = 0; i < 20; i++)
        {
            continue;
        }
        intloop;
    }
    System.out.println(intloop);
}
    }
    Apa output dari code diatas ?
    Select one: b.190

     soal = 28
        public class Research;
            public static void main(String[] args) {
                    intloop = 0;
                    boolean isGood = True;
                do {
                    intloop++;
                    while(isGood);
                        System.out.println(isGood);
                }
                }
            Apa output dari code diatas ?
            Select one: d.Error : Unresolved compilation problem

        soal = 29
        public class Research {
            public static void main(String[] args) {
            boolean isRemainderon = true;int j =1200;string strCuaca = "Hujan";
                String strExec = "";
                if(isRemainderon) {
                    strExec = "1";
                    System.out.println("Ini True Remainder !!");
                }
                 else if(j>1000 ) {
                    strExec = "2";
                    System.out.println("Ini J > 1000 !! ");
                }
                else if(strCuaca.equals("Hujan")) {
                    strExec = "3";
                    System.out.println("Sekarang sedang hujan!! ");
                }
                else
                { strExec = "4";
                    System.out.println("Tidak ada kondisi yang terpenuhi !! ");
                 }
                    System.out.println(strExec);}}

                Apakah Output pertama dari code diatas ?
                Select one: c.INI TRUE REMINDER

        soal = 30
         public class CompareToJava{
             public static void main(String[] args) {
                 String a = "TEA";
                 String b = "TOE";
                 System.out.println(b compareTo(a));
             }
         }
            Apa output dari code diatas ?
            Select one: c.10

 */









