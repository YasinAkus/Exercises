package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Asal olup olmadığını öğrenmek istediğiniz bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;

        for(int i = 2; i < sayi; i++)
        {
            if(sayi % i == 0) {
                sayac++;
            }
        }
        if(sayac == 0) {
            System.out.println(sayi + " asal bir sayidir.");
        }
        else {
            System.out.println(sayi + " asal bir sayi değildir.");
        }
    }
}
