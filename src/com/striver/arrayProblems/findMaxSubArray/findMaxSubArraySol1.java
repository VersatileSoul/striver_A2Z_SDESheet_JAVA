package com.striver.arrayProblems.findMaxSubArray;

import java.util.Scanner;

public class findMaxSubArraySol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        long k = sc.nextLong();
        find(arr, size, k);
    }
    private static void find(int[] arr, int n, long k) {

        int len = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int sum = 0;
                for(int s = i; s <= j; s++) {
                    sum += arr[s];
                }
                if(sum == k) {
                    len = Math.max(len,j - i + 1);
                }
            }
        }
        System.out.println(len);
    }
}