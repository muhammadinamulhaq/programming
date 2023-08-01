package com.abhishek.bitwise;

class FlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr: image){
            // reverse arr
            for(int i = 0; i < (arr.length + 1) / 2; i++){
                int temp = arr[i] ^ 1;
                arr[i] = arr[arr.length - i - 1] ^ 1;
                arr[image[0].length - i - 1] = temp;
            }
        }
        
        return image;
    }
}