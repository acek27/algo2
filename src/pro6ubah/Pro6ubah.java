/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pro6ubah;

import java.util.Scanner;

/**
 *
 * @author S855
 */
public class Pro6ubah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        project1();
//        project2();
        project3();
//        project4();
//        project5();
//        project6();
        // TODO code application logic here
    }

    public static void project1() {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan pembilang :");
        int pembil = input.nextInt();
        System.out.print("masukkan penyebut :");
        int penyebut = input.nextInt();
        int fpb = 1;
        int batas;
        if (pembil > penyebut) {
            batas = pembil / 2;
        } else {
            batas = penyebut / 2;// batas 1/2 dari jumlah karena bila fpbnya angka prima maka dapat dioperasikan
        }
        for (int i = 1; i <= batas; i++) {
            if (pembil % i == 0 && penyebut % i == 0) {
                fpb = i;
            }
        }
        int hasilpem = pembil / fpb;
        int hasilpenye = penyebut / fpb;
        if (fpb == 1) {
            System.out.println("pecahan " + pembil + "/" + penyebut + "tidak dapat disederhanakan");
        } else if (hasilpenye == 1) {
            System.out.println("pecahan " + pembil + "/" + penyebut + " dapat disederhanakan menjadi " + hasilpem);
        } else {
            System.out.println("pecahan " + pembil + "/" + penyebut + " dapat disederhanakan menjadi " + hasilpem + "/" + hasilpenye);
        }
    }

    public static void project2() {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka untuk gambar : ");
        int a = input.nextInt();
        int k = a;
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j <= a; j++) {
                if (j == k) {
                    for (int p = 1; p <= a; p++) {
                        System.out.print("*");
                    }
                    k--;
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {

                if (j == i) {
                    for (int p = 1; p <= a; p++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    public static void project3() {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka untuk susunan angka : ");
        int angka = input.nextInt();
        int kanan = angka;
        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                if (j == i) {
                    System.out.print(j);
                } else if (j == kanan) {
                    System.out.print(kanan);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
            kanan = kanan - 1;
        }
    }

    public static void project4() {
        // pake array
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan hari : "); 
        String hariawal  = input.next();
        System.out.print("masukkan angka : ");
        int n = input.nextInt();
        int index = 0;
        int hasil = 0;
        int selisih;
        String minggu[] = {"senin", "selasa", "rabu", "kamis", "jum'at", "sabtu", "minggu"};
        for (int i = 0; i < minggu.length; i++) {
            if (hariawal.equals(minggu[i])) {
                index = i;
                break;
            }
        }

        if (n > 7) {
            int k = n % 7;
            selisih = index - k;
        } else {
            selisih = index - n;
        }
        if (selisih < 0) {
            hasil = 7 + selisih;
        } else {
            hasil = selisih;
        }

        System.out.println(n + " hari yang lalu sejak hari " + hariawal + " adalah hari " + minggu[hasil]);
    }

    public static void project5() {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan banyak lantai : ");
        int hawal = input.nextInt();
        System.out.print("masukkan berat benda : ");
        int m = input.nextInt();
        int h = hawal * 1000;

        int g = 10;
        int a = m * g;
        double t = Math.sqrt((2 * h) / a);
        System.out.println("Waktu jatuh sebuah benda seberat " + m + " kg dari ketinggian " + h + " m adalah " + t + " detik.");

    }

    public static void project6() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Banyak Orang : ");
        int orang = input.nextInt();
        char CharArray[]=new char [orang];
        String NamaArray[]=new String[orang];
        for (int i = 0; i < orang; i++) {
            System.out.print("Nama Orang Ke " + (i+1) + " : ");
            String nama = input.next();
            CharArray[i]=nama.charAt(0);
            NamaArray[i]=nama;
        }
        for (int i = 0; i < orang; i++) {
            for (int j = i; j < orang; j++) {
                if(CharArray[i]>CharArray[j]){
                    String a=NamaArray[i];
                    NamaArray[i]=NamaArray[j];
                    NamaArray[j]=a;
                }
            }
        }
        for (int i = 0; i < orang; i++) {
            System.out.println(NamaArray[i]);
        }
    }
}
