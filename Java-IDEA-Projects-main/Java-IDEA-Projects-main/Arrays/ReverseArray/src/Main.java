import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the count of array elements: ");
        int count = scn.nextInt();
        scn.nextLine();
        int[] array = new int[count];
        for(int i = 0; i < array.length; i++){
            array[i] = scn.nextInt();
        }

        System.out.print("Original Array: " + Arrays.toString(array));
//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }

        reverseArray(array);
        System.out.println();
        System.out.print("Reversed Array: " + Arrays.toString(array));
//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i] + " ");
//        }
    }

    private static void reverseArray(int[] array){
        for(int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}

