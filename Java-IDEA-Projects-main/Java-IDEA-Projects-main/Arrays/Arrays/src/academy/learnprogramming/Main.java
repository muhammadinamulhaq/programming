package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myIntArray = new int[25];
//        myIntArray[5] = 50;
        double[] myDoubleArray = new double[10];

        for(int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = i * 10;
        }
//        for(int i = 0; i < myIntArray.length; i++){
//            System.out.println(i + ": " + myIntArray[i]);
//        }
//        System.out.println(myIntArray[5]);
            printArray(myIntArray);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(i + ": " + array[i]);
        }
    }
}
