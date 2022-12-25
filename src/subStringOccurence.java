import java.util.Scanner;
public class subStringOccurence {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        String str = pk.nextLine();
        String sub = pk.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sub.charAt(0)) {
                int j = 0;
                while (j < sub.length() && i < str.length() && str.charAt(i) == sub.charAt(j)) {
                    i++;
                    j++;
                }
                if (j == sub.length()) {
                    count++;
                }
                i--;
            }
        }
        System.out.println(count);
    }
}