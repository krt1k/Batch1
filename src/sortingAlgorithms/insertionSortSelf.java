package sortingAlgorithms;

import java.util.Arrays;

public class insertionSortSelf {
    public static void main(String[] args) {
        /*Scanner pk = new Scanner(System.in);
        int size = pk.nextInt();
        int[] arr = new int[size];*/

        int size = 5;
        int[] arr = {3, 5, 2, 6, 3};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(insertionSort(arr, size)));

    }

    public static int[] insertionSort(int[] arr, int size) {
        for (int i = 0; i < size-1; i++) {
            int temp = arr[i+1];

            for (int j = i; j >= 0; j--) {
                if(temp<arr[j]){
                    arr[j+1] = arr[j];
                }
                if((j==0) && (temp < arr[j]))
                    arr[j] = temp;

            }
        }
        return arr;
    }
}
