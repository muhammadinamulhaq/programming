import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++){
            int last = arr.length - i - 1;
            int maxI = max(arr, 0, last);
            swap(arr, maxI, last);
        }
    }

    public static int max(int[] arr, int start, int end){
        int max = start;
        for(int j = start; j <= end; j++){
            if(arr[max] < arr[j]){
                max = j;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
