package com.D_Method;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArg {
    public static void main(String[] args) {
       fun(1, 3, 34, 44, 4, 5, 32);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
