import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the angryChildren function below.
    static long angryChildren(int k, long[] arr) {

      Arrays.sort(arr);
      int n=arr.length;

      long ans=Long.MAX_VALUE;
      
      long currAns=0;
      long sum=arr[0];
      
      for(int i=1;i<k;i++)
      {
        currAns+=(i*arr[i]-sum);
        sum+=arr[i];
        
      }
      
      if(currAns<ans)
      {
        ans=currAns;
        
      }
      
      for(int i=k;i<n;i++)
      {
        sum-=arr[i-k];
        currAns=currAns-(sum-(k-1)*arr[i-k]);
        currAns+=((k-1)*arr[i]-sum);
        if(currAns<ans)
        {
          ans=currAns;
          
        }
        
        sum+=arr[i];
        
      }

      return ans;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] packets = new long[n];

        for (int i = 0; i < n; i++) {
            long packetsItem = scanner.nextLong();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            packets[i] = packetsItem;
        }

        long result = angryChildren(k, packets);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
