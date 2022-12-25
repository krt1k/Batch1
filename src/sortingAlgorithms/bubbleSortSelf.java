package sortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSortSelf {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);

        int size = pk.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = pk.nextInt();
        }

        /*int size = 5;
        int[] arr = {4, 5, 3, 1, 2};*/

        System.out.println(Arrays.toString(bublSort(arr, size)));
    }

    public static int[] bublSort(int[] arr, int size) {
        for (int i = 0; i < size-1; i++) {
            for (int j = 1; j < size-i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}