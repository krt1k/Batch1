import java.util.*;

public class firstOccEff {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        String a = pk.nextLine();

        int[] charCount = new int[256];

        for (int i = 0; i < a.length(); i++) {
            charCount[a.charAt(i)]++;
        }

        for (int i = 0; i < a.length(); i++) {
            if (charCount[a.charAt(i)] == 1) {
                System.out.println("The first non-repeating character is: " + a.charAt(i));
                break;
            }
        }



    }
}
