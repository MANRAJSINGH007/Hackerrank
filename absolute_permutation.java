import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.HashMap;

public class Solution {

    // Complete the absolutePermutation function below.
    static int[] absolutePermutation(int n, int k) {
        
        int a[]=new int[n];
        int b[]=new int[1];
        b[0]=-1;
        if(k>n)
        {
            return b;
        }
        for(int i=0;i<n;i++)
        {
          if(a[i]==0)
          {
              if(i+k<n)
              {
                  a[i]=-1;
                  a[i+k]=-1;
              }
              else
              {
                  return b;
              }
          }
            
        }
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                return b;
            }
            else
            a[i]=0;
        }
        
        for(int i=0;i<n-k;i++)
        {
            if(a[i]==0)
            {
                a[i]=i+k+1;
                a[i+k]=i+1;
            }
            
            if(i+k+1>n)
            {
                return b;
            }
        }
        return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] result = absolutePermutation(n, k);

            for (int i = 0; i < result.length; i++) {
                bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
