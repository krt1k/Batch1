import java.util.*;

public class ArrayListRemoveIf{
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);

        int a = 5;
        List<Integer> al = new ArrayList<>(a);

        for (int i = 1; i <= a; i++) {
            al.add(i);
            al.add(1);

        }

        al.removeIf(i -> i%2==0);

//        for(int i=0; i<al.size(); i++)
//            al.add(i+1,1);

        for (Integer j :al) {
            System.out.print(j+" ");
        }



    }
}