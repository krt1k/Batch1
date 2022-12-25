import java.util.*;

public class thirdMinEl_sumOfPreceding {
    public static void main(String[] args) {
        Scanner pk = new Scanner(System.in);
        // 10 50 30 20
        // 30 60

        int a = pk.nextInt();
        Integer[] b = new Integer[a];

        for(int i=0; i<a; i++)
            b[i] = pk.nextInt();

        TreeSet<Integer> e = new TreeSet<Integer>(Arrays.asList(b));

        if(e.size()<3){
            System.out.println("-1");
            return;
        }

        Integer trd = getE(e,3);
        int index = 0;
        int ans = 0;

        for(int i=0; i<a; i++){
            if (b[i]==trd){
                index = i;
                break;
            }

            ans += b[i];
        }

        System.out.println(trd+" "+ans);

    }

    public static Integer getE(TreeSet<Integer> e, int n){
        int flg =0;
        for (Integer i : e) {
            flg++;
            if(flg == n)
                return i;
        }
        return -1;
    }
}
