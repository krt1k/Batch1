import java.util.Scanner;

public class factorial {
    public static void main(String[] args)
    {
        Scanner pk = new Scanner(System.in);
        int n = pk.nextInt();
        System.out.println(fact(n));
    }
// factorial recursive function
    public static int fact(int n)
    {
        if (n==0)
            return 1;
        else
            return n*(fact(n-1));
    }
}