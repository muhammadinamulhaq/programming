package com.abhishek;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();

        String revStr = "";

        for(int i = str.length() - 1; i >= 0; i--){
            revStr += str.charAt(i);
        }
        boolean flag = true;
//        System.out.println(revStr);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != revStr.charAt(i)){
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}
