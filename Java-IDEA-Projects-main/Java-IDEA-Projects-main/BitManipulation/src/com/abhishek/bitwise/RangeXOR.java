package com.abhishek.bitwise;

public class RangeXOR {
    public static void main(String[] args) {
        // range xor of a to b = xor(b) ^ xor(a - 1)
        int a = 3;
        int b = 9;
        System.out.println(xor(9)^xor(a - 1));

        int ans2 = 0;
        // only for check, will give TLE for large numbers
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }

    // this gives xor of 0 to a
    static int xor(int a){
        if(a % 4 == 0){
            return a;
        }else if(a % 4 == 1){
            return 1;
        }else if(a % 4 == 2){
            return a + 1;
        }

        return 0;
    }
}
