package com.MyFramework.Tests.Base;

import org.junit.Assert;

public class pract {

    public static void main(String[] args) {
Assert.assertEquals("not equal", 1,1);

    }
    public boolean primeNumber(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }



}
