package com.D_Method;

public class Scope {

    public static void main(String[] args) {
        int a =20;
        int b= 10;
        {
            // int a = 30; ---> You can't reinitialis
            a= 30; // But you can use it
            int c = 10;
        }
       // c = 40; You cant use it
        int c = 40;

        /* Anything initialised outside a block can be used inside the block but cant be reinitialised
           and anything initialised inside the block can be reinitialised outside the block but cant be used */
    }
}
