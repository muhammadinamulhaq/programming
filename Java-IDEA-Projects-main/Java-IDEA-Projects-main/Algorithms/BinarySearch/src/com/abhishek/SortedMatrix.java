package com.abhishek;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 9;
        System.out.println(Arrays.toString(searchMatrix(arr, target)));
    }

    // search in the row provided in the cols provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }else if(matrix[row][mid] > target){
                cEnd = mid - 1;
            }else{
                cStart = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    static int[] searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while(rStart < (rEnd - 1)){ // while this is true it will have more than 2 rows remaining
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }else if(matrix[mid][cMid] > target){
                rEnd = mid;
            }else{
                rStart = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // search in 2nd half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]){
            return binarySearch(matrix, rStart, cMid+1, cols - 1, target);
        }
        // search in 3rd half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cols - 1, target);
        }
        // search in 4th half
        if(target >= matrix[rStart + 1][cMid + 1]  && target <= matrix[rStart + 1][cols - 1]){
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

        return new int[]{-1, -1};
    }
}
