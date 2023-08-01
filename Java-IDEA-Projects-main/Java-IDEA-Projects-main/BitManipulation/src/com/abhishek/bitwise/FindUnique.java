package com.abhishek.bitwise;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};

        System.out.println(findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int ans = 0;
        for (int i: arr) {
            ans ^= i;
        }
        return ans;
    }


}
