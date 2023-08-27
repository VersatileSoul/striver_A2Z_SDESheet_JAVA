package com.striver.arrayProblems.findNumberAppearsOnes;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        find(arr, size);
    }
    private static void find(int[] arr, int n) {
        int xor = 0;
        for(int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        System.out.println(xor);
    }
}