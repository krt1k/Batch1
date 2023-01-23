import java.util.Scanner;

public class countNoOfDigits {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);

        int a = pk.nextInt();

        int count = 1;
        if(a!=0)
            count = (int) Math.log10(a)+1;

        System.out.println(count);
    }
}
