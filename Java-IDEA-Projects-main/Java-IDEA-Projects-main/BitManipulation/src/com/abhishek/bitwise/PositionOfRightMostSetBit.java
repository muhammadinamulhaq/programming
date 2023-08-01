package com.abhishek.bitwise;

public class PositionOfRightMostSetBit {
    public static void main(String[] args) {
        System.out.println(pos(8));
    }


    // indexing from 0 (return i), if indexing from 1 (return i + 1)
    public static int pos(int num){
        if(num == 0){
            return 0;
        }
        int temp = num;
        int i = 0;
        while(temp > 0){
            if(((num >> i) & 1) == 1){
                return i;
            }
            i++;
            temp/=2;
        }
        return i;
    }
}
