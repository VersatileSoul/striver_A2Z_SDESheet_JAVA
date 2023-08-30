package com.striver.arrayProblems.leftRotateArrayByOne;

import java.util.Scanner;

public class rotateArrayByKElementsSolution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k = k % size;
        int[] ans;
        ans = rotate(arr, size, k);
        for (int it : ans) {
            System.out.print(it + " ");
        }
    }
    private static int[] rotate(int[] arr, int n, int k) {
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        return arr;
    }
    private static void reverse(int[] arr, int i, int j) {
        while(i <= j) {
            swap(i,j,arr);
            i++;
            j--;
        }
    }
    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}