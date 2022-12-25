/*
The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 'C', 'G', and 'T'.

For example, "ACGAATTCCG" is a DNA sequence.
When studying DNA, it is useful to identify repeated sequences within the DNA.

Given a string s that represents a DNA sequence, return all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
You may return the answer in any order.
*/

import java.util.*;

public class Main {
    public static Set solu(String s){
        Set a = new HashSet();
        Set b = new HashSet();

        for(int i=0; i+9<s.length(); i++){
            String ten = s.substring(i, i + 10);
            if(!a.add(ten))
                b.add(ten);
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);

        String s = pk.next();

        System.out.println(solu(s));

    }
}
