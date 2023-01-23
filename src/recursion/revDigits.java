package recursion;

public class revDigits {
    public static void main(String[] args) {
        int a = 1284;
        System.out.println(reverse(a));
         
    }

    static String reverse(int n){
        return (n%10)+""+reverse(n/10);
    }
}
