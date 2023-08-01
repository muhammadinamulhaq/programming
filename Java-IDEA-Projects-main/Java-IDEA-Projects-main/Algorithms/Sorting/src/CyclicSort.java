import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        for(int i = 0; i < arr.length;){
            if(arr[i] != arr[arr[i] - 1])
            {
                swap(arr, i, arr[i] - 1);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
