package com.striver.arrayProblems.findSecondLargest_Smallest;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        findLarge(arr, size);
        findSmall(arr, size);
    }
    private static void findLarge(int[] arr, int n) {
        int max1 = arr[0];
        int max2 = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] < max1 && arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }

    private static void findSmall(int[] arr, int n) {
        int min1 = arr[0];
        int min2 = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            if(arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            }
            else if (arr[i] > min1 && arr[i] < min2){
                min2 = arr[i];
            }
        }
        System.out.println(min1);
        System.out.println(min2);
    }
 }