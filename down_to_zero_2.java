import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static ArrayList<Integer> list=new ArrayList<Integer>();
    
    public static int func(int n, int[] dp)
    {
        if(n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        if(n<list.size())
        {
            return list.get(n);
        }
        // if(dp[n]!=0)
        // {
        //     return dp[n];
        // }
        int min=Integer.MAX_VALUE;
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                int val=1+func(n/i,dp);
                if(val<min)
                {
                    min=val;
                }
            }
        }

        int v2=1+func(n-1,dp);
        int ans=Math.min(min,v2);
        list.add(ans);
        return ans;
    }

    static int downToZero(int n) {
        
        int dp[]=new int[n+1];

        return func(n,dp);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(scanner.nextLine().trim());
        list.add(0);
        list.add(1);
        list.add(2);
        for (int qItr = 0; qItr < q; qItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = downToZero(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
