import java.util.Scanner;

public class firstOccurenceChar {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
//        String str = pk.nextLine();
        String str = "kishorekarthik";
        int count = 0;
        char ans = '\0';

        for (int i=0; i< str.length(); i++){  //str = "kishorekarthik"
            count = 0;
            int j = 0;
            while (j < str.length()) {
                if((str.charAt(i)==str.charAt(j)))
                    count++;
                if(count==2) break;
                j++;
            }
            if(count==1) {
                ans = str.charAt(i);
                break;
            }
        }

        if(ans == '\0')
            System.out.println("No Unique Characters");
        else
            System.out.println("The first non-repeating element is: " + ans);

    }
}
