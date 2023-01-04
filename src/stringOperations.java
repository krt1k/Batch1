import java.util.Scanner;

/*
java:
Write a program to do the following string operations

1. Get a string.
2. Convert all vowels to its uppercase and consonants to its lower case.
3. Replace all vowels in the string with the first vowel from the left.
4. Remove all upper case 'S' from the string.
5. remove the second occurrence of "tr" from the string.
6. print the result string.
*/
public class stringOperations {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);

//        1. Get a string.
        String a = pk.nextLine().toLowerCase();
        String[] arr = a.split("");

//        2. Convert all vowels to its uppercase and consonants to its lower case.
        for (int i = 0; i < a.length(); i++) {
            if(isVowel(arr[i]))
                arr[i] = arr[i].toUpperCase();
        }

//        3. Replace all vowels in the string with the first vowel from the left.
        String firstVowel="";

        for (String i :arr) {
            if (isVowel(i)) {
                firstVowel = i;
                break;
            }
        }

        for (int i=0; i<a.length(); i++) {
            if (isVowel(arr[i])) {
                arr[i] = firstVowel;
            }
        }

//        4. Remove all upper case 'S' from the string.
        for (int i=0; i<a.length(); i++) {
            if (arr[i].equals("s")) {
                arr[i] = "";
            }
        }

        String resultEff = "";

        for (String i :arr) {
            resultEff += i;
        }

        resultEff = resultEff.replaceAll("s","").replaceFirst("tr","``")
                .replaceFirst("tr","").replaceFirst("``","tr");

//        5. remove the second occurrence of "tr" from the string.

        for (int i=0; i<a.length(); i++) {
            if (arr[i].equals("s")) {
                arr[i] = "";
            }
        }

        String result="";
        for (String i:arr) result += i;

        int index = result.indexOf("tr");
        if(index != -1) {
            index = result.indexOf("tr", index + 1);
            result = result.substring(0,index) + result.substring(index+2);
        }

        System.out.println(result);
        System.out.println(resultEff);
    }

    private static boolean isVowel(String s) {
        return s.equals("A") || s.equals("E") || s.equals("I") || s.equals("O") || s.equals("U") ||
                s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u");
    }
}

/*
For example:

Input                   Result
indastratrgtrsSou       IndItrIgtrII

aeioubrtrartrstrings    AAAAAbrtrArtrAng

*/