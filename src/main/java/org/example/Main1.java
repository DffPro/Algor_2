package org.example;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] N = {
                10,
                100,
                500,
                1000,
                2000,
                4000,
                8000,
                16000,
                32000,
                64000,
                128000
        };
        for (int n: N) {
            int[] arr = prepare(n);
            measure(arr, random.nextInt(arr.length));
        }
    }

    static int[] prepare(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (i + 1) * 2;
        }
        return arr;
    }

    static void measure(int[] arr, int index) {
        // warm up

        for (int i = 0; i < 3; i++) {
            algorithm(arr, index);
        }
        System.out.print(arr.length);
        System.out.print(';');
        for (int i = 0; i < 5; i++) {
            long start = System.nanoTime();
            algorithm(arr, index);
            System.out.print(System.nanoTime() - start);
            System.out.print(';');
        }
        System.out.println();
    }

    static int algorithm(int[] arr, int index) {
        return arr[index];
    }
}