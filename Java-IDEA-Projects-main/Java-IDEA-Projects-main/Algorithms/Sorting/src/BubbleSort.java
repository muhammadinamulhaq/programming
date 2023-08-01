import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 2, 5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                // swap logic, if the previous element is greater than the next element we swap the elements.
                    if(arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
            }

            if(!swapped){
                break;
            }
        }

    }

    private static void swap(int i, int i1) {
        int temp = i;
        i = i1;
        i1 = temp;
    }


}
