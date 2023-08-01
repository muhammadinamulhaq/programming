package com.abhishek.strings;

public class RemoveCharacter {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("baccad");
        System.out.println(removeChar(s, 0, 'a'));

        skip("", "baccdah");
        System.out.println(skip("baccdah"));
        System.out.println(skipApple("bdapplefg"));
        System.out.println(skipApp("bdapplfg"));
    }

    static String removeChar(StringBuilder s, int i, char c){
        if(i == s.length()){
            return "";
        }

        StringBuilder ch = new StringBuilder();
        if(s.charAt(i) != c){
            ch.append(s.charAt(i));
            return ch.append(removeChar(s, i + 1, c)).toString();
        }

        return removeChar(s, i + 1, c);
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p + ch, up.substring(1));
        }
    }

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip(up.substring(1));
        }else{
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipApp(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipApp(up.substring(3));
        }else{
            return up.charAt(0) + skipApp(up.substring(1));
        }
    }
}
