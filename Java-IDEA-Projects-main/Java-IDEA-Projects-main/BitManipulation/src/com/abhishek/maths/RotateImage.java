package com.abhishek.maths;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        // nxn matrix should be provided
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length / 2; i++){
            int[] temp = matrix[i];
            matrix[i] = matrix[matrix.length - i - 1];
            matrix[matrix.length - i - 1] = temp;
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix[i].length; j++){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
            }
        }
    }
}
