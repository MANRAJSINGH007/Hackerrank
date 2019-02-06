import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        
        int a1[][]=new int[3][3];
        int a2[][]=new int[3][3];
        int a3[][]=new int[3][3];
        int a4[][]=new int[3][3];
        int a5[][]=new int[3][3];
        int a6[][]=new int[3][3];
        int a7[][]=new int[3][3];
        int a8[][]=new int[3][3];
        
        a1[0][0]=8;
        a1[0][1]=3;
        a1[0][2]=4;
        a1[1][0]=1;
        a1[1][1]=5;
        a1[1][2]=9;
        a1[2][0]=6;
        a1[2][1]=7;
        a1[2][2]=2;
            
        a2[0][0]=4;
        a2[0][1]=9;
        a2[0][2]=2;
        a2[1][0]=3;
        a2[1][1]=5;
        a2[1][2]=7;
        a2[2][0]=8;
        a2[2][1]=1;
        a2[2][2]=6;
            
        a3[0][0]=2;
        a3[0][1]=7;
        a3[0][2]=6;
        a3[1][0]=9;
        a3[1][1]=5;
        a3[1][2]=1;
        a3[2][0]=4;
        a3[2][1]=3;
        a3[2][2]=8;
            
        a4[0][0]=6;
        a4[0][1]=1;
        a4[0][2]=8;
        a4[1][0]=7;
        a4[1][1]=5;
        a4[1][2]=3;
        a4[2][0]=2;
        a4[2][1]=9;
        a4[2][2]=4;
        
        a5[0][0]=4;
        a5[0][1]=3;
        a5[0][2]=8;
        a5[1][0]=9;
        a5[1][1]=5;
        a5[1][2]=1;
        a5[2][0]=2;
        a5[2][1]=7;
        a5[2][2]=6;
        
        a6[0][0]=2;
        a6[0][1]=9;
        a6[0][2]=4;
        a6[1][0]=7;
        a6[1][1]=5;
        a6[1][2]=3;
        a6[2][0]=6;
        a6[2][1]=1;
        a6[2][2]=8;
        
        a7[0][0]=6;
        a7[0][1]=7;
        a7[0][2]=2;
        a7[1][0]=1;
        a7[1][1]=5;
        a7[1][2]=9;
        a7[2][0]=8;
        a7[2][1]=3;
        a7[2][2]=4;
        
        a8[0][0]=8;
        a8[0][1]=1;
        a8[0][2]=6;
        a8[1][0]=3;
        a8[1][1]=5;
        a8[1][2]=7;
        a8[2][0]=4;
        a8[2][1]=9;
        a8[2][2]=2;
        
        int c1=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int diff=a1[i][j]-s[i][j];
                if(diff<0)
                {
                    diff=-diff;
                }
                
                c1+=diff;
                
            }
        }
        int c2=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int diff=a2[i][j]-s[i][j];
                if(diff<0)
                {
                    diff=-diff;
                }
                
                c2+=diff;
                
            }
        }
        int c3=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int diff=a3[i][j]-s[i][j];
                if(diff<0)
                {
                    diff=-diff;
                }
                
                c3+=diff;
                
            }
        }
        int c4=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int diff=a4[i][j]-s[i][j];
                if(diff<0)
                {
                    diff=-diff;
                }
                
                c4+=diff;
                
            }
        }
        int c5=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int diff=a5[i][j]-s[i][j];
                if(diff<0)
                {
                    diff=-diff;
                }
                
                c5+=diff;
                
            }
        }
        int c6=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int diff=a6[i][j]-s[i][j];
                if(diff<0)
                {
                    diff=-diff;
                }
                
                c6+=diff;
                
            }
        }
        int c7=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int diff=a7[i][j]-s[i][j];
                if(diff<0)
                {
                    diff=-diff;
                }
                
                c7+=diff;
                
            }
        }
        int c8=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int diff=a8[i][j]-s[i][j];
                if(diff<0)
                {
                    diff=-diff;
                }
                
                c8+=diff;
                
            }
        }
        
        int c[]=new int[8];
        c[0]=c1;
        c[1]=c2;
        c[2]=c3;
        c[3]=c4;
        c[4]=c5;
        c[5]=c6;
        c[6]=c7;
        c[7]=c8;
        Arrays.sort(c);
        return c[0];

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
