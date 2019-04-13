import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countLuck function below.
    static int count=0;
    static boolean func(char[][] ch,int sx,int sy,int dx,int dy, int i, int j)
    {
        int rows=ch.length;
        int cols=ch[0].length;
        if(i==dx && j==dy)
        {
            return true;
        }
        boolean b=false;
        ch[i][j]='X';
        int flag=-1;
        if(i!=0)
        {
            if(ch[i-1][j]=='X')
            {
                
            }
            else
            {
                boolean b1=func(ch,sx,sy,dx,dy,i-1,j);
                if(b1==false)
                {
                    flag++;
                }
                else
                {
                    b=true;
                }
            }
        }
        if(j!=0)
        {
            if(ch[i][j-1]=='X')
            {
                
            }
            else
            {
                boolean b2=func(ch,sx,sy,dx,dy,i,j-1);
                if(b2==false)
                {
                    flag++;
                }
                else
                {
                    b=true;
                }
            }
        }
        if(i!=rows-1)
        {
            if(ch[i+1][j]=='X')
            {
                
            }
            else
            {
                
                boolean b3=func(ch,sx,sy,dx,dy,i+1,j);
                if(b3==false)
                {
                    flag++;
                }
                else
                {
                    b=true;
                }
                
            }
        }
        if(j!=cols-1)
        {
            if(ch[i][j+1]=='X')
            {
                
            }
            else
            {
                
                boolean b4=func(ch,sx,sy,dx,dy,i,j+1);
                if(b4==false)
                {
                    flag++;
                }
                else
                {
                    b=true;
                }
            }
        }
        if(flag==-1)
        {
            if(b==false)
            {
                return false;
                
            }
            else
            {
                return true;
            }
        }
        else
        {
            if(b==true)
            {
                count++;
                return true;
                
            }
            else
            {
                return false;
            }
        }
        
    }
    
    
    static String countLuck(String[] matrix, int k) {
        
        int rows=matrix.length;
        int cols=matrix[0].length();
        int sx=0;
        int sy=0;
        int dx=0;
        int dy=0;
        count=0;
        int flag=0;
        for(int i=0;i<rows;i++)
        {
            String x=matrix[i];
            for(int j=0;j<cols;j++)
            {
                if(x.charAt(j)=='M')
                {
                    flag++;
                    sx=i;
                    sy=j;
                }
                if(x.charAt(j)=='*')
                {
                    flag++;
                    dx=i;
                    dy=j;
                }
                if(flag==2)
                {
                    break;
                }
            }
        }
        char ch[][]=new char[rows][cols];
        for(int i=0;i<rows;i++)
        {
            String y=matrix[i];
            for(int j=0;j<cols;j++)
            {
                ch[i][j]=y.charAt(j);
            }
        }
        
        
        boolean b=func(ch,sx,sy,dx,dy,sx,sy);
        if(count==k)
        {
            return "Impressed";
        }
        
        return "Oops!";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            String[] matrix = new String[n];

            for (int i = 0; i < n; i++) {
                String matrixItem = scanner.nextLine();
                matrix[i] = matrixItem;
            }

            int k = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = countLuck(matrix, k);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
