package com.abhishek;

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(arr, 'a'));
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end =  letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(letters[mid] == target){
                return letters[mid + 1];
            }else if(letters[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }

        return letters[start];
    }
}
