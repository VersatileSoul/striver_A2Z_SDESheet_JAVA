package com.striver.arrayProblems.leftRotateArrayByOne;

import java.util.Scanner;

public class rotateArrayByKElementsSolution1 {
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
        ans = rotate(arr, size,k);
        for (int it : ans) {
            System.out.print(it + " ");
        }
    }
    private static int[] rotate(int[] arr, int n,int k) {
        if( k == 0 ) return arr;
        int temp = arr[0];
        for(int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
        rotate(arr,n,k-1);
        return arr;
    }
}