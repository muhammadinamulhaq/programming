import java.util.Scanner;

public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count of elements in the array: ");
        int count = scn.nextInt();
        scn.nextLine();
        int[] array = readIntegers(count);
        System.out.println("Minimum element in the array: " + findMin(array));
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter a number: ");
            int number = scn.nextInt();
            scn.nextLine();
            array[i] = number;
        }

        return array;
    }

    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
