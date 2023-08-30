package com.striver.arrayProblems.isArraySorted;

import java.util.Scanner;

public class Solution1 {
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
        int flag = 1;
        for(int i = 1; i < n; i++) {
            if(arr[i] < arr[i - 1]) {
                flag = 0;
                break;
            }
        }
        if(flag == 1)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
}