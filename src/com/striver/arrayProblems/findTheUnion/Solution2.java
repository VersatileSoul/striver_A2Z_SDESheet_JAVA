package com.striver.arrayProblems.findTheUnion;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        ArrayList<Integer> ll;
        ll = sort(a,b,n,m);
        for(int it : ll) {
            System.out.print(it + " ");
        }
    }
    private static ArrayList<Integer> sort(int[] a, int[] b,int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < n && j < m) {
            if(a[i] < b[j]) {
                ans.add(a[i]);
                i++;
            }
            else if(a[i] > b[j]) {
                ans.add(b[j]);
                j++;
            }
            else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }
        while(i < n) {
            ans.add(a[i]);
            i++;
        }
        while(j < m) {
            ans.add(b[j]);
            j++;
        }
        return ans;
    }
}
