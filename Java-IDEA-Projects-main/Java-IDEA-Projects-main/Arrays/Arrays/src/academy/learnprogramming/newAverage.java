package academy.learnprogramming;

import java.util.Scanner;

public class newAverage {
    private static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the total numbers: ");
        int n = scn.nextInt();
        int[] myIntegers = getIntegers(n);

        System.out.println("Average:" + average(myIntegers));

    }

    public static int[] getIntegers(int number){
        int[] values = new int[number];
        System.out.println("Enter " + number + " values: ");
        for(int i = 0; i < values.length; i++){
            values[i] = scn.nextInt();
        }
        return values;
    }

    public static double average(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        return (double)sum / (double)array.length;
    }
}
