package recursion;

public class sumOfDigits {
    public static void main(String[] args) {
        int a = 564327;

        System.out.println(sum(a));
    }

    private static int sum(int n) {

        if(n==0)
            return n;

        return (n%10)+sum(n/10);
    }

}
