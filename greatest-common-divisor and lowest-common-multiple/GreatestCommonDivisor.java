package com.company;

public class GreatestCommonDivisor {

    public static void findGCD(int a, int b) {

        int GCD=1;

        for (int i = 1; i <= a; i++) {
            if (a%i==0 && b%i==0) {
                GCD=i;
            }
        }
        System.out.println("GreatestCommonDivisor is "+GCD);
    }
}
