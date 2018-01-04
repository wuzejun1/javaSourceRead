package com.wuzejun.java.learning;

import java.util.Arrays;

public class StringFeature {
    public static void main(String[] args) {

        String myStr = "abc";
        /**
         * chars to get ascii int codes
         */
        System.out.println(Arrays.toString(myStr.chars().toArray()));
    }
}
