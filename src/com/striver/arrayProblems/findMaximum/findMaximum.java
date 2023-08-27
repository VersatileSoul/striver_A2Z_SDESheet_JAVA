package com.striver.arrayProblems.findMaximum;

import java.util.Scanner;

public class findMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        findMax(arr,size);
    }
    private static void findMax(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > maxi) {
                maxi = arr[i];
            }
        }
        System.out.println("Maximum number -> " + maxi);
    }
}
