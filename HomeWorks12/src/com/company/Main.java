package com.company;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        float[] arr = new float[SIZE];

        calculateArrayMethodOne(arr);
        calculateArrayMethodTwo(arr);

        System.out.println("Finished");
    }

    private static void calculateArrayMethodOne(float[] arr) {
        Main calculator = new Main();

        Arrays.fill(arr, 1.5f);

        long begin = System.currentTimeMillis();

        calculator.calculate(arr, 0);

        System.out.println("Первый метод: " + (System.currentTimeMillis() - begin) + " миллисекунд");
        System.out.println(arr[0] + arr[HALF] + arr[SIZE - 1]);
    }

    private static void calculateArrayMethodTwo(float[] arr) {
        Main calculator1 = new Main();
        Main calculator2 = new Main();

        Arrays.fill(arr, 1.5f);

        long begin = System.currentTimeMillis();

        float[] halfOneArr = new float[HALF];
        float[] halfTwoArr = new float[HALF];

        System.arraycopy(arr, 0, halfOneArr, 0, HALF);
        System.arraycopy(arr, HALF, halfTwoArr, 0, HALF);

        Thread thread1 = new Thread(() -> calculator1.calculate(halfOneArr, 0));

        Thread thread2 = new Thread(() -> calculator2.calculate(halfTwoArr, HALF));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted " + e.getMessage());
        }

        System.arraycopy(halfOneArr, 0, arr, 0, HALF);
        System.arraycopy(halfTwoArr, 0, arr, HALF, HALF);

        System.out.println("Второй метод: " + (System.currentTimeMillis() - begin) + " миллисекунд");
        System.out.println(arr[0] + arr[HALF] + arr[SIZE - 1]);
    }

    private void calculate(float[] arr, int startValue) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i]
                    * Math.sin(0.2f + (i + startValue) / 5.f)
                    * Math.cos(0.2f + (i + startValue) / 5.f)
                    * Math.cos(0.4f + (i + startValue) / 2.f));
        }
    }
}