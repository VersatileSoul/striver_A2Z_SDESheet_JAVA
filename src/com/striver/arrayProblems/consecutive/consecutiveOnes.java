package com.striver.arrayProblems.consecutive;

import java.util.Scanner;

public class consecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
//        findMax(arr, size);
        findConsecutiveOnes(arr,size);
    }
    private static void findConsecutiveOnes(int[] arr, int n) {
        int cnt = 0;
        int maxi = 0;
        for(int i = 0; i < n; i++) {
            if(arr[i] == 1) {
                cnt++;
                maxi = Math.max(maxi,cnt);
            }
            else {
                cnt = 0;
            }
        }
        System.out.println(maxi);
    }
}