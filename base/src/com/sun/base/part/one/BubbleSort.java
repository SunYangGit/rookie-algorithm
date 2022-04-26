package com.sun.base.part.one;


/**
 *  冒泡排序：
 *    将最大的数移到最右边
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] generator = ChooseSort.generator(20);
        int[] bubble = bubble(generator);
        ChooseSort.print(bubble,"BUBBLE SORT ==> ");

    }

    public static  int []  bubble(int [] a){
        if (null == a || a.length < 2){
            return  a;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0 ; j < a.length - i - 1 ; j++){
                if (a[j] > a[j+1]){
                    ChooseSort.swap(j,j+1,a);
                }
            }
        }
        return  a;
    }





}
