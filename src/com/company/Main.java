package com.company;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        String[] split="1234 3456".split("");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0]+2);
    }
}
