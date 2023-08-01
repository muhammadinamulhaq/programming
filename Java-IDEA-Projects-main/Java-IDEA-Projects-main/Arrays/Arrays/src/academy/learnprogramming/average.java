package academy.learnprogramming;

import java.util.Scanner;

public class average {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println(getAverage(myIntegers));
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(i + ": " + array[i]);
        }
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum/ (double) array.length;
    }
}
