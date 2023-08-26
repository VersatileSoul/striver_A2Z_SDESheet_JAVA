package com.striver.basicMaths;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String str = Integer.toString(n);
        int size = str.length();

        int temp = n;
        int armStrong = 0;

        while (temp > 0) {
            int rem = temp % 10;
            armStrong += (int) Math.pow(rem, size);
            temp /= 10;
        }

        System.out.println(n == armStrong);
    }
}
