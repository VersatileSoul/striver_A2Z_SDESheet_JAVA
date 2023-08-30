package com.striver.arrayProblems.isArraySorted;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        isSorted(arr, size);
    }
    private static void isSorted(int[] arr, int n) {
        int i = 0;
        for(int j = 1; j < n; j++) {
            if(arr[j] != arr[i]) {
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}