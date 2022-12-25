import java.util.Arrays;

//import java.util.*;
public class mazeSolvedSln
{

    public static int dx=4,dy=3,m=5,n=4;
    public static int find(int x , int y , int[][] board, int[][] sol){
        if(x<m && y<n && x>=0 && y>=0 && board[x][y]!=1 && sol[x][y]!=1){
            if(x==dx && y==dy){
                sol[x][y]=1;
                return 1;
            }
            else {
                sol[x][y]=1;
                if(find(x,y+1,board,sol)==1){
                    int z=0;
                    return 1;
                }
                if(find(x+1,y,board,sol)==1){
                    int z=0;
                    return 1;
                }
                sol[x][y]=0;
                return 0;
            }
        }
        else {
            return 0;
        }

    }

    public static void main(String[] args) {
//        Scanner ps = new Scanner(System.in);
        int[][] board = {
                {0,0,0,0,1},
                {0,1,1,0,1},
                {0,0,0,1,1},
                {1,1,0,0,0},
                {0,0,0,0,0}};

        int [][] sol = new int[m][n];

        if( find(0,0,board,sol)==1){
            for(int i=0; i<5; i++) {
                for (int j = 0; j < 4; j++)
                    System.out.print(sol[i][j]+" ");
                System.out.println();
            }
        }
        else
            System.out.println("No Solution");
    }
}