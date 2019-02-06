import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the nonDivisibleSubset function below.
    static int nonDivisibleSubset(int k, long[] a) {
        
        int n=a.length;
        int b[]=new int[k];
        for(int i=0;i<n;i++)
        {
            int rem=(int)a[i]%k;
            b[rem]++;
        }
        int count=0;
        if(b[0]!=0)
        {
            count++;
        }
        if(k%2==0)
        {
            for(int i=1;i<k/2;i++)
            {
                int c1=b[i];
                int c2=b[k-i];
                if(c1>c2)
                {
                   count+=c1; 
                }
                else
                {
                    count+=c2;
                }
            }
            int c3=b[k/2];
            if(c3>0)
            {
                count++;
            }

        }
        else
        {
             for(int i=1;i<=k/2;i++)
            {
                int c1=b[i];
                int c2=b[k-i];
                if(c1>c2)
                {
                   count+=c1; 
                }
                else
                {
                    count+=c2;
                }
            }
            
        }
        
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        long[] S = new long[n];

        String[] SItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            long SItem = Long.parseLong(SItems[i]);
            S[i] = SItem;
        }

        int result = nonDivisibleSubset(k, S);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
