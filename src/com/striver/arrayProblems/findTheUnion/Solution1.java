package com.striver.arrayProblems.findTheUnion;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Solution1 {
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
        ll = sort(a,b);
        for(int it : ll) {
            System.out.print(it + " ");
        }
    }
    private static ArrayList<Integer> sort(int[] a, int[] b) {
        Set<Integer> st = new TreeSet<>();
        for(int it : a) {
            st.add(it);
        }
        for(int it : b) {
            st.add(it);
        }
        ArrayList<Integer> ans = new ArrayList<>(st);
        return ans;
    }
}
