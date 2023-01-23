package recursion;

import java.util.Scanner;

public class printInReverse {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int a = pk.nextInt();

        print(a);
        System.out.println();
        System.out.println(factorial(a));
        System.out.println(sum(a));
    }

    public static void print(int a){
        if(a==0)
            return;

        print(a-1);
        System.out.print(a+" ");
    }

    private static int factorial(int a){
        if(a<2)
            return a;

        return a*factorial(a-1);
    }

    private static int sum(int n){
        if(n==1)
            return n;

        return n+sum(n-1);
    }
}
