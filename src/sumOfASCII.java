import java.util.*;
/*
Get 2 strings as input. Assume that both the strings have equal length.
        If the corresponding characters in both strings are not equal, add both the ASCII values
        Find the total of the ASCII values.

        Print the total

        If the answer is a
        1 digit number print "ONE"
        2 digit number print "TWO"
        3 digit number print "THREE"
        else print "NONE"

For example:

        Input	Result
        Hello   619
        Haido   THREE

        Trllo   196
        TRllo   THREE
*/

public class sumOfASCII{
    public static void main(String[] args){
        Scanner pk = new Scanner(System.in);

        String a = pk.next(),
                b = pk.next();
        int total=0;

        if(a.length()!=b.length())
            return;

        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) != b.charAt(i)){
                total += a.charAt(i)+b.charAt(i);
            }
        }

        //if(total == 0)
        //  return;


        String num = Integer.toString(total);

        System.out.println(total);

        if(num.length()==3)
            System.out.println("THREE");

        else if(num.length()==2)
            System.out.println("TWO");

        else if(num.length()==1)
            System.out.println("ONE");

        else
            System.out.println("NONE");
    }
}