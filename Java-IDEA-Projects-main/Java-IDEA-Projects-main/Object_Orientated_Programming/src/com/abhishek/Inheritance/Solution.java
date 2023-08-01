package com.abhishek.Inheritance;

import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog dog dog dog"));
    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> mp = new HashMap<>();
        String[] strs = s.split(" ");
        if(pattern.length() != strs.length){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            if(mp.containsKey(pattern.charAt(i))){
                if(!mp.get(pattern.charAt(i)).equals(strs[i])){
                    return false;
                }
            }else{
                mp.put(pattern.charAt(i), strs[i]);
            }
        }

        return true;
    }
}