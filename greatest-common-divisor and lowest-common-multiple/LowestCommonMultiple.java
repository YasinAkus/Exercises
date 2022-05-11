package com.company;

public class LowestCommonMultiple {

    public static void findLCM(int a, int b) {

        int LMC = 1;

        for (int i = a * b; i >= 1; i--) {
            if (i % a == 0 && i % b == 0) {
                LMC = i;
            }
        }
        System.out.println("LowestCommonMultiple is " + LMC);
    }
}
