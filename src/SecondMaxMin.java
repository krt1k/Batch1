public class SecondMaxMin {
    public static void main(String[] args) {
        int[] array = {4, 5, 2, 1};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;//4
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1) {
                max2 = max1;
                max1 = array[i];
            } else if (array[i] > max2) {
                max2 = array[i];
            }

            if (array[i] < min1) {
                min2 = min1;
                min1 = array[i];
            } else if (array[i] < min2) {
                min2 = array[i];
            }
        }

        System.out.println("Second maximum element: " + max2);
        System.out.println("Second minimum element: " + min2);
    }
}
