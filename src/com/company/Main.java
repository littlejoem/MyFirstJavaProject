package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int temp = func(3,4);
        System.out.println(temp);
        int[] rAr = readArray();
        for (int j : rAr) System.out.println(j);
    }

    public static int[] readArray() {
        int[] arr;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array num: ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter num of array: " + i + " ");
            arr[i] = in.nextInt();
        }
        return arr;
    }

    public static int func(int a, int b){
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        return result;
    }
}
