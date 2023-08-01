package com.abhishek.sorting;
import java.util.Scanner;

public class Merge_Sort{
    static void printArray(int arr[]){
        StringBuffer sb = new StringBuffer("");
        int n = arr.length;
        for(int i = 0; i < n; i++){
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T > 0){
            int n = sc.nextInt();

            Merge_Sort ms = new Merge_Sort();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Solution g = new Solution();

            g.mergeSort(arr, 0, arr.length - 1);

            ms.printArray(arr);
            T--;
        }
    }
}

class Solution
{
    void merge(int arr[], int l, int m, int r)
    {
        // Your code here
        int[] mix = new int[r - l + 1];
        int i = l;
        int j = m;
        int k = 0;
        while(i < m && j <= r){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }


        while(j <= r){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int a = 0; a < mix.length; a++){
            arr[l + a] = mix[a];
        }



    }
    void mergeSort(int arr[], int l, int r)
    {
        //code here
        if((r - l) == 0){
            return;
        }

        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        merge(arr, l, mid + 1, r);
    }
}
