import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        String input = pk.nextLine();
        String output = rvs(input);

        System.out.println(output);
    }

    public static String rvs(String a){
        if(a.length()==1)
            return a;
        else
            return rvs(a.substring(1)) + a.charAt(0);

    }
}
