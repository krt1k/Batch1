import java.util.*;
public class backtracking1
{
    static int sx,sy,dx,dy;
    static int row,col;
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        row=5;
        col=4;
        int[][] arr ={
                {0,0,0,0,1},
                {0,1,1,0,1},
                {0,0,0,1,1},
                {1,1,0,0,0},
                {0,0,0,0,0}};
        /*for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }*/
        int[][] sol =new int[row][col];
        System.out.println("Source coordinates:");
        sx=0;
        sy=0;
        System.out.println("Destination coordinates:");
        dx=4;
        dy=3;
        if(back(sx,sy,arr,sol)==1)
        {
            /*for(int i=0;i<row;i++)
            {
                for(int j=0;j<col;j++)
                {
                    System.out.println(sol[i][j]);
                }
            }*/
            System.out.println("Valid");
        }
        else
        {
            System.out.println("No Solution");
        }
    }

    static int back(int sx, int sy, int[][] arr, int[][] sol)
    {
        if(sx<row && sy<row && sx>=0 && sy>=0 && arr[sx][sy]!=1 && sol[sx][sy]!=1)
        {
            if(dx==sx && dy==sy)
            {
                sol[sx][sy]=1;
                return 1;
            }
            else
            {
                sol[sx][sy]=1;
                if(back(sx,sy+1,arr,sol)==1)
                {
                    return 1;
                }
                if(back(sx+1,sy,arr,sol)==1)
                {
                    return 1;
                }
                sol[sx][sy]=0;
                return 0;
            }
        }
        else
        {
            return 0;
        }
    }
}