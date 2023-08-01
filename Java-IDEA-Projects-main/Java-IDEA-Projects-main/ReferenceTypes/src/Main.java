import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); // 10

        anotherIntValue++;

        // myIntValue not changed!!
        System.out.println("myIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); // 11

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // [0, 0, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray)); // [0, 0, 0, 0, 0]

        anotherArray[0] = 1;
        myIntArray[1] = 2;

        // both changed as both array variables contains the ref (address) of the array
        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // [1, 2, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray)); // [1, 2, 0, 0, 0]

        anotherArray = new int[] {2, 3, 4, 5, 6};
        modifyArray(myIntArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // [1, 2, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray)); // [1, 2, 0, 0, 0]
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
    }
}

