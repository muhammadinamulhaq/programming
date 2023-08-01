package com.abhishek.maths;

public class sqrt {
    public static void main(String[] args) {
//        if(x <= 1){
//            return x;
//        }
        int n = 40;
        int p = 3;
        System.out.printf("%.3f",sqrtx(n, p));
    }

    public static double sqrtx(int x, int p){
        int start = 0;
        int end = x;
        double root = 0.0;
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(mid*mid == x){
                return mid;
            }else if(mid*mid > x){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        double incr = 0.1;

        for (int i = 0; i < p; i++) {
            while(root*root <= x){
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        
        return root;
    }
}
