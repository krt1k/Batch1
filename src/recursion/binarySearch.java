package recursion;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);

        int[] arr = {1, 2, 4, 5, 6, 21, 5};
        int target = pk.nextInt();

        System.out.println(find(arr, target));
    }

    static int find(int[] arr, int target){
        return helper(arr, target, 0);
    }

    private static int helper(int[] arr, int target, int index) {
        if (index == arr.length)
            return -1;

        if (arr[index]==target)
            return index;

        return helper(arr, target, index+1);
    }
}
