import java.util.Scanner;

public class repeatingElement {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        int count=0;

        String a = pk.next();

        for (int i = 0; i < a.length(); i++) {
            count=0;
            for (int j = 0; j < a.length(); j++) {
                if(a.charAt(i) == a.charAt(j))
                    count++;
                if(count == 2) {
                    break;
                }
            }
            if(count==1)
                System.out.print(a.charAt(i)+" ");
        }
    }
}
