import java.util.Scanner;

public class Equ {
    public static long fact(long n){
        if(n == 1)
            return 1;
        else
            return n*fact(n-1);
    }

    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        long ans = fact(100);

        System.out.println(ans);
    }
}
