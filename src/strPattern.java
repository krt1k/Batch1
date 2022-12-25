import java.util.Scanner;

public class strPattern {

    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int a = pk.nextInt();

        for (int i = 1; i <= a; i++) {
            if(i >= (a/2)+1) {
                for (int j = 1; j <= (2*a)-1; j++) {
                    System.out.println("*");
                }
            }
            else {
                for (int j = 0; j <= 2 ; j++) {

                }
            }
            System.out.println();
        }
    }
}