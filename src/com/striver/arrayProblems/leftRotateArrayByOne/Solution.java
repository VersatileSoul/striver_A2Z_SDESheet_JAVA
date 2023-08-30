package com.striver.arrayProblems.leftRotateArrayByOne;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans;
        ans =  leftRotate(arr, size);
        for(int it : ans) {
            System.out.print(it + " ");
        }
    }
    private static int[] leftRotate(int[] arr, int n) {
        int temp = arr[0];
        for(int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        return arr;
    }
}
