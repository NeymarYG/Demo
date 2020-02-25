package com.test;

import java.util.ArrayList;

/**
 * @author guan
 * @date 2020/2/21- 16:17
 */
public class TextStack {

    int[] num;

    public TextStack() {
        num = new int[0];
    }

    //进栈
    public void add(int number) {
        int[] newArr = new int[num.length+1];
        for (int i = 0; i < num.length; i++) {
            newArr[i] = num[i];
        }
        newArr[newArr.length-1] = number;
        num = newArr;
    }

    //出栈
    public int get() {
        int number = num[num.length-1];

        int[] newArr = new int[num.length-1];
        //替换数组
        for (int i = 0; i < num.length - 1; i++) {
            newArr[i] = num[i];
        }
        //替换数组
        num = newArr;

        return number;
    }

}
