package com.abhishek.bitwise;

public class KthBitInBinaryString {
    public static void main(String[] args) {
        System.out.println(findKthBit(1,1));
    }

    public static char findKthBit(int n, int k) {
        StringBuilder str = new StringBuilder(binaryString(n));

        return str.charAt(k - 1);
    }

    public static StringBuilder binaryString(int n){
        if(n == 1){
            return new StringBuilder("0");
        }
        StringBuilder str = new StringBuilder();
        StringBuilder prevStr = new StringBuilder();
        prevStr.append("0");

        while(n > 1){
            str.setLength(0);
            str.append(prevStr);
            str.append("1");
            str.append(reverseString(prevStr));
            prevStr.setLength(0);
            prevStr.append(str);
            n--;
        }


        return str;
    }

    public static StringBuilder reverseString(StringBuilder str){
        for(int i = 0; i < str.length(); i++){
            str.setCharAt(i, (char)(((str.charAt(i) - '0') ^ 1) + '0'));
        }

        return str.reverse();
    }
}
