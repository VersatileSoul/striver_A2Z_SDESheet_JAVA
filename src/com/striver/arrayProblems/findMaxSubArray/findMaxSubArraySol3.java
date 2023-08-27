package com.striver.arrayProblems.findMaxSubArray;

import java.util.ArrayList;
import java.util.Scanner;

public class findMaxSubArraySol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        findMax(arr,size,k);
    }
    private static void findMax(int[] arr, int n, int k) {
        ArrayList<ArrayList<Integer>> listOfList = new ArrayList<ArrayList<Integer>>();
        int left = 0, right = 0;
        int sum = arr[0];
        int maxi = 0;
        while(right < n) {
             while(sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }
            if(sum == k) {
                maxi = Math.max(maxi,right - left + 1);
            }
            right++;
            if(right < n) {
                sum += arr[right];
            }

        }
        System.out.println(maxi);
    }
}
