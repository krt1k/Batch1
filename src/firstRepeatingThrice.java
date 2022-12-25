import java.util.*;
public class firstRepeatingThrice {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        String a = "111122333";
//        String a = pk.nextLine();
        String[] b = a.split("");
        int end = 1;
        int index = 0;

        for (int i = 0; i < b.length - 1; i++) {
            if (b[i + 1].equals(b[i])) {
                end++;
            } else {
                if (a.substring(index, end).length() == 3) {
                    System.out.println(b[index]);
                    return;
                } else {
                    index = i + 1;
                    end = index + 1;
                }
            }
        }

        // Check the last substring
        if (a.substring(index, end).length() == 3) {
            System.out.println(b[index]);
        } else {
            System.out.println("-1");
        }
    }
}
