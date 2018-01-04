package com.wuzejun.java.learning;

import java.util.Arrays;

public class StringFeature {
    public static void main(String[] args) {

        String myStr = "abc一二三\uD852\uDF62";
        /**
         * chars to get int codes
         * [97, 98, 99, 19968, 20108, 19977, 55378, 57186]
         */
        System.out.println(Arrays.toString(myStr.chars().toArray()));
        /**
         * 这个函数跟chars的区别在于, 它对于high surrogate的码值展示是正确, 可以看到chars把这个String看成8个字符了
         * [97, 98, 99, 19968, 20108, 19977, 150370]
         */
        System.out.println(Arrays.toString(myStr.codePoints().toArray()));

        String compareStringA = "abc";
        String compareStringB = "ac";
        String compareStringC = "abc1234";
        /**
         * 对于String的每一位char比较码值大小，遇到第一组码值不相同时取差值
         * result: -1
         */
        System.out.println(compareStringA.compareTo(compareStringB));
        /**
         * 当其中一个String是另一个String的subString时，差值的意义变成长度差
         * result: -4
         */
        System.out.println(compareStringA.compareTo(compareStringC));
        /**
         * hashCode s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]
         * "gdejicbegh" 跟 "hgebcijedg" 按默认的hashCode实现是冲突的
         * result:  hashConflictA.hashCode():-801038016,hashConflictB.hashCode():-801038016,hashCode equal:true
         */
        String hashConflictA = "gdejicbegh";
        String hashConflictB = "hgebcijedg";
        System.out.println(
            "hashConflictA.hashCode():" + hashConflictA.hashCode() + ",hashConflictB.hashCode():" + hashConflictB
                .hashCode() + ",hashCode equal:" + (hashConflictA.hashCode() == hashConflictB.hashCode()));
    }
}
