import java.util.Scanner;

public class mazeSolver {
    static Scanner pk = new Scanner(System.in);
    public static int m= pk.nextInt(),
            n = pk.nextInt(),
            srcX = 0, srcY = 0,
            dstX = m-1, dstY = n-1;

    public static void dest(int[][] c, int[][] d){

    }

    public static void main(String[] args) {

        int [][] mat = new int[m][n];
        int [][] solMat = new int[m][n];

        for(int i=0; i<m; i++){
            for (int j = 0; j < n; j++) {
                mat[i][j] = pk.nextInt();
                solMat[i][j] = 0;
            }
        }



    }
}
