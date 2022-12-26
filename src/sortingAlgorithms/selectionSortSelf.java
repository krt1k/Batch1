package sortingAlgorithms;

import java.util.*;

public class selectionSortSelf
{
    public static void main(String[] args) {

        /*Scanner pk = new Scanner(System.in);
        int size = pk.nextInt();
        int arr[] = new int[size];
        for (int i=0; i<size; i++)
            arr[i] = pk.nextInt();*/

        int size = 5;
        int[] arr = {4, 2, 5, 3, 1};

        System.out.println(Arrays.toString(selectionSort(arr,size)));

    }

    public static int[] selectionSort(int[] arr, int size){
        for(int i=0; i<size-1; i++){
            int maxPos = 0;

            for (int j = 1; j < size-i; j++) {
                if(arr[maxPos]<arr[j]){
                    maxPos = j;
                }
            }
            int temp = arr[(size-1)-i];
            arr[(size-1)-i] = arr[maxPos];
            arr[maxPos] = temp;
        }
        return arr;
    }
}

