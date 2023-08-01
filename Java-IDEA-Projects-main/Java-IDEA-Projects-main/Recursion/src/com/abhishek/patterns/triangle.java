package com.abhishek.patterns;

public class triangle {
    public static void main(String[] args) {
        printTriangle(5, 0);
        System.out.println();
        printTriangle2(5, 0);
    }

    static void printTriangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            printTriangle(row, col + 1);
            System.out.print("*\t");
        }else{
            printTriangle(--row, 0);
            System.out.println();
        }
    }

    static void printTriangle2(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            System.out.print("*\t");
            printTriangle2(row, col + 1);
        }else{
            System.out.println();
            printTriangle2(--row, 0);
        }
    }
}
