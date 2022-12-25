import java.util.*;
public class ifSubstringThenRmv
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();//input string
        String s2=sc.nextLine();//input substring
        String ans="";
        boolean flag=true;

        do {
            if (s1.contains(s2)) {
                ans = s1.replace(s2, "");
                flag = true;
            }
            else
                flag=false;
        }while(flag);

        if(ans.length()==0)
            System.out.println("-1");
        else
            System.out.println(ans);
    }
}
