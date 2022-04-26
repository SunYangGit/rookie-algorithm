package com.sun.base.part.one;


/**
 * 选择排序：
 * <p>
 * 每次选择 从 (i,N-1) 中最小的数 与  第 i 个元素交换位置
 */
public class ChooseSort {


    public static void main(String[] args) {

        int[] generator = generator(20);
        int[] choose = choose(generator);
        print(choose, "CHOOSE SORT RESULT ==>");

    }


    public static int[] choose(int[] a) {
        if (null == a || a.length < 2) {
            return a;
        }

        for (int i = 0; i < a.length; i++) {

            int minIndex = i;

            for (int j = i; j < a.length; j++) {
                minIndex = a[minIndex] > a[j] ? j : minIndex;
            }

            swap(i, minIndex, a);
        }

        return a;
    }


    public static void swap(int a, int b, int[] c) {
        int temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }


    public static int[] generator(int n) {

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = (int) (Math.random() * n) + 1;
        }

        print(res, "GENERATOR==>");

        return res;
    }


    public static void print(int[] a, String code) {

        StringBuffer stringBuffer = new StringBuffer();

        for (int i : a) {
            stringBuffer.append(i + " ,");
        }

        String substring = stringBuffer.substring(0, stringBuffer.length() - 1);

        System.out.println(code + "[" + substring + "]");
    }

}
