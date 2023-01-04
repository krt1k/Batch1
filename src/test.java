import java.util.Scanner;

public class test{
    public static void main(String[] args){

        Scanner pk = new Scanner(System.in);

        int a1 = pk.nextInt();

        String b = pk.nextLine();

        for (int i = 0; i < b.length(); i++) {
            System.out.print(b.charAt(i)+" ");
        }


        String a = "kishoreKarthik";


        a = a.toLowerCase();

        System.out.println(a);
    }
}