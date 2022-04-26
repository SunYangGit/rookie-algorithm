package com.sun.base.part.one;


/**
 * 前言：
 *
 *  给定一个数N
 *
 *  求：  1! + 2! + 3! + ... + N!
 *
 *   func1:   1 + 1x2 + 1x2x3 + ... + 1x2x3x...xN
 *   func2:   1! + 1! * 2 + 2! * 3 + 3! * 4 + ... + (N-1)!*N
 *
 *
 */
public class PreClassN {


    public static void main(String[] args) {

        System.out.println("func1 result " + func1(10));
        System.out.println("func2 result " + func2(10));

    }


    public static int func2(int n){

        int result = 0 ;
        int pre = 1;

        for (int i = 1; i <= n; i++) {
            pre = pre * i;
            result = pre + result;
        }
        return result;
    }




    public static int func1(int n){
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result = result + cal(i);
        }

        return result;
    }


    public static int  cal(int num){

        int temp = 1 ;

        for (int i = 1; i <= num; i++) {
            temp = i * temp;
        }

        return temp;
    }


}
