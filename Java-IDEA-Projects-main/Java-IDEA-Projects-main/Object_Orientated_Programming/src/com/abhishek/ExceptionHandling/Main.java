package com.abhishek.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a =  5;
        int b = 0;
        try{
//            divide(a, b);
            // mimicking
//            throw new Exception("just for fun");
            String name = "abhi";
            if(name.equals("abhi")) throw new MyException("name is abhi");
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("normal exception");
        }finally {
            System.out.println("This will always execute");
        }

    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a / b;
    }
}
