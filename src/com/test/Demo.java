package com.test;

/**
 * @author guan
 * @date 2020/2/18- 15:54
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("==================");

        TextStack ts = new TextStack();
        ts.add(9);
        ts.add(8);
        ts.add(7);
        ts.add(6);
        System.out.println(ts.get());
        System.out.println(ts.get());
        System.out.println(ts.get());
        System.out.println(ts.get());
    }
}
