package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ilk sayiyi giriniz: ");
        int sayi1 = scan.nextInt();
        System.out.println("Lütfen ikinci sayiyi giriniz: ");
        int sayi2 = scan.nextInt();

        System.out.println("***İSLEMİNİZİ SEÇİNİZ***");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");

        System.out.println("Secimininizi giriniz: ");
        int secim = scan.nextInt();

        if(secim == 1) {
            System.out.println("Toplama isleminizin sonucu = " + (sayi1 + sayi2));
        }
        else if(secim == 2) {
            System.out.println("Çıkarma isleminizin sonucu = " + (sayi1 - sayi2));
        }
        else if(secim == 3) {
            System.out.println("Carpma isleminizin sonucu = " + (sayi1 * sayi2));
        }
        else if(secim == 4) {
            System.out.println("Bölme isleminizin sonucu = " + (float)(sayi1 / sayi2));
        }
        else {
            System.out.println("Yanlıs secim yaptınız. Seciminizi kontrol ediniz.");
        }
    }
}
