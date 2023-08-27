package com.striver.arrayProblems.findMaxSubArray;

import java.util.ArrayList;
import java.util.Scanner;

public class findMaxSubArraySol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        long k = sc.nextLong();
        find(arr, size,k);
    }
    private static void find(int[] arr, int n, long k) {
        ArrayList<ArrayList<Integer>> listOfList = new ArrayList<ArrayList<Integer>>();
        int maxi = 0;
        for(int i = 0; i < n; i++) {
            long temp = 0;
            for(int j = i; j < n; j++) {
                temp += arr[j];
                if(temp == k) {
                    ArrayList<Integer> list = new ArrayList<>();
                    for(int m = i; m <= j; m++) {
                        list.add(arr[m]);
                    }
                    listOfList.add(list);
                    maxi = Math.max(maxi,j - i + 1);
                }
                else if ( temp > k) {
                    break;
                }
            }
        }
        System.out.println(listOfList);
        System.out.println(maxi);
    }
}