package recursion;


public class isSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 71, 45};

        if(find(arr))
            System.out.println("It is a Sorted Array.");
        else
            System.out.println("It is an Unsorted Array.");
    }

    static boolean find(int[] arr){
        return helper(arr, 0);
    }

    private static boolean helper(int[] arr, int index) {
        if (index==arr.length-1)
            return true;

        return arr[index] < arr[index+1] && helper(arr, index+1);
    }

}
