import java.util.*;

public class test
{
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);

        String a = pk.next();
        int count=0;

        for (int i = 0; i < a.length()-2; i++) {
            for (int j = i+2; j < a.length(); j++) {
                if(isPalin(a.substring(i,j)))
                    count++;
            }
        }

        System.out.println(count);
    }


    public static boolean isPalin(String a){
        StringBuilder n = new StringBuilder();

        n.append(a);
        n.reverse();

        String b = n.toString();

        return a.equals(b);
    }
}
