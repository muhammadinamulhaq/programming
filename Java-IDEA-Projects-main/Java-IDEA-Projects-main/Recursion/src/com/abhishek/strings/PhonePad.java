package com.abhishek.strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
//        pad("", "12");
        System.out.println(padList("", "23").size());
        System.out.println(padCount("", "23"));
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1)*3; i < (digit * 3); i++) {
            char ch = (char)('a' + i);

            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';
        int i = (digit - 2) * 3;
        if(digit > 7){
            i += 1;
        }
        int len = i + 3;
        if(digit == 7 || digit == 9){
            len += 1;
        }
        for (; i < len; i++) {
            char ch = (char)('a' + i);

            ans.addAll(padList(p + ch, up.substring(1)));
        }

        return ans;
    }

    static int padCount(String p, String up){
        if(up.isEmpty()){
//            System.out.println(p);
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1)*3; i < (digit * 3); i++) {
            char ch = (char)('a' + i);

            count += padCount(p + ch, up.substring(1));
        }

        return count;
    }
}
