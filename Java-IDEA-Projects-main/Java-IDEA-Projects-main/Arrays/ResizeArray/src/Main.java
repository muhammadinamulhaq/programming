import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scn = new Scanner(System.in);
    private static int[] baseArray = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers: ");
        getInput();
        System.out.println(Arrays.toString(baseArray));
        System.out.println("Enter the new size of the array: ");
        int size = scn.nextInt();
        resizeArray(size);
        System.out.println(Arrays.toString(baseArray));
    }

    public static void getInput(){
        for(int i = 0; i < 10; i++) {
            baseArray[i] = scn.nextInt();
        }
    }

    public static void resizeArray(int size){
        int[] newArray = baseArray;
        baseArray = new int[size];
        for(int i = 0; i < 10; i++){
            baseArray[i] = newArray[i];
        }
        baseArray[10] = 11;
        baseArray[11] = 12;
    }
}
