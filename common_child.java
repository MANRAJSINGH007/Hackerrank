import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the commonChild function below.
    public static int func(String s1, String s2, int[][] dp, int i, int j)
    {
        if(i==s1.length() || j==s2.length())
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j))
        {
            return dp[i][j]=1+func(s1,s2,dp,i+1,j+1);
        }

        int m1=func(s1,s2,dp,i+1,j);
        int m2=func(s1,s2,dp,i,j+1);
        if(m1>m2)
        {
            return dp[i][j]=m1;
        }
        return dp[i][j]=m2;
    }
    static int commonChild(String s1, String s2) {

        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                dp[i][j]=-1;
            }
        }

        return func(s1,s2,dp,0,0);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = commonChild(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
